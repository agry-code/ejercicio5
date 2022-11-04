package algunosJuegosMatemáticos;

import java.util.Scanner;

public class algunosJuegosMatemáticos {
	
	public static void main(String[] args) {
		
		          // 1
	Scanner sc = new Scanner(System.in);
	System.out.println("Elige un numero entero.");
	int x = Integer.parseInt(sc.nextLine());
	int y = x*3;
	y +=6;
	y/=3;
	y = y - x;
	System.out.println(y);
	if (y==2) {
		System.out.println("True");
	} else {
		System.out.println("False");
	}
	
	           	// 2
	System.out.println("Dime tu año de nacimiento.");
	int añoNacimiento = Integer.parseInt(sc.nextLine());
	if (añoNacimiento%2 == 0 || 2022-añoNacimiento > 30) {
		System.out.println("True");
	} else {
		System.out.println("False");
	}
	
	           	// 3
	System.out.println("Dime tu talla de pie");
	int tallaPie = Integer.parseInt(sc.nextLine());
	tallaPie *=5;
	tallaPie +=50;
	tallaPie *=20;
	tallaPie +=1022;
	tallaPie -=añoNacimiento;
	int numeroResultado = tallaPie/10000;
	System.out.println(tallaPie);
	boolean comprobacion = tallaPie/1000 > 1 && tallaPie/10000 < 1 && numeroResultado/100 == tallaPie && tallaPie%100 == 2022 - añoNacimiento;
	if (((tallaPie/1000) > 1) && ((tallaPie/10000) < 1) && (numeroResultado/100 == tallaPie) && (numeroResultado%100 == 2022 - añoNacimiento)) {
		System.out.println("True");
	} else {
		System.out.println("False");
	}
	}
}