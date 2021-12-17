package practicaSemana4;


public class TorreDeControl {

	public static void main(String[] args) {
	
		Avion a = new Avion("Avianca","XRL9", "9 personas");
		Helicoptero h = new Helicoptero("Militar","KTM3", "8 personas");
		Superman s = new Superman("Clark","roja", "azul");
		Ovni o = new Ovni("Marvin","martes", 4);
		
		Volador[] voladores = new Volador[] {a,h,s,o};
		
		for(Volador v: voladores) {
		
		if(v instanceof Aterrizable) {
			
			Aterrizable atr = (Aterrizable)v;
			
			Resultado res = atr.Aterrizar();
			
		}else {
			System.out.println("no cumple el contrato no puede aterrizar en la pista");
		}
		
		}
		
	}

}
