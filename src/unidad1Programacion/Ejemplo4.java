package unidad1Programacion;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejemplo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="";
		int edad =0;
		String clase="";
		
		clase=JOptionPane.showInputDialog(null, "Clase", "Introduce datos", JOptionPane.QUESTION_MESSAGE);
		
		
		//Creamos un objeto Scanner para leer el teclado (System.in)
		Scanner	teclado = new Scanner (System.in);
		
		System.out.print("Introduce tu nombre");
		//Leemos por teclado una string con nextLine de Scanner
		nombre=teclado.nextLine();
		
		System.out.print("Introduce tu edad");
		//Leemos por teclado con nextInt un número
		edad=teclado.nextInt();
		

		
		//IMPORTANTE cerrar funciones que terminemos de usar
		teclado.close();
		
		System.out.println("Hola " + nombre + " ,tienes " + edad + " años, bienvenido a Java" + clase +"");
	}

}
