package lambda.string_conversor;

public class Conversor {
    public static void main(String[] args) {
        Converte converteParaMaiscula = String::toUpperCase;
        System.out.println(converteParaMaiscula.converte("hello"));
        }
    }

