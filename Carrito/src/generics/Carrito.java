package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Carrito<T extends Producto> implements Iterable<T> {
	
	private ArrayList<T> productos;
	
	public Carrito() {
		productos= new ArrayList<>();
	}
	
	public void agregarProducto(T producto) {
		productos.add(producto);
	}
	
	public T obtenerMayorPrecio() {

        if (productos.isEmpty()) {
            return null;
        }

        T mayor = productos.get(0);

        for (T producto : productos) {
            if (producto.getPrecio() > mayor.getPrecio()) {
                mayor = producto;
            }
        }

        return mayor;
    }

    public double calcularPrecioTotal() {

        double total = 0;

        for (T producto : productos) {
            total += producto.getPrecio();
        }

        return total;
    }

	@Override
	public IteradorCarrito<T> iterator() {
		return new IteradorCarrito<>(this.productos);
	}

}
