package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class IteradorCarrito <T extends Producto> implements Iterator <T> {
	
	private ArrayList<T> productos;
	private int posicion=0;
	
	public IteradorCarrito(ArrayList<T> productos) {
		this.productos=productos;
		this.posicion=0;
	}

	@Override
	public boolean hasNext() {
		return posicion < productos.size();
	}

	@Override
	public T next() {
		
		T producto = productos.get(posicion);
		posicion++;
		
		return producto;
	}
	
	public T nextSiete() {
		while (posicion < productos.size()) {
			T producto = productos.get(posicion);
			posicion++;
			if ((producto.getPrecio() % 7)==0) {
				return producto;
			}
		}
		return null;
	}
	
	public boolean hasPrevious() {
		return posicion>0;
	}
	
	public T previous() {
		T producto = productos.get(posicion);
		posicion--;
		
		return producto;
	}
	
	
}
