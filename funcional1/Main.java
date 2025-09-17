package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Alumno> listaAlumnos = new ArrayList<>();

        Alumno alumno1 = new Alumno("Pedro", 7.5f, "1A");
        Alumno alumno2 = new Alumno("maria", 9.0f, "1B");
        Alumno alumno3 = new Alumno("juan", 6.0f, "1A");
        Alumno alumno4 = new Alumno("ana", 8.5f, "1C");
        Alumno alumno5 = new Alumno("luis", 5.5f, "1B");

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);

        List<String> aprobados = listaAlumnos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .toList();

        System.out.println(aprobados);

        double promedioGeneral = listaAlumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                .orElse(0.0);
        System.out.println(promedioGeneral);

        Map<String, List<Alumno>> alumnosPorCurso = listaAlumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));
        System.out.println(alumnosPorCurso);

        List<Alumno> mejoresPromedios = listaAlumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .toList();
        System.out.println(mejoresPromedios);
    }
}