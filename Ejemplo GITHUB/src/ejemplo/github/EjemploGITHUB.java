/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo.github;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Hugo
 */
public class EjemploGITHUB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<Integer> numeros = new Vector<Integer>();

        Scanner sc = new Scanner(System.in);

        System.out.println("¿CUANTOS NÚMEROS DESEA INTRODUCIR?");

        int size = sc.nextInt();

        if (size > 10) {

            size = 10;

        }

        for (int i = 0; numeros.size() < size; i += 1) {

            System.out.println("[" + (i + 1) + "] INTRODUZCA UN NÚMERO: ");

            boolean quit = false;

            while (!quit) {

                try {

                    int numero = sc.nextInt();

                    if (numeros.indexOf(numero) == -1) {

                        numeros.add(numero);

                        quit = true;

                    } else {

                        System.out.println("[" + (i + 1) + "] POR FAVOR, INTRODUZCA UN NÚMERO DIFERENTE: ");

                    }

                } catch (InputMismatchException e) {

                    System.out.println("[" + (i + 1) + "] POR FAVOR, INTRODUZCA UN NÚMERO: ");

                    sc.nextLine();

                }

            }

        }

        Collections.sort(numeros);

        for (int numero : numeros) {

            System.out.println(numero);

        }

    }

}
