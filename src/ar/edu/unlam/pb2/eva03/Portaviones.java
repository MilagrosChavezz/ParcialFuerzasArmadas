package ar.edu.unlam.pb2.eva03;

public class Portaviones extends Vehiculo implements Acuatico{

	private Double profundidad;
	
	public Portaviones(Integer codigo, String nombre) {
		super(codigo, nombre);
		// TODO Auto-generated constructor stub
		this.profundidad=0.0;
	}

	
	public Portaviones(String codAlfanumerco, String nombre) {
		super(codAlfanumerco, nombre);
		// TODO Auto-generated constructor stub
		this.profundidad=0.0;
	}


	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return this.profundidad;
	}
}
