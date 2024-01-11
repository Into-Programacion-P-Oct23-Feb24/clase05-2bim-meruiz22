/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        Scanner scanner = new Scanner(System.in);

        int tamanio;

        // Ingresar por teclado el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        tamanio = scanner.nextInt();

        // Crear el arreglo con el tamaño especificado
        int[] arreglo = new int[tamanio];

        // Ingresar por teclado los valores del arreglo
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            arreglo[i] = scanner.nextInt();

        }
        int suma = misterio(arreglo,arreglo.length);

        // Imprimir la suma
        System.out.println("La suma de los valores del arreglo es: " + suma);
    }

    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}
