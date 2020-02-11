public class CuentaCompartida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	private LinkedList<Consumo> ticket;
	private Integer nComensales;
	static final int CUBIERTO=100;
	
	public CuentaCompartida(int nComensales) {
		this.setnComensales(nComensales);
		this.setTicket(new LinkedList());
	}
	
	public void agregarConsumo(Consumo c) {
		this.getTicket().add(c);
	}
	
	public Integer consultaConsumo(Integer x) {
		Integer n = 0;
		for (Consumo c : this.getTicket()) {
			if (x==c.getComensal()) {
				n = c.precioT() + n;
			}
		}
		return n;
	}

	public Integer totalCuenta() {
		Integer x = 0;
		for (Consumo c : this.getTicket()) {
			x = c.precioT()+x;
		}
		return x;
	}
	
	public Integer romana() {
		return (this.totalCuenta()/this.getnComensales());
	}
	
	public void perjudicado() {
		Integer m = this.romana();
		for (Consumo c : this.getTicket()) {
			if(c.precioT()>m) {
				System.out.println("Comensal que fue favorecido:"+c.getComensal());
			}
		}
	}
	
	public Integer maximo() {
		Integer max = this.getTicket().getFirst().getComensal();
		Integer temp = this.getTicket().getFirst().precioT();
		for (int i = 1; i<this.getTicket().size();i++) {
			if(temp<this.getTicket().get(i).precioT()) {
				max=this.getTicket().get(i).getComensal();
				temp=this.getTicket().get(i).precioT();
			}
		}
		return max;
	}
	
	public void archivar() throws IOException{
		Collections.sort(ticket);
		String path=("C:\\");
		BufferedWriter b = new BufferedWriter(new FileWriter(path + "miCena.out.txt"));
		for (Consumo c : this.getTicket()) {
			b.write("Comensal:" + c.getComensal());
			b.newLine();
			for (Plato p : c.getPlatos()) {
			b.write(" Plato:"+p.getDescripcion()+" Precio: $"+p.getPrecio());
			b.newLine();
			}
		}
		b.write("Valor Cubierto por "+this.getnComensales()+": $"+(this.getnComensales()*CUBIERTO));
		b.newLine();
		b.write("Importe total de la cuenta: $"+(this.totalCuenta()+(this.getnComensales()*CUBIERTO)));
		b.close();
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaCompartida other = (CuentaCompartida) obj;
		if (nComensales == null) {
			if (other.nComensales != null)
				return false;
		} else if (!nComensales.equals(other.nComensales))
			return false;
		if (ticket == null) {
			if (other.ticket != null)
				return false;
		} else if (!ticket.equals(other.ticket))
			return false;
		return true;
	}

	public LinkedList<Consumo> getTicket() {
		return ticket;
	}

	public void setTicket(LinkedList<Consumo> ticket) {
		this.ticket = ticket;
	}

	public Integer getnComensales() {
		return nComensales;
	}

	public void setnComensales(Integer nComensales) {
		this.nComensales = nComensales;
	}

	@Override
	public String toString() {
		return "CuentaCompartida [ticket=" + ticket + ", nComensales=" + nComensales + "]";
	}
	
	
}
