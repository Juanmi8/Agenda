package Agenda;

import java.util.Scanner;

public class AGENDA {
 
	public static int pintamenu() {
		
		int menu;
		Scanner leer = new Scanner(System.in);
		
		do {
			
			System.out.println("Si quiere añadir un contacto, pulse 1");
			System.out.println("Si desea buscar un contacto, pulse 2");
			System.out.println("Si quiere borrar un contacto, pulse 3");
			System.out.println("Si desea editar un contacto, pulse 4");
			System.out.println("Si desea ver la lista de contactos, pulse 5");
			System.out.println("Si desea salir de la lista, pulse 6");
			System.out.println("");
			System.out.println("¿Que desea hacer?");
			menu = leer.nextInt();
			
			
			
			if ( menu<1 || menu>6) {
				System.out.println("Vuelva a teclear un numero");
				menu = leer.nextInt();
			
		}while ( menu<1 || menu>6);
		
		
		return menu;
}
		
		
	public static void main(String[] args) {
		
		int num1, menu, i , buscanum;
		String nombre;
		
		Scanner leer = new Scanner(System.in);
		
		
		
		i = leer.nextInt();
		
		
	
		
		switch (menu) {
		case 1:
			System.out.println("Dime el nombre de la persona");
			nombre = leer.nextLine();
			System.out.println("Dime el telefono de la persona");
			num1 = leer.nextInt();
			System.out.println("Acaba de añadir el siguiente telefono" + nombre + num1);
			break;

		case 2:
			System.out.println("Dime el nombre de la persona");
			buscanum = leer.nextInt();
			break;
		case 3:
			System.out.println("Dime el nombre de la persona");
		default:
			break;
		}
		
	}

}
