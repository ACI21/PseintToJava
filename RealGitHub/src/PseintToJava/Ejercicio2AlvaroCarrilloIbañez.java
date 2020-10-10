/* Álvaro Carrillo Ibáñez 
 *  
 * Proceso Adivina_Numero
	
    intentos<-10
    num_secreto <- azar(100)+1
    // int numSecreto = (int) (Math.random() *100 + 1); // este es el equivalente en JAVA


    Escribir "Adivine el numero (de 1 a 100):"
    Leer num_ingresado
    Mientras num_secreto<>num_ingresado Y intentos>1 Hacer
    // while (numSecreto != num_ingresado && intentos > 1) 
        Si num_secreto>num_ingresado Entonces
            Escribir "Muy bajo"
        Sino 
            Escribir "Muy alto"
        FinSi
        intentos <- intentos-1
        Escribir "Le quedan ",intentos," intentos:"
        Leer num_ingresado
    FinMientras
    
    Si num_secreto=num_ingresado Entonces
        Escribir "Exacto! Usted adivino en ",11-intentos," intentos."
    Sino
        Escribir "El numero era: ",num_secreto
    FinSi
    
	FinProceso
 */

package PseintToJava;

import java.util.Scanner;

public class Ejercicio2AlvaroCarrilloIbañez {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		

		int a = (int) ((Math.random() * 100)+1); // número random 1-100
		int b; // numero dado por el usuario
		int i; // los intentos

		System.out.println("El juego consiste en averiguar un número secreto de 100 posibles."); // instrucciones del juego

		System.out.print("Tienes 10 intentos. Escribe un número entre 1 y 100: "); // inicia el juego
		b = sc.nextInt(); // se mete el número
		
		for (i=1; i<=10; i++) { // datos de los intentos

			if (a == b) {  
				System.out.println("¡Has acertado!"); // se gana el introducir el mismo número
				break; } 

			else if (i == 10) { 
				System.out.println("Lo siento: ¡has perdido!. El número era el: " + a); // la última oportunidad es en el intento 10
				break; } 			
			else if (a > b) {
				System.out.println("El número secreto es MAYOR que " + b); } //pistas >
			else if (a < b) {
				System.out.println("El número secreto es MENOR que " + b); } //pistas <
			if (i <= 6) {				
				System.out.print("Inténtalo de nuevo: "); // mensaje de consuelo en cada intento
				b = sc.nextInt(); } 
			else if (i == 7) {
				System.out.print("Oh, oh... ÚLTIMOS 3 intentos: "); // advertencia de que se acaban los intentos
				b = sc.nextInt(); }	
			else if (i == 8) {
				System.out.print("Oh, oh... ÚLTIMOS 2 intentos: "); // advertencia de que se acaban los intentos parte 2
				b = sc.nextInt(); }	
			else if (i == 9) {
				System.out.print("Oh, oh... ÚLTIMO intento: "); // advertencia de que se acaban los intentos parte 3
				b = sc.nextInt(); }	

		} //cierre for
							 sc.close();		// Cierre del scanner  
	} // cierre public void
						
} // cierre total
