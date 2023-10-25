package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;

	public FuerzaArmada() {
		super();
		this.convoy = new HashSet<>();
		this.batallas = new HashMap<>();
	}

	public void agregarVehiculo(Vehiculo nuevo) {
		// TODO Auto-generated method stub
		if(nuevo.getCodigo()!=null)
			convoy.add(nuevo);
		
	}

	public Integer getCapacidadDeDefensa() {
		// TODO Auto-generated method stub
		return convoy.size();
	}
	
	public void crearBatalla(String nombre,TipoDeBatalla tipo, Double latitud, Double longitud) {
		
		batallas.put(nombre, new Batalla(latitud,longitud,tipo));
	}

	public Set<Vehiculo> getConvoy() {
		return convoy;
	}

	public void setConvoy(Set<Vehiculo> convoy) {
		this.convoy = convoy;
	}

	public Batalla getBatalla(String string) throws NoExisteBatallaExeption {
	for (Map.Entry<String, Batalla> entry : batallas.entrySet()) {
		String key = entry.getKey();
		Batalla val = entry.getValue();
		if(string.equals(key)) {
			return val;
		}
	}
	throw new NoExisteBatallaExeption("batalla no existente");
	}

	public void setBatallas(Map<String, Batalla> batallas) {
		this.batallas = batallas;
	}

	public void crearBatalla(String tipo, Double latitud, Double longitud, String string) {
		// TODO Auto-generated method stub
		TipoDeBatalla tipoEnEnum=TipoDeBatalla.valueOf(tipo.toUpperCase());
		batallas.put(string, new Batalla(latitud,longitud,tipoEnEnum));
	}
	
	public void crearBatallaConEnum(String nombre,TipoDeBatalla tipo, Double latitud, Double longitud) {
		// TODO Auto-generated method stub
		batallas.put(nombre, new Batalla(latitud,longitud,tipo));
	}

	public void presentarBatalla(String nombre) throws NoExisteBatallaExeption {
		// TODO Auto-generated method stub
		getBatalla(nombre);
		
	}

	public Vehiculo buscarVehiculo(Integer id) throws VehiculoInexistente{
		for (Vehiculo vehiculo : convoy) {
			if(vehiculo.getCodigo().equals(id)) {
				return vehiculo;
			}
		}
		throw new VehiculoInexistente("auto No Existente");
	}
	
	
	public Boolean enviarALaBatalla(String string, int i) throws VehiculoIncompatible, VehiculoInexistente {
		// TODO Auto-generated method stub
		Vehiculo vehiculo=buscarVehiculo(i);
        TipoDeBatalla tipo = batallas.get(string).getTipo();
        
        switch(tipo) {
		case TERRESTRE:
			if(vehiculo instanceof Terrestre) {
				return true;
			}
			throw new VehiculoIncompatible();
			
		case VOLADOR:
			if(vehiculo instanceof Volador) {
				return true;
			}
			throw new VehiculoIncompatible();
		
		case NAVAL:
			if(vehiculo instanceof Acuatico) {
				return true;
			}
			throw new VehiculoIncompatible();
		}
		return false;
	}

	
	
}
