/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Recursividad {

    public static int factorial(int n) {
        if (1 == n) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //hacer un metodo factorial que sume N numeros enteros
    public static int sumatoria(int m) {

        if (1 == m) {
            return m;
        } else {
            return m + sumatoria(m - 1);
        }
    }

    //Metodo recursivo para obtener la divicoon con restas
    public static int resta(int divi, int diva) {
        divi = 5;
        diva = 20;
        if (divi > diva) {
            return 0;
        } else {
            return 1 + resta(divi - diva, diva);
        }
    }

    //Hacer un método recuesivo que eleve un numero n a un exponete x
    public static int exponencial(int e, int x) {
        //x -> numero
        //e -> exponente
        x = 4;
        e = 3;
        if (e == 0) {
            return x;
        } else {
            return x * exponencial(x, e - 1);
        }
    }
    

    
    // Método recursivo para calcular Fibonacci
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Caso base: Fibonacci de 0 es 0, Fibonacci de 1 es 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  // Llamada recursiva
        }
    }
    

    public static int contarVocales(String cadena) {
       
        
        if (cadena.isEmpty()) {
            return 0;
        } else {
           
            char c = Character.toLowerCase(cadena.charAt(0));

            int suma = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;

            return suma + contarVocales(cadena.substring(1));
        }
    }

    
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int p, b;
        /*System.out.println("Ingresa tu numero a sumar");
        p = sc.nextInt();
        System.out.println("Ingresa tu numero a factorizar");
        b = sc.nextInt();
        System.out.println("Sumatoria " + sumatoria(p));
        System.out.println("factorial " + factorial(b));
        System.out.println("");
        */
        //int n = 0;  // Cambia este valor para calcular otro número de Fibonacci
        
        
        System.out.println("Ingresa el numero de Fibonacci que quieres comprobar: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci de " + n + " es: " + fibonacci(n));
        /*String texto = " a a a b e";
        String texto2 = " dsawdfasd";
        String texto3 = " aeosdswkjjkaaajki";
        System.out.println("Número de vocales: " + contarVocales(texto));
        System.out.println("Número de vocales: " + contarVocales(texto2));
        System.out.println("Número de vocales: " + contarVocales(texto3));*/

    }

}
