public class Plato {
	private String descripcion;
	private Integer precio;
	
	public Plato(String descripcion, Integer precio) {
		this.setDescripcion(descripcion);
		this.setPrecio(precio);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Plato [descripcion=" + descripcion + ", precio=" + precio + "]";
	}
	
	
}
