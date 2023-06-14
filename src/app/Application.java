package app;

import models.Animal;
import models.Enclos;
import models.Proprietaire;

public class Application {

    public static int numeroAnimal = 1;

    public static Animal genereAnimalAleatoire(Proprietaire proprietaire) {
        String[] typeAnimal = { "Cheval", "Vache", "Chèvre", "Poule", "Chien", "Porc" };
        int indiceAnimal = (int) (Math.random() * typeAnimal.length);
        return new Animal(proprietaire, typeAnimal[indiceAnimal], numeroAnimal++, indiceAnimal < 3);
    }

    public static void main(String[] args) {

        // Création de 8 enclos chacun avec 8 places...
        Enclos[] enclos = new Enclos[8];
        for (int i = 0; i < enclos.length; i++) {
            enclos[i] = new Enclos(8);
        }

        // Création des 4 propriétaires...
        /*
         * Proprietaire[] proprietaires = new Proprietaire[4];
         * proprietaires[0] = new Proprietaire("Duprévert", "Mario");
         * proprietaires[1] = new Proprietaire("Duchampsec", "Paul");
         * proprietaires[2] = new Proprietaire("Dupaturage", "Fred");
         * proprietaires[3] = new Proprietaire("Delaprairie", "Tom");
         */
        Proprietaire[] proprietaires = new Proprietaire[] {
                new Proprietaire("Duprévert", "Mario"),
                new Proprietaire("Duchampsec", "Paul"),
                new Proprietaire("Dupaturage", "Fred"),
                new Proprietaire("Delaprairie", "Tom")
        };

        // Pour chaque propriétaire...
        for (int i = 0; i < proprietaires.length; i++) {
            
            // Mettre la main sur le propriétaire
            Proprietaire proprietaire = proprietaires[i];

            // Création des 10 animaux pour chaque propriétaire
            for (int j = 0; j < 10; j++) {

                // Générer un animal aléatoire associé à ce propriétaire
                Animal animal = genereAnimalAleatoire(proprietaire);

                // Tenter de trouver de la place dans l'un ou l'autre des enclos.
                // On les teste les uns après les autres et on arrête si l'un est OK
                for (int k = 0; k < enclos.length; k++) {

                    // Pour pouvoir le mettre là, soit :
                    //   a) l'enclos est vide
                    //   b) l'enclos n'est pas plein + on est herbivore + cet enclos contient au moins
                    //      un herbivore
                    //   c) l'enclos n'est pas plein + on n'est pas herbivore + cet enclos ne contient
                    //      aucun herbivores

                    boolean conditionA = enclos[k].estVide();
                    boolean conditionB = enclos[k].encoreDeLaPlace() && animal.isEstHerbivore()
                            && enclos[k].contienUnHerbivore();
                    boolean conditionC = enclos[k].encoreDeLaPlace() && !animal.isEstHerbivore()
                            && !enclos[k].contienUnHerbivore();
                    if (conditionA || conditionB || conditionC) {
                        boolean reussi = enclos[k].placerAnimal(animal);
                        if (!reussi) {
                            System.out.println(
                                    "ERREUR : pas réussi à placer cet animal alors qu'il y avait de la place !");
                            System.exit(0);
                        }
                        // C'est bon, il est placé, inutile de regarder dans les autres enclos !
                        break;
                    }
                }
            }
        }

        // Afficher le contenu des enclos
        for (int i = 0; i < enclos.length; i++) {
            System.out.println("Contenu de l'enclos N°" + (i + 1));
            Animal animal = enclos[i].retirerProchainAnimal();
            while (animal != null) {
                System.out.println("   " + animal);
                animal = enclos[i].retirerProchainAnimal();
            }
        }
    }
}
