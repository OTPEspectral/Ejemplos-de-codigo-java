package unidad1Programacion;

public class ejemplo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tipos de datos y sus valores
		byte edadempleado =45;
		short edad =23;
		float notamedia =7.34f;
		double pi = 3.1415;
		boolean esmayoredad = false; //false/true
		char letrapuerta = 'B';
		String	telefono = "(0034) - 622906742";
		
		//Color de pelo
		String pelocolor = "Moreno";
		// Tipo de pelo
		String pelotipo = "Militar";
		// Edad
		Short edad2 = 20000;
		// HP
		int vida = 100;
		// Peso
		float  peso = 69.1f;
		// Ataque
		int atk = 8;
		// no-muerto?
		boolean nomuerto = false;
		//Mana
		int mana = 60;
		//Nivel
		short nivel = 1;
		//Subida de nivel;
		nivel++;
		
		//Para aumentar los puntos de vida:
		vida += 20;
		//Si sacamos por pantalla de esta forma,
		//primero imprimimos el nivel y luego sumamos 1
		System.out.println(nivel++);
		
		//Si ponemos ++nivel primero se suma y luego
		//imprime por pantalla
		System.out.println(++nivel);
	}

}
