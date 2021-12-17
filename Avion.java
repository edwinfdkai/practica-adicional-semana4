package practicaSemana4;

public class Avion extends Volador implements Aterrizable {

	private String modeloAvion;
	private String capacidadDeAvion;
	
	
	public String getModeloAvion() {
		return modeloAvion;
	}


	public void setModeloAvion(String modeloAvion) {
		this.modeloAvion = modeloAvion;
	}


	public String getCapacidadDeAvion() {
		return capacidadDeAvion;
	}


	public void setCapacidadDeAvion(String capacidadDeAvion) {
		this.capacidadDeAvion = capacidadDeAvion;
	}

		public Avion(String nombre, String modeloAvion, String capacidadDeAvion) {
		super(nombre);
		this.modeloAvion = modeloAvion;
		this.capacidadDeAvion = capacidadDeAvion;
	}


	@Override
	public String toString() {
		return "Avion [modeloAvion=" + modeloAvion + ", capacidadDeAvion=" + capacidadDeAvion + "]";
	}


	public Resultado Aterrizar() {
		System.out.println("El avion puede aterrizar en la pista");
		return null;
		
	}
	
	
}
