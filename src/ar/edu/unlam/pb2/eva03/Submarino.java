package ar.edu.unlam.pb2.eva03;

public class Submarino extends Vehiculo implements Acuatico {

	private Double profundidad;
	
	public Submarino(Integer codigo, String nombre) {
		super(codigo, nombre);
		// TODO Auto-generated constructor stub
		this.profundidad=0.0;
	}
	

	public Submarino(String codAlfanumerco, String nombre) {
		super(codAlfanumerco, nombre);
		// TODO Auto-generated constructor stub
		this.profundidad=0.0;
	}

	
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

}
