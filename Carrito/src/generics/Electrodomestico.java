package generics;

public class Electrodomestico extends Producto{
	
	private String tipo;
	private String marca;
	
	public Electrodomestico(String nombre, double precio,String tipo, String marca) {
		super(nombre,precio);
		this.tipo=tipo;
		this.marca=marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

}
