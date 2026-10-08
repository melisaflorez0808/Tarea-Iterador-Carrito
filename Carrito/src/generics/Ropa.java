package generics;

public class Ropa extends Producto{
	
	private String talla;
	
	public Ropa(String nombre, double precio, String talla) {
		super(nombre,precio);
		this.talla=talla;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

}
