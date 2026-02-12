package cycles;

public class VeloElec extends Velo {

    private static double DEFAULT_FACTEUR_PUISSANCE_MOTEUR = 15.0;

    private double facteurPuissanceMoteur;

    public VeloElec(double braquet, double diamRoue, double facteurPuissance) {
        super(braquet, diamRoue);
        this.facteurPuissanceMoteur = facteurPuissance;
    }

    public VeloElec() {
        super();
        this.facteurPuissanceMoteur = DEFAULT_FACTEUR_PUISSANCE_MOTEUR;
    }

    public double getFacteurPuissanceMoteur() {
        return facteurPuissanceMoteur;
    }

    public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
        this.facteurPuissanceMoteur = facteurPuissanceMoteur;
    }

    @Override
    public double getPuissance(double frequence) {
        return super.getPuissance(frequence) * facteurPuissanceMoteur;
    }

    @Override
    public String toString() {
        return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "] "
                + super.toString();
    }

    // ===== TEST DIRECT =====
    public static void main(String[] args) {

        VeloElec ve1 = new VeloElec(12, 26, 20);
        System.out.println(ve1);
        System.out.println("Puissance : " + ve1.getPuissance(90));

        VeloElec ve2 = new VeloElec();
        System.out.println(ve2);
        System.out.println("Puissance : " + ve2.getPuissance(80));
    }
}
