package yildizlarIleElmas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	int n;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz: ");
		n=scan.nextInt();
		
		for(int i=0; i<=n; i++) {
			for(int k=0; k<(n-i); k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i+1); j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(int i=(n-1); i>=0; i--) {
			for(int k=0; k<(n-i); k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i+1); j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
