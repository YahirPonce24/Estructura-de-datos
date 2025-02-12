/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursividad;

/**
 *
 * @author invitado
 */
public class EjRecursividad {
    public static int factorial(int n){
        if (n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
    public static int sumatoria(int n){
        if (n==1)
            return 1;
        else
            return n+sumatoria(n-1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Factorial "+factorial(5));
        System.out.println("sumatoria "+sumatoria(10));
    }
    
}
