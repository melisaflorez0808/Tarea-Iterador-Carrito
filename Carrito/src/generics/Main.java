package generics;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Carrito<Producto> carrito = new Carrito<>();

        Ropa pantalon = new Ropa("Pantalón", 70000, "M");       
        Ropa buzo = new Ropa("Buzo", 85000, "L");               
        Ropa medias = new Ropa("Medias", 21000, "S");           
        Ropa vestido = new Ropa("Vestido", 120000, "M");        
        Ropa gorra = new Ropa("Gorra", 35000, "Única");         
        Ropa zapatos = new Ropa("Zapatos", 160000, "40");  
        Electrodomestico licuadora = new Electrodomestico("Licuadora", 140000, "Cocina", "Oster"); // Sí
        Electrodomestico nevera =new Electrodomestico("Nevera", 1500000, "Refrigeración", "LG"); // No
        Electrodomestico microondas =new Electrodomestico("Microondas", 350000, "Cocina", "Samsung"); // Sí
        Electrodomestico lavadora =new Electrodomestico("Lavadora", 1200000, "Lavado", "Whirlpool"); // No
        Electrodomestico cafetera =new Electrodomestico("Cafetera", 105000, "Cocina", "Oster"); // Sí
        Electrodomestico aspiradora =new Electrodomestico("Aspiradora", 430000, "Limpieza", "Electrolux"); // No

        carrito.agregarProducto(pantalon);
        carrito.agregarProducto(buzo);
        carrito.agregarProducto(medias);
        carrito.agregarProducto(vestido);
        carrito.agregarProducto(gorra);
        carrito.agregarProducto(zapatos);

        carrito.agregarProducto(licuadora);
        carrito.agregarProducto(nevera);
        carrito.agregarProducto(microondas);
        carrito.agregarProducto(lavadora);
        carrito.agregarProducto(cafetera);
        carrito.agregarProducto(aspiradora);

        Producto productoMayor = carrito.obtenerMayorPrecio();

        System.out.println("Producto de mayor precio: " + productoMayor);

        double total = carrito.calcularPrecioTotal();

        System.out.println("Precio total del carrito: $" + total);
        
        IteradorCarrito<Producto> iterador =carrito.iterator();

        System.out.println("\nProductos del carrito:");

        while (iterador.hasNext()) {

            Producto producto =
                    iterador.next();

            System.out.println(producto);
        }
        
        IteradorCarrito<Producto> iterador2 =carrito.iterator();

        System.out.println("\nProductos con precios multiplos de 7:");

        while (iterador2.hasNext()) {

            Producto producto =iterador2.nextSiete();
            if (producto != null) {
                System.out.println(producto);
            }
        }

    }
}