package Unidad3;

import java.util.Scanner;

public class Aciertos {
	static final int LIMITE = 20;
	static final int TOTAL_NUMEROS= 50;
   public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //Generar 
        int intentos = 1;
        int opción = 0;
        do {
            System.out.println("1.Jugar");
            System.out.println("2.Salir");
            
            if(opción==1) {
                System.out.println("Jugamos");
            }else if(opción==2) {
                System.out.println("Salimos, gracias por jugar");
            }else {
                System.out.println("Opción no válida");
                intentos++;
                System.out.println("Intentos: "+intentos);
            }
        } while(opción!=2 && intentos<5);
        
        //Generar 3 números aleatorios entre el 1 y 99
        int min = 1;
        int max = 100;
        
        int numAleatorio = (int) (Math.random()*(max-min));
        System.out.println("Número aleatorio 1: "+numAleatorio);
        int numAleatorio2 = (int) (Math.random()*(max-min));
        System.out.println("Número aleatorio 2: "+numAleatorio);
        int numAleatorio3 = (int) (Math.random()*(max-min));
        System.out.println("Número aleatorio 3: "+numAleatorio);
        
        
        
        //Pedir, leer de consola y almacenar 3 números entre el 1 y el 99 al usuario        
        int num1;
        int num2;
        int num3;
        
        System.out.println("Dame un número entre el 1 y el 99");
        Scanner consola = null;
		num1 = consola.nextInt();
        System.out.println("Dame otro número entre el 1 y 99");
        num2 = consola.nextInt();
        System.out.println("Dame otro número entre el 1 t 99");
        num3 = consola.nextInt();
        
        //Saber si ha acertado el usuario
        //aleatorio1 ¿=? numeroUsuario1
        //aleatorio2 ¿=? numeroUsuario2
        //aleatorio3 ¿=? numeroUsuario3
        if(num1 == numAleatorio) {
            System.out.println("Es correcto");
        }else {
            System.out.println("Es incorrecto");
        }
        if(num2 == numAleatorio2) {
            System.out.println("Es correcto");
        }else {
            System.out.println("Es incorrecto");
        }
        if(num3 == numAleatorio3) {
            System.out.println("Es correcto");
        }else {
            System.out.println("Es incorrecto");
        }
     
        //Obtener la tasa de aciertos (si hay aciertos)
        int contador = 0;
        if(num1 == numAleatorio) {
            System.out.println("Contador de fallos: "+contador);
        }else {
            System.out.println("Contador de fallos: "+(contador++));
        }
        if(num2 == numAleatorio2) {
            System.out.println("Contador de fallos: "+contador);
        }else {
            System.out.println("Contador de fallos: "+(contador++));
        }
        if(num3 == numAleatorio3) {
            System.out.println("Contador de fallos: "+contador);
        }else {
            System.out.println("Contador de fallos: "+(contador++));
        }
        double contadordeAciertos = 0;
		double tasa = (double)contadordeAciertos/TOTAL_NUMEROS;
        
	
        
        
        consola.close();
    }


}
