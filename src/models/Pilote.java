package models;

public class Pilote {
    public static int NOMBRE_PNEUS_EN_RESERVE = 16;
    private final String nom;
    private final String nationalite;
    private int nombrePoints;
    private int nombreCours;
    private int nombreVictoires;
    private int nombrePodiums;
    private Pneu[] pneusEnReserve;
    private Voiture voiture;

    public Pilote(String nom, String nationalite) {
        this.nom = nom;
        this.nationalite = nationalite;

        voiture = null;
        // MR Il faut initialiser le tableau pneusEnReserve avec la taille
        // NOMBRE_PNEUS_EN_RESERVE
        pneusEnReserve = null;
        nombrePoints = 0;
        nombreCours = 0;
        nombreVictoires = 0;
        nombrePodiums = 0;
    }

    public Pilote(String nom, String nationalite, Voiture voiture) {
        this.nom = nom;
        this.nationalite = nationalite;
        this.voiture = voiture;

        voiture = null;
        // MR Il faut initialiser le tableau pneusEnReserve avec la taille
        // NOMBRE_PNEUS_EN_RESERVE
        pneusEnReserve = null;
        nombrePoints = 0;
        nombreCours = 0;
        nombreVictoires = 0;
        nombrePodiums = 0;

    }

    public boolean deposerPneuEnReserve(Pneu pneu) {
        boolean reserve = false;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            // MR Il faut vérifier si il y a de la place dans le tableau pneusEnReserve,
            // pour pouvoir déposer le pneu
            if (reserve) {
                reserve = true;
                //
                break;
            } else {
                reserve = false;
            }
        }
        return reserve;
    }

    public Pneu retirerPneuEnReserve(TypePneu type) {
        // MR Il faut créer un Pneu vide (null) pour le retourner si on ne trouve pas de
        // pneu de ce type
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (type != null) {
                // MR Il faut vérifier si le pneu de type demandé est présent dans le tableau
                // pneusEnReserve
            }
        }
        return null;
    }

    // MR Il faut vérifier si le pneu reçu paramètre se trouve dans le tableau
    // pneusEnReserve
    public int compterNombrePneusEnReserveDeType(TypePneu type) {
        int compteur = 0;
        String[] typep = new String[3];
        for (int i = 0; i < typep.length; i++) {

            compteur++;
        }
        return compteur;
    }

    public int getNombrePneusEnReserve() {
        //MR Tu dois créer un compteur pour compter le nombre de pneus en réserve et pas utiliser la constante
        NOMBRE_PNEUS_EN_RESERVE = 0;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            NOMBRE_PNEUS_EN_RESERVE++;
        }
        return NOMBRE_PNEUS_EN_RESERVE;
    }

    public Pneu[] getPneusEnReserveSansTrou() {
        //MR Il faut créer un tableau de la taille des pneus présents en réserve (getNombrePneusEnReserve())
        Pneu[] newliste = new Pneu[NOMBRE_PNEUS_EN_RESERVE];
        for (int i = 0; i < newliste.length; i++) {
            //MR Il faut vérifier si le pneu n'est pas null avant de l'ajouter au tableau
            newliste[i] = pneusEnReserve[i];
        }
        return pneusEnReserve;
    }

    public String pressionMoyenneDesPneusEnReserveFormatee() {
        double moyennepression = 0.00;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            //
        }
        return null;
    }

    public int supprimerPneusDePressionInferieure(double pression) {
        int pneuSupprimer = 0;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            //MR Il faut utiliser pneu.getPression() pour obtenir la pression du pneu et 1.4 doit être replacé par pression
            if (pression < 1.4) {
                //MR La tu définis le tableau pneusEnReserve à null, ce qui n'est pas correct
                pneusEnReserve = null;
                pneuSupprimer++;
            }
        }
        return pneuSupprimer;
    }

    public boolean ajouterLotDePneus(Pneu[] pneus) {
        boolean pneuAjouter = false;
        for (int i = 0; i < pneusEnReserve.length; i++) {
            if (pneusEnReserve[i] != null) {
                pneuAjouter = true;
            }
        }
        return pneuAjouter;
    }

    public String getNom() {
        return nom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public int getNombrePoints() {
        return nombrePoints;
    }

    public void setNombrePoints(int nombrePoints) {
        this.nombrePoints = nombrePoints;
    }

    public int getNombreCours() {
        return nombreCours;
    }

    public void setNombreCours(int nombreCours) {
        this.nombreCours = nombreCours;
    }

    public int getNombreVictoires() {
        return nombreVictoires;
    }

    public void setNombreVictoires(int nombreVictoires) {
        this.nombreVictoires = nombreVictoires;
    }

    public int getNombrePodiums() {
        return nombrePodiums;
    }

    public void setNombrePodiums(int nombrePodiums) {
        this.nombrePodiums = nombrePodiums;
    }

    @Override
    public String toString() {

        String resultat;

        resultat = "Pilote: " + nom + "(" + nationalite + ")\n";

        if (voiture != null) {
            voiture.getNomEquipe();
            //MR Il faut récupérer le nom de l'équipe dans la variable nomEquipe
            String nomEquipe = null;
            voiture.getNomEquipe();
            //MR Il faut récupérer le numéro de la voiture dans la variable numero
            int numero = 0;

            resultat += "-> Voiture " + nomEquipe + "(" + numero + ")\n";
            resultat += "-> Points: " + nombrePoints + "\n";
            resultat += "-> Courses: " + nombreCours + "\n";
            resultat += "-> Victoires: " + nombreVictoires + "\n";
            resultat += "-> Poduims: " + nombrePodiums + "\n";
        } else {
            resultat += "-> Pas de voiture assignée.\n";
        }

        for (int i = 0; i < pneusEnReserve.length; i++) {
            Pneu pneu = pneusEnReserve[i];

            if (pneu != null) {
                pneu.getType();
                //MR Il faut récupérer le type de pneu dans la variable type
                TypePneu type = null;

                resultat += "-> Pneu en réserve: " + type + "\n";
            }
        }

        return resultat;
    }

}
