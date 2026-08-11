package collections;

import java.util.ArrayList;

public class GetAndSizeExample {
    public static void main(String[] args) {
        ArrayList<String> funcionarios = new ArrayList<>();

        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");
        funcionarios.add("Paula");
        funcionarios.add("Pedro");

        System.out.println("A segunda pessoa da lista é: " + funcionarios.get(1));
        System.out.println("Total de funcionários: " + funcionarios.size());
    }
}
