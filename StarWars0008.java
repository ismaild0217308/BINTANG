import java.util.Scanner;

//NAMA : ISMAIL UMAR
//NIM  : D0217308
//KELAS: INFPRMATIKA. A 2017
public class StarWars0008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukin Angka : ");
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++){
			for (int j = 0; j < i; j++){
			System.out.print("");
		}
		for(int j=0;j<(a-i);j++){
			System.out.print("X ");
			
		}
		System.out.println();
		}	
	}

}
