package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Compra {
    private int id_compra;
    Cajero cajero;
    Productos producto;

    public Compra() {
        this.id_compra = id_compra;
        this.cajero = cajero;
        this.producto = producto;
    }

    public static void  registrarCompra() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Ingrese el producto comprado:");
            System.out.println("1-Mi refresco:$8,mil:235"
                    + "\n2-Mi refresco:$12,mil:500"
                    + "\n3-Mi refresco:$13,mil:600"
            );
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("No se aplica descueto");
                }
                case 2 -> {
                    System.out.println("No se aplica descueto");
                }
                case 3 -> {
                    System.out.println("Se aplica descuento del 10%");

                }
                default -> {
                    System.out.println("Por favor de ingresar de nuevo los datos");
                }
            }

        } while (opcion <= 0 || opcion > 3);

    }
    public void imprimirCompra() {
        System.out.println("--Abarrotes los primos---");
        System.out.println("--Suchiapa,CHiapas--\n");
        System.out.println("27/Septiembre/2025\n");
        System.out.println("Atentido por:" + cajero);
        System.out.println("cantidad 2\n");
        System.out.println("Producto:"+producto);

    }


}