public class Consola {

	public static void main(String[] args) throws IOException {
		Plato p1 = new Plato("Milanesa con Fritas",100);
		Plato p2 = new Plato("Bife a Caballo",120);
		Plato p3 = new Plato("Ravioles con fileto",150);
		Consumo c1= new Consumo(7);
		Consumo c2= new Consumo(1);
		Consumo c3= new Consumo(5);
		c1.agregarP(p1);
		c1.agregarP(p2);
		c1.agregarP(p3);
		c2.agregarP(p1);
		c2.agregarP(p1);
		c2.agregarP(p3);
		CuentaCompartida r1 = new CuentaCompartida(10);
		r1.agregarConsumo(c1);
		r1.agregarConsumo(c2);
		System.out.println(r1.consultaConsumo(1));
		System.out.println(r1.totalCuenta());
		System.out.println(r1.romana());
		r1.perjudicado();
		System.out.println(r1.maximo());
		r1.archivar();
	}
}
