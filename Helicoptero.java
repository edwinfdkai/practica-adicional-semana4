package practicaSemana4;

public class Helicoptero  extends Volador implements Aterrizable {
	
	private String modeloHelicoptero;
	private String capacidadDeHelicoptero;
	
	
	
	public String getModeloHelicoptero() {
		return modeloHelicoptero;
	}



	public void setModeloHelicoptero(String modeloHelicoptero) {
		this.modeloHelicoptero = modeloHelicoptero;
	}



	public String getCapacidadDeHelicoptero() {
		return capacidadDeHelicoptero;
	}



	public void setCapacidadDeHelicoptero(String capacidadDeHelicoptero) {
		this.capacidadDeHelicoptero = capacidadDeHelicoptero;
	}
	
	


	public Helicoptero(String nombre, String modeloHelicoptero, String capacidadDeHelicoptero) {
		super(nombre);
		this.modeloHelicoptero = modeloHelicoptero;
		this.capacidadDeHelicoptero = capacidadDeHelicoptero;
	}

	
	public String toString() {
		return "Helicoptero [modeloHelicoptero=" + modeloHelicoptero + ", capacidadDeHelicoptero="
				+ capacidadDeHelicoptero + "]";
	}



	public Resultado Aterrizar() {
		System.out.println("El Helicoptero puede aterrizar en la pista");
		return null;
		
	}

}
