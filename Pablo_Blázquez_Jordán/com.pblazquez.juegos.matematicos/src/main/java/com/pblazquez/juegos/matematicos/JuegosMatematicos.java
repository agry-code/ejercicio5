package com.pblazquez.juegos.matematicos;

import java.util.Scanner;

public class JuegosMatematicos {

	public static void main(String[] args) {
		System.out.println("Raúl estuvo aquí.");
		System.out.println("Adry estuvo aqui");
		System.out.println("Pedro estuvo aqui");
		//Parte 1
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Dime un numero");
		int n1 = Integer.parseInt(sc.nextLine());
		int operacion = ((n1*3)+6)/3-n1;
		boolean resultado = operacion==2;
		System.out.println("El resultado es "+operacion+" por lo tanto, "+resultado);
		
		//Parte 2
		
		System.out.println("¿Cuál es tu año de nacimiento?");
		short anoNacimiento=Short.parseShort(sc.nextLine());
		boolean resultadoDos = anoNacimiento%2==0 || 2022-anoNacimiento>30;
		
		System.out.println(resultadoDos);
		
		//Parte 3
		
		System.out.println("¿Cuál es tu talla de pie?");
		byte talla = Byte.parseByte(sc.nextLine());
		int nTalla = ((((talla*5)+50)*20)+1022)-anoNacimiento;
		System.out.println(nTalla);
		boolean comprobacion = nTalla/1000 > 1 && nTalla/10000 < 1 && nTalla/100 == talla && nTalla%100 == 2022-anoNacimiento;
		
		System.out.println(comprobacion);
	}

}
