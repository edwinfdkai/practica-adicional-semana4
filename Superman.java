package practicaSemana4;

public class Superman extends Volador {
	
	private String colorDeCapa;
	private String colorDeTraje;
	
	
	
	public Superman(String nombre, String colorDeCapa, String colorDeTraje) {
		super(nombre);
		this.colorDeCapa = colorDeCapa;
		this.colorDeTraje = colorDeTraje;
	}
	


	public String getColorDeCapa() {
		return colorDeCapa;
	}
	public void setColorDeCapa(String colorDeCapa) {
		this.colorDeCapa = colorDeCapa;
	}
	public String getColorDeTraje() {
		return colorDeTraje;
	}
	public void setColorDeTraje(String colorDeTraje) {
		this.colorDeTraje = colorDeTraje;
	}
	
	public String toString() {
		return "Superman [colorDeCapa=" + colorDeCapa + ", colorDeTraje=" + colorDeTraje + "]";
	}
	
}
