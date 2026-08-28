
package lambda.multiplication;

public class Multiplication {
    public static void main(String[] args) {
        OperacaoMultiplicacao operacao = (a, b) -> a * b;
        System.out.println(operacao.executar(5, 3));
    }
}