import java.util.Scanner;
//NAMA : ISMAIL UMAR
//NIM  : D0217308
//KELAS: INFORMATIKA. A 2017

public class Star_Wars007 {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
		System.out.print("Masukin Angka : ");
		int a = sc.nextInt();
		
		for (int i = 0; i < a; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" X ");
            }
            System.out.println();
        }
    }
}
