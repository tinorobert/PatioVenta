package java_fun.epn.practica4;

public class Buseta extends Vehiculo{

	@Override
	public String toString() {
		return "Buseta [tipo=" + tipo + ", getFecha()=" + getFecha()
				+ ", getCliente()=" + getCliente() + ", getColor()="
				+ getColor() + ", getPlaca()=" + getPlaca() + ", getMarca()="
				+ getMarca() + ", getModelo()=" + getModelo() + ", hashCode()=" + hashCode() +"]";
	}

	private String tipo;
	
	public Buseta() {
		super();
		tipo="Buseta";
		// TODO Auto-generated constructor stub
	}
	
	

}
