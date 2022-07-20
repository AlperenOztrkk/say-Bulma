package sayıBulma;


public class sayıBulma {

	public static void main(String[] args) {
	int[]sayılar=new int[] {1,2,3,4,7,9,0};
	int aranacak=5;
	boolean varMi=false;
	
	 for(int sayı:sayılar ) {
		 if(sayı==aranacak) {
			
			 varMi=true;
			 break;
		 }
	 }
	 if(varMi) {
		 System.out.println("Sayı Mecvuttur");
	 }
	 else {
		 System.out.println();
	 }
	}
}
