public class ParametrosInvalidosException extends Exception {

    public ParametrosInvalidosException() {
        super("O segundo parâmetro deve ser maior que o primeiro");
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
}
