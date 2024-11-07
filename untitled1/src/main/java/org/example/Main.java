package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* EJERCICIO 1
        int numero1 = 9;
        int numero2 = 5;
        System.out.println("Por favor, ingrese dos numeros enteros:");
        Scanner leer = new Scanner(System.in);
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma de los dos numeros ingresados es de " + suma);
        */


        /* EJERCICIO 3   // Tambien se puede hacer con frase = frase.toLowerCase y frase.toUpperCase, leyendo solo la variable frase en el system.ln
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese una frase:");
        String frase = leer.nextLine();
        System.out.println("Tu frase en minusculas es " + frase.toLowerCase()); // Se usa para normalizar a un solo tipo de string y ahorrarte 40 pasos
        System.out.println("Tu frase en mayusculas es " + frase.toUpperCase());
        */

        /* EJERCICIO 2
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese su nombre:");
        String nombre = leer.nextLine();  // El nextLine es el mejor para poder leer Strings
        System.out.println("¡Buenos dias " + nombre + "!");
        */

        /* EJERCICIO 1 MEJORADO
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese el primer numero:");
        int numero1 = leer.nextInt();
        System.out.println("Por favor, ingrese el segundo numero:");
        int numero2 = leer.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma entre los dos numeros ingresados es de " + suma + ".");
        */

        /* EJERCICIO 4
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de grados centigrados");
        double centigrados = leer.nextInt();
        double farenheit = 32 + (9 * centigrados/5);
        System.out.println("Estariamos hablando de un total de " + farenheit + " grados Farenheit.");
        */




        /* int numero = 9;
        float real = 0.5f;  // Para que pueda ser flotante (o double) le tenemos que meter una f al final (o una d)
        // Casteo del float (funciona de la misma manera que arriba):  float real2 = (float)(0.5);
        String cadena = "hola"; // Con char seria de tipo caracter (pero tendria que ir con comillas simples)
        char caracter = 'h'; // Se puede usar para guardar signos matematicos, de monedas, etc
        boolean logica = false;
        // En Java, una variable puede cambiar su valor mas nunca su tipo (por ejemplo int) [OCURRE EN TODOS LOS LENGUAJES FUERTEMENTE TIPADOS]
        System.out.println("Valor antes del scanner es igual a " + numero); // Que el sistema devuelva un valor y lo imprima en una linea (sout + tab)
        Scanner leer = new Scanner(System.in); // Declaramos la variable scanner de nombre leer y con system in se lo estamos pidiendo al usuario
        numero = leer.nextInt(); // Generalmente con el .next asignamos el dato que recibira
        System.out.println("Valor tras el scanner es igual a " + numero); // Le asignamos un nuevo valor a la variable numero mediante lo que ponga el usuario

        // Los objetos siempre empiezan con maysuculas (su valor predefinido es nulo) */
    }


}

// Ponemos new scanner para que no la defina como nula de primeras y le damos permisos de ingresar con system.in