package ar.edu.unlam.transito;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Mapa {
	
	private String cuidad;
	private Set<MedioTransporte> vehiculosCircundantes;

	public Mapa (String cuidad) {
		this.cuidad = cuidad;
		vehiculosCircundantes = new HashSet<MedioTransporte>();
	}
	
	public void agregarVehiculo(MedioTransporte nuevo) {
		vehiculosCircundantes.add(nuevo);
	}
	public Boolean hayCoalición() throws ColitionException {
		Boolean chocaron = false;
		for (MedioTransporte x : vehiculosCircundantes) {
			for (MedioTransporte p : vehiculosCircundantes) {
				if(x!=p && x.getLatitud().equals(p.getLatitud()) && x.getLongitud().equals(p.getLongitud())) {
					chocaron = true;
					throw new ColitionException("nos hicimos torta");
				}
			}
		}
		return chocaron;
	}

	public String getCuidad() {
		return cuidad;
	}

	public void setCuidad(String cuidad) {
		this.cuidad = cuidad;
	}

	public HashSet<MedioTransporte> getVehiculosCircundantes() {
		return (HashSet<MedioTransporte>) vehiculosCircundantes;
	}

	public void setVehiculosCircundantes(HashSet<MedioTransporte> vehiculosCircundantes) {
		this.vehiculosCircundantes = vehiculosCircundantes;
	}
	public Integer getCantidadDeVehiculos() {
		return vehiculosCircundantes.size();
	}
	

}
