package Bilar;

public class Volvo extends CarCompany {



	public Volvo() {
		// TODO Auto-generated constructor stub
		super.name = "Volvo";
	
	}
	

@Override
void pris() {
	// TODO Auto-generated method stub
	System.out.println("300000 kr");
}

@Override
void modell() {
	// TODO Auto-generated method stub
	System.out.println("V4");
}

@Override
void maxHastighet() {
	// TODO Auto-generated method stub
	System.out.println("240 km/h");
}
}