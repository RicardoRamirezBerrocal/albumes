package albumes;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String opcion;
		
		do {
			System.out.println("╔═══════════════════════════════════════════════════════════╗");
			System.out.println("║                GESTION DE DISCOS A ESCUCHAR               ║");
			System.out.println("╚═══════════════════════════════════════════════════════════╝");
			System.out.println("┌───────────────────────────────────────────────────────────┐");
			System.out.println("│                       Elige opción                        │");
			System.out.println("├─┬─────────────────────────────────────────────────────────┤");
			System.out.println("│1│Ver el contenido del archivo e inicializar base de datos.│");
			System.out.println("├─┼─────────────────────────────────────────────────────────┤");
			System.out.println("│2│Ver el contenido de la base de datos.                    │");
			System.out.println("├─┼─────────────────────────────────────────────────────────┤");
			System.out.println("│3│Añadir un voto manual.                                   │");
			System.out.println("├─┼─────────────────────────────────────────────────────────┤");
			System.out.println("│4│Simular votos aleatorios.                                │");
			System.out.println("├─┼─────────────────────────────────────────────────────────┤");
			System.out.println("│5│Calcular el mejor álbum.                                 │");
			System.out.println("├─┼─────────────────────────────────────────────────────────┤");
			System.out.println("│S│Salir.                                                   │");
			System.out.println("└─┴─────────────────────────────────────────────────────────┘");
			System.out.print("\n\tInserta opción: ");
			opcion = sc.nextLine().toUpperCase();
			switch (opcion) {
			case "1":
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				System.out.println("El mejor album es:");
				Album mejor = Album.getBest();
				System.out.println("Número "+mejor.getId()+": \""+mejor.getTitulo()+"\" ("+mejor.getAño()+"), de "+mejor.getAutor()+", con "+mejor.getEdiciones()+". Tiene"+mejor.getVotos()+" votos.");
				break;
			case "S":
				break;
			default:
				System.out.println("Tienes que elegir una de las posibles opciones");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}
			}
		} while (!opcion.equals("S"));
		
	}

}
