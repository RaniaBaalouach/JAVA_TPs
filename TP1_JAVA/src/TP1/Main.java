package TP1;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ex1
        System.out.print("width: ");
        double largeur = scanner.nextDouble();
        System.out.print("height: ");
        double hauteur = scanner.nextDouble();
        System.out.println("Area: " + Ex1.calculerAire(largeur, hauteur));

        // Ex2
        System.out.print("temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println("Temperature in Fahrenheit: " + Ex2.convertirEnFahrenheit(celsius));

        // Ex3
        System.out.print("three ints: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Sum: " + Ex3.calculerSomme(num1, num2, num3));
        System.out.println("Average: " + Ex3.calculerMoyenne(num1, num2, num3));

        // Ex4
        System.out.print("number: ");
        int nombre = scanner.nextInt();
        System.out.println("Is even? " + Ex4.estPair(nombre));

        // Ex5
        System.out.print("number: ");
        int n = scanner.nextInt();
        System.out.println("Factorial: " + Ex5.calculerFactorielle(n));

        scanner.close();
    }
}
