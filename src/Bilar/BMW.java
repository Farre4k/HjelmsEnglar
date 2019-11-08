package Bilar;

public class BMW extends CarCompany {
	
	public BMW(){
		super.name = "BMW";
	}

	@Override
	void pris() {
		// TODO Auto-generated method stub
		System.out.println("600000 kr");
	}

	@Override
	void modell() {
		// TODO Auto-generated method stub
		System.out.println("M2");
	}

	@Override
	void maxHastighet() {
		// TODO Auto-generated method stub
		System.out.println("270 km/h");
	}


}
