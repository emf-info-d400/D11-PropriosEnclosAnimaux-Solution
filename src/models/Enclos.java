package models;

public class Enclos {

   private Animal[] animaux;

   public Enclos(int tailleEnclos) {
      // On créée de la place pour ce nombre d'animaux
      animaux = new Animal[tailleEnclos];
   }

   public boolean estVide() {

      // Jusqu'à preuve du contraire, on est bien vide !
      boolean estOnVide = true;

      // On se promène dans l'ensemble de l'enclos à la recherche d'un animal
      for (int i = 0; i < animaux.length; i++) {
         // Animal trouvé ?
         if (animaux[i] != null) {
            // Oui, donc on est pas vides !
            estOnVide = false;
            // Arrêter de chercher davantage, on sait qu'on n'est pas vide !
            break;
         }
      }

      return estOnVide;
   }

   public boolean estPlein() {

      // Jusqu'à preuve du contraire, on est plein !
      boolean estOnPlein = true;

      // On se promène dans l'ensemble de l'enclos à la recherche d'une place libre
      for (int i = 0; i < animaux.length; i++) {
         // Place libre trouvée ?
         if (animaux[i] == null) {
            // Oui, donc on est pas pleins !
            estOnPlein = false;
            // Arrêter de chercher davantage de places libres, on sait qu'on n'est pas
            // pleins !
            break;
         }
      }

      return estOnPlein;
   }
   public boolean encoreDeLaPlace() {
      return !estPlein(); // C'est pas logique ça ? 8-)
   }

   public int nbreAnimauxContenus() {

      // Pour le moment on n'a pas encore d'animaux !
      int nbreTotalAnimaux = 0;

      // On se promène dans l'ensemble de l'enclos à la recherche d'un animal
      for (int i = 0; i < animaux.length; i++) {
         // Y a-t-il un animal à cet endroit ?
         if (animaux[i] != null) {
            // Oui ben on en a vu un de plus ! Et on continue de fouiller l'enclos...
            nbreTotalAnimaux++;
         }
      }

      return nbreTotalAnimaux;
   }

   public int placeEncoreDisponible() {
      return animaux.length - nbreAnimauxContenus(); // C'est pas logique ça ? 8-)
   }

   public int placeEncoreDisponibleV2() {

      // Pour le moment on n'a pas encore vu de place(s) libre(s)
      int nbrePlacesDisponibles = 0;

      // On se promène dans l'ensemble de l'enclos à la recherche de place(s) libre(s)
      for (int i = 0; i < animaux.length; i++) {
         // Y a-t-il une place libre à cet endroit ?
         if (animaux[i] == null) {
            // Oui ben on en a vu une de plus ! Et on continue de fouiller l'enclos...
            nbrePlacesDisponibles++;
         }
      }

      return nbrePlacesDisponibles;
   }

   public boolean placerAnimal(Animal animal) {

      // Pour le moment rien ne dit qu'on trouvera de la place pour le mettre cet
      // animal
      boolean placementReussi = false;

      // Pas d'animal à placer => rien à faire !
      if (animal != null) {
         // On se promène dans l'ensemble de l'enclos à la recherche de place(s) libre(s)
         for (int i = 0; i < animaux.length; i++) {
            // Y a-t-il une place libre à cet endroit ?
            if (animaux[i] == null) {
               // Oui, alors on y met et animal
               animaux[i] = animal;
               // On a réussi à faire le job !
               placementReussi = true;
               // On arrête de chercher de la place libre, le job est fait !
               break;
            }
         }
      }

      return placementReussi;
   }

   public Animal retirerProchainAnimal() {

      // Par défaut et jusqu'à preuve du contraire, on n'a pas trouvé d'animaux dans cet enclos 
      Animal animalRetire = null;

      // On se promène dans l'ensemble de l'enclos à la recherche d'un animal
      for (int i = 0; i < animaux.length; i++) {
         // Y a-t-il un animal à cet endroit ?
         if (animaux[i] != null) {
               // Oui, alors se souvenir de l'animal qui va sortir de l'enclos
               animalRetire = animaux[i];
               // Le sortir de l'enclos (donc cette place devient libre quoi)
               animaux[i] = null;
               // On arrête de chercher d'autres animaux, il ne fallait en trouver qu'un seul, le job est fait !
               break;
         }
      }

      return animalRetire;
   }

   public boolean contienUnHerbivore() {

      // Jusqu'à preuve du contraire, ce n'est pas le cas !
      boolean herbivoreTrouve = false;

      // On se promène dans l'ensemble de l'enclos à la recherche d'un animal
      for (int i = 0; i < animaux.length; i++) {
         // Animal trouvé ?
         if (animaux[i] != null) {
            // Est-ce un herbivore ?
            if (animaux[i].isEstHerbivore()) {
               // Oui, herbivore trouvé !
               herbivoreTrouve = true;
               // Inutile de chercher davantage, on en a trouvé au moins un !
               break;
            }
         }
      }

      return herbivoreTrouve;
   }

}
