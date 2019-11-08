package Bilar;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarCompany[] bilar = {new BMW(), new Volvo(), new MercedesBenz()};
		for(CarCompany bilarna : bilar) {
		
		System.out.println(bilarna.name);
		
		bilarna.modell();
		
		bilarna.yearModel();
		
		bilarna.pris();
		
		bilarna.maxHastighet();
		
		System.out.println("");
		
		
		}
		
	}

}
