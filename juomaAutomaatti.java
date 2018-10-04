
public class juomaAutomaatti {
	
	// M‰‰ritet‰‰n muuttujat
			
		private int teet‰;
		private int kahvia;
		private int kaakaota;
		
		// Alustetaan konstruktori
		
		public juomaAutomaatti(){
			this.teet‰ = 50;
			this.kahvia = 50;
			this.kaakaota = 50;
		}
		
		// Asetetaan getterit ja setterit
		
		public int getteet‰() {
			return this.teet‰;
		}
		
		public void setteet‰(int uusiteet‰) {
			this.teet‰ = uusiteet‰;
		}
		
		public int getkahvia() {
			return this.kahvia;
		}
		
		public void setkahvia(int uusikahvia) {
			this.teet‰ = uusikahvia;
		}
		
		public int getkaakaota() {
			return this.kaakaota;
		}
				
		public void setkaakaota(int uusikaakaota) {
			this.teet‰ = uusikaakaota;
		}
		
		// Luodaan metodit valmistaTee, valmistaKahvi ja valmistaKaakao
		
		public void valmistaTee() {			
			if(this.teet‰ - 10 < 0) {
				this.teet‰ = 0;
				System.out.println("Teet‰ ei ole en‰‰ j‰ljell‰, t‰yt‰ s‰iliˆ.");
			}
			else	{System.out.println("Odota hetki, teesi valmistuu.");
					this.teet‰ -= 10;
			}
		}
		
		public void valmistaKahvi() {			
			if(this.kahvia - 10 < 0) {
				this.kahvia = 0;
				System.out.println("Kahvia ei ole en‰‰ j‰ljell‰, t‰yt‰ s‰iliˆ.");
			}
			else 	{System.out.println("Odota hetki, kahvisi valmistuu.");
					this.kahvia -= 10;
			}
		}

		
			public void valmistaKaakao() {				
				if(this.kaakaota - 10 < 0) {
					this.kaakaota = 0;					
					System.out.println("Kaakaota ei ole en‰‰ j‰ljell‰, t‰yt‰ s‰iliˆ.");					
				}
				else 	{System.out.println("Odota hetki, kaakaosi valmistuu.");
						this.kaakaota -= 10;
				}

			
		}
			
		// Luodaan toString
		
		public String toString() {
			return "Teet‰ j‰ljell‰ = " + teet‰ + ", Kahvia j‰ljell‰ = " + kahvia +", Kaakaota j‰ljell‰ = " + kaakaota + "";
		}
		
		
				
		public static void main(String[] args) {	
		}
}
