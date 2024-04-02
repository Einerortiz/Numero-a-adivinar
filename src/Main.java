import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroAadivinar = (int) (Math.random()*100);
        int intentosf = 0;

        System.out.println("Bienvenido al juego de adivinar el número :D");

        int Adivinar;
        do {
            System.out.print("Introduce tu numero :) : ");
            Adivinar = input.nextInt();
            intentosf++;

            if (Adivinar < numeroAadivinar) {
                System.out.println("El número a adivinar es mayor.");
            } else if (Adivinar > numeroAadivinar) {
                System.out.println("El número a adivinar es menor.");
            }
        } while (Adivinar != numeroAadivinar);

        System.out.println("Felicidades Adivinaste el número en " + intentosf + " intentos fallidos.");
    }
}