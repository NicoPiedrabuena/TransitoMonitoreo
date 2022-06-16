package ar.edu.unlam.transito;

public class MedioTransporte {
	private Double latitud;
	private Double longitud;

	public MedioTransporte(Double latitud, Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public Double getLatitud() {
		return this.latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	public void actualizarCoordenadas(Double nuevaLatitud,Double nuevaLongitud) {
		this.setLatitud(nuevaLatitud);
		this.setLongitud(nuevaLongitud);
	}
	
}
