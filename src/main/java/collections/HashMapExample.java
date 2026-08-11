package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Pedro");
        clientes.put(2, "Paula");
        clientes.put(3, "Paolla");

        System.out.println("O nome do cliente com ID 2 é: " + clientes.get(2));
    }
}
