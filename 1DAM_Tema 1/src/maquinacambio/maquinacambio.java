package maquinacambio;

import java.util.Scanner; /*Importar Libreria Scanner*/

public class maquinacambio {
	
	public static void main(String [] args) {
		int UNID500,UNID200,UNID100,UNID50,UNID20,UNID10,UNID5;	/*Variables del programa*/
		
		Scanner Cambio = new Scanner(System.in); /* Uso de la Libreria Scannel */
			
		System.out.print("**Introducir Cantidad de Euros a Cambiar \n"); /*Interfaz Usuario*/

		int cambio = Cambio.nextInt(); /*Solicitar al usuario cuanto quiere cambiar*/

		System.out.print("\n--------------------------------------\n\n\n"); /*Interfaz Usuario*/
		
		System.out.println("****Para la cantidad: "+cambio+" euros, el cambio es:\n"); /*Interfaz Usuario*/
		
		/*Igualar la variable a la cantidad de billetes*/
		/*Sobre-escribir la variable "cambio" con el valor del resto*/
		UNID500 = cambio/500;
		cambio = cambio%500;

		UNID200 = cambio/200;
		cambio = cambio%200;

		UNID100 = cambio/100;
		cambio = cambio%100;

		UNID50 = cambio/50;
		cambio = cambio%50;

		UNID20 = cambio/20;
		cambio = cambio%20;

		UNID10 = cambio/10;
		cambio = cambio%10;

		UNID5 = cambio/5;
		cambio = cambio%5;

		/*Interfaz Usuario*/
		System.out.println("--> "+UNID500 + " Billetes de 500 euros");
		System.out.println("--> "+UNID200 + " Billetes de 200 euros");
		System.out.println("--> "+UNID100 + " Billetes de 100 euros");
		System.out.println("--> "+UNID50 + " Billetes de 50 euros");
		System.out.println("--> "+UNID20 + " Billetes de 20 euros");
		System.out.println("--> "+UNID10 + " Billetes de 10 euros");
		System.out.println("--> "+UNID5 + " Billetes de 5 euros");
		System.out.println("\n*****Sobran "+cambio+" euros****"); 
		/*Fin del Programa*/
	}
}