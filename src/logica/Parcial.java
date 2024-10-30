package logica;

import java.util.ArrayList;

public class Parcial {
	
	public ArrayList<Double> cuadratica (double a, double b, double c) throws Exception {
		double discriminante = (Math.pow(b, 2))-(4*a*c);
		ArrayList<Double> respuestaFinal = new ArrayList<>();
		if (discriminante < 0) {
			throw new Exception ("Ninguna de las soluciones son reales");
		} else if (a == 0.0) {
			throw new Exception ("No es una función cuadratica");	
		} else { 
			double respuesta1 = (-b + Math.sqrt(discriminante))/(2*a);
			double respuesta2 = (-b - Math.sqrt(discriminante))/(2*a);
			
			if (respuesta1==respuesta2) {
				respuestaFinal.add(respuesta1);
				
			} else {
				respuestaFinal.add(respuesta1);
				respuestaFinal.add(respuesta2);
				
			}return respuestaFinal;}}}



