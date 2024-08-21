/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseproducto;



/**
 *
 * @author strdh
 */
public class ProductoAlimenticio extends ClaseProducto {
    private String fechaDeCaducidad;

    public ProductoAlimenticio(String nombre, double precio, int cantidad, Proveedor proveedor, String fechaDeCaducidad) {
        super(nombre, precio, cantidad, proveedor);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public String getDetalles() {
        return String.format("Producto Alimenticio: %s, Precio: %.2f, Cantidad: %d, Fecha de Caducidad: %s", nombre, precio, cantidad, fechaDeCaducidad);
    }

    public String getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }
}

