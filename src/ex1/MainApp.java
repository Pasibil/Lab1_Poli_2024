package ex1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti parametrii pentru a si b:");
        System.out.print("a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();

        System.out.println("Rezultat:" +
                "\nPerimetru = " + ((a+b)*2) +
                "\nAria = " + (a*b));
    }
}
