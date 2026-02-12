package cycles;


public class VeloElec extends Velo {

	private double puissanceMoteur;

	public VeloElec(int braquet, double puissanceMoteur) {
		super(braquet);
		this.puissanceMoteur = puissanceMoteur;
	}

	public double getPuissanceMoteur() {
		return puissanceMoteur;
	}

	public void setPuissanceMoteur(double puissanceMoteur) {
		this.puissanceMoteur = puissanceMoteur;
	}

	@Override
	public double getPuissance(double frequenceCoupsDePedale) {
		return super.getPuissance(frequenceCoupsDePedale) + puissanceMoteur;
	}

	@Override
	public String toString() {
		return "VeloElec [" + super.toString() +
				", puissanceMoteur=" + puissanceMoteur + "]";
	}

	// TEST
	public static void main(String[] args) {
		VeloElec ve = new VeloElec(3, 50);
		ve.accelerer(15);
		System.out.println(ve);
		System.out.println("Puissance totale: " + ve.getPuissance(2));
	}
}