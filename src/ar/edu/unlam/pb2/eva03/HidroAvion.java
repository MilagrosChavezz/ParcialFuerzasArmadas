package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Volador,Acuatico{

	private Double altura;
	private Double profundidad;
	
	public HidroAvion(Integer codigo, String nombre) {
		super(codigo, nombre);
		// TODO Auto-generated constructor stub
		altura=0.0;
		profundidad=0.0;
	}
	
	public HidroAvion(String codAlfanumerco, String nombre) {
		super(codAlfanumerco, nombre);
		// TODO Auto-generated constructor stub
		altura=0.0;
		profundidad=0.0;
	}

	@Override
	public Double getProfundidad() {
		// TODO Auto-generated method stub
		return profundidad;
	}

	@Override
	public Double getAltura() {
		// TODO Auto-generated method stub
		return altura;
	}
	
	

}
