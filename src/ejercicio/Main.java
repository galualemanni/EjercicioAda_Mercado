package ejercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo, tipo;
		float precio, kilos, litros;

		System.out.println(
				"*****¡Bienvenido!*****\nPara comenzar digite 1 si el producto a ingresar es una bebida o 2 si es un alimento = ");
		tipo = sc.nextInt();
		if (tipo == 2) {
			System.out.println("Digite el codigo del alimento = ");
			codigo = sc.nextInt();
			System.out.println("Digite el precio del alimento = ");
			precio = sc.nextFloat();
			System.out.println("Digite el peso en kilos del alimento = ");
			kilos = sc.nextFloat();

			Alimento a1 = new Alimento(precio, codigo, kilos);
			System.out.println(a1.toString());
		} else {
			System.out.println("Digite el codigo del alimento = ");
			codigo = sc.nextInt();
			System.out.println("Digite el precio del alimento = ");
			precio = sc.nextFloat();
			System.out.println("Digite el peso en kilos del alimento = ");
			litros = sc.nextFloat();

			Bebida b1 = new Bebida(precio, codigo, litros);
			System.out.println(b1.toString());
		}

	}

}
