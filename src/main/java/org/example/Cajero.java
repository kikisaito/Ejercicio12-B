package org.example;

import java.util.Scanner;

public class Cajero {
    private int id_cajero;
    private String nombre,apellidoP;

    public Cajero(String nombre, String apellidoP) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
    }

    public static void registrarCajero() {
        Scanner sc = new Scanner(System.in);
        String nombre = "", apellidoP = "";
        System.out.println("---Bienvenido, listo para cobrar---");
        System.out.println("-Porfavor de registrarse-");
        System.out.println("Ingrese el nombre del cajero:");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del cajero:");
        apellidoP = sc.nextLine();
        Cajero cajero = new Cajero(nombre, apellidoP);
    }

}
