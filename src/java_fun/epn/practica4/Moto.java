package java_fun.epn.practica4;

public class Moto extends Vehiculo{

	private String tipo;
	
	public Moto() {
		super();
		tipo="Moto";
		// TODO Auto-generated constructor stub
	}

	public Moto(String cli, String m, String p, String c, int mo) {
		tipo="Moto";
		setCliente(cli);
		setMarca(m);
		setPlaca(p);
		setColor(c);
		setFecha(mo);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "Moto [tipo=" + tipo + ", Cliente()=" + getCliente()
		+", Color()=" + getColor()
				+ ", Placa()=" + getPlaca() + ", Marca()=" + getMarca()
				+ ", Fecha()=" + getFecha()  
				+ ", hashCode()=" + hashCode(); 
	}
	
	
	

}
