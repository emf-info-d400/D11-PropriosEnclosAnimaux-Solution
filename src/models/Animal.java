package models;

import java.text.DecimalFormat;

public class Animal {

   private Proprietaire proprietaire;
   private final String type;
   private final int numero;
   private final boolean estHerbivore;

   public Animal(Proprietaire proprietaire, String type, int numero, boolean estHerbivore) {
      this.proprietaire = proprietaire;
      this.type = type;
      this.numero = numero;
      this.estHerbivore = estHerbivore;
   }

   public Proprietaire getProprietaire() {
      return proprietaire;
   }

   public String getType() {
      return type;
   }

   public int getNumero() {
      return numero;
   }

   public boolean isEstHerbivore() {
      return estHerbivore;
   }

   public void setProprietaire(Proprietaire proprietaire) {
      this.proprietaire = proprietaire;
   }

   @Override
   public String toString() {
      DecimalFormat df = new DecimalFormat("0000");
      return "N°" + df.format(numero) + "-" + type + "-Propriété de " + proprietaire;
   }

}
