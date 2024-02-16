package calculadora202307518;
import java.util.Scanner;

public class Calculadora202307518 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;
        char operador;

        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        System.out.print("Ingrese la operación (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Error: Operador inválido.");
        }
    }
    
}
