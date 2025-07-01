package models;

public class Voiture {
    private final int numero;
    private final String nomEquipe;

    public Voiture(int numero, String nomEquipe) {
        this.numero = numero;
        this.nomEquipe = nomEquipe;
    }

    public int getNumero() {
        return numero;
    }

    public String getNomEquipe() {
        return nomEquipe;
    }

    @Override
    public String toString() {

        // MR Le formatage du numéro de la voiture est incorrect
        // Il faut utiliser un DecimalFormat pour afficher le numéro avec un zéro devant ('000')
        // De plus, la sortie ne correspond pas à la consigne demandée
        return "Voiture [numero=" + numero + ", nomEquipe=" + nomEquipe + "]";
    }

}
