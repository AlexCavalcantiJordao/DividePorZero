package divideporzero;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirPorZero {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        boolean continuar = true;

        do {
            try {
                System.out.println("Número: ");

                int a = S.nextInt();
                System.out.println("Divisor: ");

                int b = S.nextInt();
                System.out.println(a / b);
                continuar = false;

            } catch (InputMismatchException e1) {
                System.err.println("Erro InputMismatchException capturado");
                S.nextLine(); //descarta entrada inválida

            } catch (Throwable e2) {
                System.err.println("Erro ArithmathicException capturado");
            } finally {
                System.out.println("Finally executado");
            }

        } while (continuar);
    }
}
