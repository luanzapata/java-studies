package collections;

import java.util.ArrayList;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> funcionarios = new ArrayList<>();
        funcionarios.add("Maria");
        funcionarios.add("Vitor");
        funcionarios.add("Ana");
        funcionarios.add("Paolla");

        System.out.println("Lista Inicial: " + funcionarios);

        funcionarios.remove("Ana");
        System.out.println("Lista Final: " + funcionarios);
    }
}
