/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.target.testetarget;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteTarget {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o numero: ");
        int numero = scanner.nextInt();
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        fibonacci.add(0);
        fibonacci.add(1);
        if(numero == 0 || numero == 1){
            System.out.println("O numero esta na sequencia de Fibonacci");
            System.exit(0);
        }

        for(int i = 0; i < Integer.MAX_VALUE;i++){
            int valor = fibonacci.get(i) + fibonacci.get(i+1);
            fibonacci.add(valor);
            if(fibonacci.get(i) == numero){
                System.out.println("O numero esta na sequencia de Fibonacci");
                System.exit(0);
            }
            if(fibonacci.get(i) > numero){
                System.out.println("O numero não esta na sequencia de Fibonacci");
                System.exit(0);
            }
            
        }
        
        
    }
}
