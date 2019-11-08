package Bilar;

public class MercedesBenz extends CarCompany {

	public MercedesBenz() {
		// TODO Auto-generated constructor stub
		super.name = "MercedesBenz";
	}

	@Override
	void pris() {
		// TODO Auto-generated method stub
		System.out.println("400000 kr");
	}

	@Override
	void modell() {
		// TODO Auto-generated method stub
		System.out.println("C-Klass");
	}

	@Override
	void maxHastighet() {
		// TODO Auto-generated method stub
		System.out.println("250 Km/h");
	}

}
