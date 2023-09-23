import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = numInt(scanner);

        System.out.println("Digite o segundo número: ");
        int segundoNumero = numInt(scanner);

        scanner.close();

        try {
            contar(primeiroNumero, segundoNumero);

        } catch (ParametrosInvalidosException e) {
            System.err.println(e.getMessage());
        }

    }
    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero >= segundoNumero) {
            throw new ParametrosInvalidosException();
        }
        int contagem = segundoNumero - primeiroNumero;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Número: " + i);
        }
    }

    private static int numInt(Scanner scanner) {
        int input;
        while (true) {
            try {
                input = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException ex) {
                System.err.println("Dados inválidos, insira um número inteiro. ");
            }
        }
        return input;
    }
}
