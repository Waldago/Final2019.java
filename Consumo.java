public class Consumo  implements Comparable<Consumo> {
	
	private List <Plato> platos;
	private Integer comensal;
	
	public Consumo(Integer comensal) {
		this.setPlatos(new LinkedList());
		this.setComensal(comensal);
	}
	
	public void agregarP(Plato p) {
		this.getPlatos().add(p);
	}
	
	public Integer precioT() {
		Integer x = 0;
		for(Plato p : this.getPlatos()) {
			x = p.getPrecio() + x;
		}
		return x;
	}
	
	public int compareTo(Consumo c) {
		if(this.getComensal()<c.getComensal()) return -1;
		if(this.getComensal()==c.getComensal()) return 0;
		return 1;			
	}
	
	public void setPlatos(List<Plato> platos) {
		this.platos = platos;
	}

	public List<Plato> getPlatos() {
		return platos;
	}

	public Integer getComensal() {
		return comensal;
	}
	public void setComensal(Integer comensal) {
		this.comensal = comensal;
	}

	@Override
	public String toString() {
		return "Consumo [platos=" + platos + ", comensal=" + comensal + "]";
	}
	
}
