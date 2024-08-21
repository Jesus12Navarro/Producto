/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.claseproducto;

/**
 *
 * @author strdh
 */
public class ProductoElectronico  extends ClaseProducto {
    private int garantia;

    public ProductoElectronico(String nombre, double precio, int cantidad, Proveedor proveedor, int garantia){
        super(nombre, precio, cantidad, proveedor);
        this.garantia = garantia;
    }

    @Override
    public String getDetalles() {
        return String.format("Producto Electronico: %s, Precio: %.2f, Cantidad: %d000, Garantía: %d meses", nombre, precio, cantidad, garantia);
    }

    public int getGarantia() {
        return garantia;
    }
}
