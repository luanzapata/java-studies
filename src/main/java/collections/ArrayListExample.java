package collections;

import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args){
        ArrayList<String> listaDeFuncionarios = new ArrayList<String>();

        listaDeFuncionarios.add("João");
        listaDeFuncionarios.add("Maria");
        listaDeFuncionarios.add("Vitor");
        listaDeFuncionarios.add("Ana");

        System.out.println("Lista de funcionários: " + listaDeFuncionarios);
    }
}