package lambda.arithmetic_exception;

public class Divisor {
    public static void main(String[] args) {
        Operacao divisor = (a, b) -> {
            if (b == 0) throw new ArithmeticException("Divisão igual a zero");
            return a / b;
        };

        try {
            System.out.println(divisor.executar(10, 2));
            System.out.println(divisor.executar(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
