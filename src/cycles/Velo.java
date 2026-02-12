package cycles;
import java.util.Random;

public class Velo {

    private static double DEFAULT_BRAQUET = 13.0;

    private double braquet;
    private double diamRoue;
    private Random genAlea;

    public Velo(double braquet, double diamRoue) {
        this.braquet = braquet;
        this.diamRoue = diamRoue;
        this.genAlea = new Random();
    }

    public Velo(double braquet) {
        this(braquet, 26.0);
    }

    public Velo() {
        this(DEFAULT_BRAQUET, 26.0);
    }

    public static double getDEFAULT_BRAQUET() {
        return DEFAULT_BRAQUET;
    }

    public static void setDEFAULT_BRAQUET(double value) {
        DEFAULT_BRAQUET = value;
    }

    public double getBraquet() {
        return braquet;
    }

    public void setBraquet(double braquet) {
        this.braquet = braquet;
    }

    public double getDiamRoue() {
        return diamRoue;
    }

    public void setDiamRoue(double diamRoue) {
        this.diamRoue = diamRoue;
    }

    public double getPuissance(double frequence) {
        return frequence * braquet * diamRoue * genAlea.nextDouble();
    }

    @Override
    public String toString() {
        return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
    }

    // TEST 
    public static void main(String[] args) {

        Velo v1 = new Velo(12, 26);
        System.out.println(v1);
        System.out.println("Puissance : " + v1.getPuissance(90));

        Velo v2 = new Velo();
        System.out.println(v2);
        System.out.println("Puissance : " + v2.getPuissance(80));
    }
}
