import java.util.Scanner;

public class Silmukka {

	public static void main(String[] args) {
		
		juomaAutomaatti omaKone = new juomaAutomaatti();
		
		int luku = 0;
		
	Scanner lukija = new Scanner(System.in);
	
	// loputon silmukka, joka kysyy juomaa

	for(;;) { // Tämän funktiota en ymmärtänyt? Tuo do-while silmukkahan hoitaa jo homman
	
	do {
		System.out.println("********Juoma Automaatti********");
		System.out.println("1. Kahvi");
		System.out.println("2. Tee");
		System.out.println("3. Kaakao");
		System.out.println("4. Lopeta");
		System.out.println();
		

		System.out.println("********************************");
		
		luku = lukija.nextInt();
		
		if (luku == 1) {
			omaKone.valmistaKahvi();
			System.out.println(omaKone);
			System.out.println();
		}
		else if (luku == 2) {
			omaKone.valmistaTee();
			System.out.println(omaKone);
			System.out.println();
		}
		else if (luku == 3) {
			omaKone.valmistaKaakao();
			System.out.println(omaKone);
			System.out.println();
		}
		
	}
	while (luku < 4);
	System.out.println("Kiitos asioinnista!");
	System.out.println();
	System.out.println("********************************");

	
	}
}
}
