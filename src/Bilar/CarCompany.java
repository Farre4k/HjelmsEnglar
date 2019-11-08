package Bilar;

abstract class CarCompany{
	
	public void yearModel(){
		System.out.println("2019");
	}
	
	protected String name;
	
	abstract void modell();
	
	abstract void pris();
	
	abstract void maxHastighet();
	
	
	
}

