import java.util.Scanner;


public class STAR_WARS_010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukin Angka : ");
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++){
			for (int j = 0; j <= i; j++){
			System.out.print("  ");
		}
		for(int j=0;j<(a-i);j++){
			System.out.print("x ");
			
		}
		System.out.println();
		}	
	}

}
