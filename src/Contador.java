import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner entries = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int firstNumber = entries.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        int secondNumber = entries.nextInt();

        entries.close();

        try {
            contar(firstNumber, secondNumber);
        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
        }
    }

    private static void contar(int first, int second) throws ParametrosInvalidosException {
        if (second < first) {
            throw new ParametrosInvalidosException();
        }

        int counter = second - first;
        for (int index = 1; index <= counter; index++) {
            System.out.printf("Imprimindo o número %d", index);
            System.out.println("\n");
        }
    }
}
