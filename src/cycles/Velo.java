package cycles;


public class Velo {

	private int braquet;
	private double vitesse;

	public Velo(int braquet) {
		this.braquet = braquet;
		this.vitesse = 0;
	}

	public int getBraquet() {
		return braquet;
	}

	public double getVitesse() {
		return vitesse;
	}

	public void setBraquet(int braquet) {
		this.braquet = braquet;
	}

	public void accelerer(double increment) {
		vitesse += increment;
	}

	public double getPuissance(double frequenceCoupsDePedale) {
		return braquet * frequenceCoupsDePedale;
	}

	@Override
	public String toString() {
		return "Velo [braquet=" + braquet + ", vitesse=" + vitesse + "]";
	}

	// TEST
	public static void main(String[] args) {
		Velo v = new Velo(3);
		v.accelerer(10);
		System.out.println(v);
		System.out.println("Puissance: " + v.getPuissance(2));
	}
}