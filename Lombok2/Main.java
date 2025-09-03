package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Usuario u1 = Usuario.builder()
                .id(1)
                .nombre("Juan")
                .email("juan@mail.com")
                .build();

        Usuario u2 = Usuario.builder()
                .id(2)
                .nombre("Ana")
                .email("ana@gmail.com")
                .build();

        System.out.println(u1);
        System.out.println(u2);
    }
}