package java_fun.epn.practica4;

import java.util.*;


public class Vehiculo {
	
	private String color, placa, marca;
	private int modelo,fecha;
	
	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}




	private String cliente;
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Vehiculo(){
		
	}
	
		
	
	public void ingreso(){
		
		String entrada;
		int opt;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del Cliente: "); 
		entrada = scan.nextLine();
		System.out.println("Ingrese la marca del Vehiculo: "); 
		entrada = scan.nextLine();
		marca = entrada;
		/*System.out.println("Ingrese la placa del Vehiculo: "); 
		entrada = scan.nextLine();
		placa= entrada;
		System.out.println("Ingrese el color del Vehiculo: "); 
		entrada = scan.nextLine();
		color= entrada;*/
		System.out.println("Ingrese el a–o de venta del Vehiculo: "); 
		entrada = scan.next();
		opt = Integer.parseInt(entrada);
		fecha = opt;
			
	}
	
	
	
		
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
	
	
	
public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		Scanner scan0 = new Scanner(System.in);
		int opt, opt0;
		String entrada,entrada0;
		
		
		
		System.out.println("*********BIENVENIDO!!!***********************************");
		System.out.println(" Programa para Administrar un Patio de Venta de Vehiculos");
		System.out.println("*********************************************************");
		
		System.out.println("Opciones:");
		/*System.out.println("Lista de Empleados y Telefonos 		-> presione 1");
		System.out.println("Agregar Empleado  			-> presione 2");
		System.out.println("Modificar Empleado existente 		-> presione 3");*/
		
		
		Map<String, Integer> clientes = new HashMap<String, Integer>();
		Set<Moto> moti = new HashSet<Moto>();
		Set<Moto> vMoto = new HashSet<Moto>();
		Set<Buseta> vBuseta = new HashSet<Buseta>();
		Set<Trailer> vTrailer = new HashSet<Trailer>();
		Moto moto;
		Buseta buseta;
		Trailer trailer;
		System.out.println("Registrar Venta			1");
		System.out.println("Clientes repetidos		2");
		System.out.println("Clientes de una marca		3");
		System.out.println("Imprimir Registro de Ventas	4");
		System.out.println();
		entrada0 = scan0.next();
		opt0 = Integer.parseInt(entrada0);
		while(opt0>0 && opt0<5){
			switch(opt0)
			{
			case 1:
				System.out.println("Ingresar Moto 1, Buseta 2, Trailer 3: Salir 4"); 
				entrada = scan.next();
				opt = Integer.parseInt(entrada);
				lazo1: while(opt>0 && opt<4){
		
				//opt=1;
				switch(opt){
				case 1:
					moto = new Moto();
					moto.ingreso();
					vMoto.add(moto);
					break;
				case 2:
					buseta= new Buseta();
					buseta.ingreso();
					vBuseta.add(buseta);
					break;
				case 3:
					 trailer= new Trailer();
					 trailer.ingreso();
					 vTrailer.add(trailer);
					 break;
				}
				
				
				/*for(Moto unidad : vMoto){
					System.out.println(unidad);		
				}
				
				for(Buseta unidad : vBuseta){
					System.out.println(unidad);		
				}
				
				for(Trailer unidad : vTrailer){
					System.out.println(unidad);		
				}*/
				if(opt==4)
					break lazo1;
				else
				{System.out.println("Ingresar Moto 1, Buseta 2, Trailer 3: "); 
				entrada = scan.next();
				opt = Integer.parseInt(entrada);}
				}
				break;
			case 4:
				for(Moto unidad : vMoto)
					System.out.println(unidad);		
				
				for(Buseta unidad : vBuseta)
					System.out.println(unidad);		
			
				for(Trailer unidad : vTrailer)
					System.out.println(unidad);	
				break;
			
				
			}	
		
		}
		
		/*moto = new Moto();
		moto.ingreso();
		entrada=moto.toString();
		System.out.println(entrada);*/
		
		/*Map<String, Integer> empleados1;
		empleados1 = new HashMap<String, Integer>(); 
		*/
		
		
		
		/*moti.add(new Moto("vla jar","m1","p1","c1",2001));
		
		moti.add(new Moto("anib", "m2","p2","c2",2002));
		moti.add(new Moto("rob","m1","p3","c3",2003));
		moti.add(new Moto("vla jar","m1","p4","c4",2004));
		moti.add(new Moto("vla jar","m2","p4","c4",2009));*/
		
		/*for(Moto motito : moti){
			System.out.println(motito);
		}*/
		 
		
		/*Set<String> moti = new TreeSet<String>();
		
		moti.add("one");
		moti.add("two");
		moti.add("three");
		moti.add("four");
		
		for(String motito : moti){
			System.out.println(motito);
		}*/
		
		//buscando marcas
		
		/*System.out.println();
		String marca="m3", compara;
		for(Moto motito : moti){
			if(motito.getMarca()==marca)
				System.out.println(motito);
			
		//buscando clientes repetidos
				
		}*/
		
		
		//System.out.println("Sunday");
		
	}


}
