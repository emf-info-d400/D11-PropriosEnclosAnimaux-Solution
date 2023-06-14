package models;

public class Proprietaire {
   
   private final String nom;
   private final String prenom;

   public Proprietaire(String nom, String prenom) {
      this.nom = nom;
      this.prenom = prenom;
   }

   public String getNom() {
      return nom;
   }

   public String getPrenom() {
      return prenom;
   }

   @Override
   public String toString() {
      return prenom + " " + nom;
   }

}
