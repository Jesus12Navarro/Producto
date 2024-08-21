/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.claseproducto;

abstract class ClaseProducto {
    public String nombre;
    public double precio;
    public int cantidad;
    public Proveedor proveedor;

    public ClaseProducto (String nombre, double precio, int cantidad, Proveedor proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
    }

    public abstract String getDetalles();

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }
            public static void main(String[] args) {
        Proveedor proveedor1 = new Proveedor("Proveedor1");
        ProductoElectronico producto1 = new ProductoElectronico("Laptop", 1000, 10, proveedor1, 24);
        ProductoAlimenticio producto2 = new ProductoAlimenticio("Leche", 1.5, 50, proveedor1, "2024-12-31");

        Categoria categoriaElectronica = new Categoria("Electrónica");
        Categoria categoriaAlimenticio = new Categoria("Alimenticio");

        categoriaElectronica.añadirProducto(producto1);
        categoriaAlimenticio.añadirProducto(producto2);

        CalculadorDePrecio calculadorSinDescuento = new CalculadorDePrecioSinDescuento();
        GestorDeInventario gestorSinDescuento = new GestorDeInventario(calculadorSinDescuento);
        gestorSinDescuento.añadirProducto(producto1);
        gestorSinDescuento.añadirProducto(producto2);
        System.out.println("Precio Total sin Descuento: " + gestorSinDescuento.calcularPrecioTotal());

        CalculadorDePrecio calculadorConDescuento = new CalculadorDePrecioConDescuento(10); 
        GestorDeInventario gestorConDescuento = new GestorDeInventario(calculadorConDescuento);
        gestorConDescuento.añadirProducto(producto1);
        gestorConDescuento.añadirProducto(producto2);
        System.out.println("Precio Total con Descuento: " + gestorConDescuento.calcularPrecioTotal());

        CalculadorDePrecio calculadorPorCategoria = new CalculadorDePrecioPorCategoria(categoriaElectronica);
        GestorDeInventario gestorPorCategoria = new GestorDeInventario(calculadorPorCategoria);
        System.out.println("Precio Total Categoria Electrónica: " + gestorPorCategoria.calcularPrecioTotal());
    }
}

