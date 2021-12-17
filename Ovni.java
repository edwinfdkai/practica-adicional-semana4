package practicaSemana4;

public class Ovni  extends Volador{
	
	private String planetaDeNave;
	private Integer CantidadDeAliens;
	
	
	
	public String getPlanetaDeNave() {
		return planetaDeNave;
	}
	public void setPlanetaDeNave(String planetaDeNave) {
		this.planetaDeNave = planetaDeNave;
	}
	public Integer getCantidadDeAliens() {
		return CantidadDeAliens;
	}
	public void setCantidadDeAliens(Integer cantidadDeAliens) {
		CantidadDeAliens = cantidadDeAliens;
	}
	
	public Ovni(String nombre,String planetaDeNave, Integer cantidadDeAliens) {
		super(nombre);
		this.planetaDeNave = planetaDeNave;
		CantidadDeAliens = cantidadDeAliens;
	}
	
	public String toString() {
		return "Ovni [planetaDeNave=" + planetaDeNave + ", CantidadDeAliens=" + CantidadDeAliens + "]";
	}

	
	
	

}
