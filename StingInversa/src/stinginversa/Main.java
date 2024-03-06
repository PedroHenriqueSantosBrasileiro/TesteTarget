package stinginversa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a String:");
        String palavra = scanner.nextLine();
        String stringInversa = "";

        for (int i = palavra.length() - 1; i >= 0; i--) {
            stringInversa += palavra.charAt(i);
        }
        System.out.println("String Inversa: " + stringInversa);
    }
}
