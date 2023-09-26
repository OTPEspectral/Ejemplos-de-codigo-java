package unidad1Programacion;

public class ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tirada20=0;
		
		/** Generamos un numero aleatorio entre 1 y 20 con 
		 * math random. Devuelve un valor entre 0,000001 y 
		 * 0,99999. Lo multiplicamos por 20 para que
		 * entre en el rango que queremos
		 */
		tirada20 = (int)(Math.random()*20+1);
		
		//Le indicamos que nos muestre el resultado
		System.out.println("La tirada de d20 es: " + tirada20);
		
	}

}
