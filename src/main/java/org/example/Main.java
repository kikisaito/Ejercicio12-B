package org.example;

public class Main {
    public static void main(String[] args) {
        Productos productos[] = new Productos[3];
        productos[0] = new Productos(1, "Mi refresco", 8, 235);
        productos[1] = new Productos(2, "Mi refresco", 12, 500);
        productos[2] = new Productos(3, "Mi refresco", 13, 600);
        for (Productos producto : productos) {
            System.out.println(producto);
        }
    }

}