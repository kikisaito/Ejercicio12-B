package org.example;

public class Productos {
    private int id_producto;
    private String nombreProduc;
    private float precio;
    private int mili;

    public Productos(int id_producto, String nombreProduc, float precio, int mili) {
        this.id_producto = id_producto;
        this.nombreProduc = nombreProduc;
        this.precio = precio = AplicarDescuento(precio, mili); ;
        this.mili = mili;

    }

    public float AplicarDescuento(float precio, int mili) {
        if (mili >=600){
            precio = precio - (precio / 10);
            System.out.println(precio);
        }
        return precio;

    }


    @Override
    public String toString() {
        return "ID: " + this.id_producto + " " +
                "Producto: " + this.nombreProduc + " " +
                "Precio: $" + this.precio + " " +
                "Contenido: " + this.mili + "ml";
    }
}
