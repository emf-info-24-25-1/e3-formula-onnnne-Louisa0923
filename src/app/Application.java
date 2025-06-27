package app;

import models.Pilote;
import models.Pneu;
import models.TypePneu;
import models.Voiture;

public class Application {
    
        public static void main(String[] args) {
             
    
            // ---------------------------------------------------------------------------------------
            // Etape 1 : Création d'une voiture de Formule 1
            // ---------------------------------------------------------------------------------------
                Voiture voiture = new Voiture(0, null);
            // ---------------------------------------------------------------------------------------
            // Etape 2 : Afficher la voiture
            // ---------------------------------------------------------------------------------------
                System.out.println(voiture);
            // ---------------------------------------------------------------------------------------
            // Etape 3 : Création d'un pilote de Formule 1 et afficher ses informations
            // ---------------------------------------------------------------------------------------
                Pilote Pilote = new Pilote("Leclerc", "Monégasque");
                Pilote Pilote = new Pilote(null, null, voiture);
                Pilote Pilote = new compterNombrePneusEnReserveDeType(NOMBRE_PNEUS_EN_RESERVE);
        // ---------------------------------------------------------------------------------------
        // Etape 4 : Afficher le Pilote
        // ---------------------------------------------------------------------------------------
            System.out.println(Pilote);
        // ---------------------------------------------------------------------------------------
        // Etape 5 : Tests des méthodes de la classe Pilote
        // ---------------------------------------------------------------------------------------
      
        // deposerPneuEnReserve() 5 fois de types différents
        int[] deposer = new int[5];
        for (int i = 0; i < deposer.length; i++) {
            Pilote.deposerPneuEnReserve(null);

        }

        // retirerPneuEnReserve() de type TENDRE_ROUGE et l'afficher

        System.out.println(Pilote.retirerPneuEnReserve(TENDRE_ROUGE));

        // getNombrePneusEnReserve() et afficher le nombre de pneus en réserve
        System.out.println(Pilote.getNombrePneusEnReserve());
        for (int i = 0; i < deposer.length; i++) {
            
        }

        // getPneusEnReserveSansTrous() et afficher les pneus en réserve
        System.out.println(Pilote.getPneusEnReserveSansTrou());
            //System.out.println(pneusEnReserve);

        // pressionMoyenneDesPneusEnReserveFormatee() et afficher la pression moyenne des
        // pneus
        System.out.println(Pilote.pressionMoyenneDesPneusEnReserveFormatee());

        // compterNombrePneusEnReserveDeType() et afficher le nombre de pneus en réserve
        // de type DUR_BLANC
           
        System.out.println(Pilote.compterNombrePneusEnReserveDeType(DUR_BLANC));
       
        // Créer les 3 pneus et ajout le lot de pneus pour le pilote et afficher réussi
        // ou échoué

        TypePneu Enum = DUR_BLANC;
        TypePneu Enum = MEDIUM_JEUNE;
        TypePneu Enum = TENDRE_ROUGE;

        // Supprimer les pneus de pression inférieure à 1.4 et afficher le nombre de
        // pneus supprimés
            Pilote.supprimerPneusDePressionInferieure(0);
        // ---------------------------------------------------------------------------------------
    }
}
