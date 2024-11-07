package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int numero = 9;
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

        // Los objetos siempre empiezan con maysuculas (su valor predefinido es nulo)
    }


}

// Ponemos new scanner para que no la defina como nula de primeras y le damos permisos de ingresar con system.in