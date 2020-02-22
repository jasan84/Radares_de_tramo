package radares;

import java.util.Scanner;

public class Radares {
	
	public static void main(String[] args) {
	
	double distancia = 0;
	double velocidad_maxima = 0;
	double velocidad_empleada = 0;
	double tiempo_recorrido = 0;
	
	double porcentaje_exceso = 0;
	
	String resolucion = "";
	
	Scanner entrada = new Scanner(System.in);
	
// SOLICITA DATOS
	
	do {
		System.out.println("INGRESA LA DISTANCIA");	
		distancia = entrada.nextInt();
		
		System.out.println("INGRESA LA VELOCIDAD MÁXIMA PERMITIDA");	
		velocidad_maxima = entrada.nextInt();
		
		System.out.println("INGRESA EL TIEMPO DE RECORRIDO");
		tiempo_recorrido = entrada.nextInt();
		
		
// CÁLCULO DE VELOCIDAD
		
		velocidad_empleada = ((3600*distancia)/tiempo_recorrido)/1000;
		
// RESOLUCION SEGÚN VELOCIDAD
		
		if(velocidad_empleada <= velocidad_maxima) {
			resolucion = "OK";
		} else {
			
			porcentaje_exceso = velocidad_maxima*0.20;
			porcentaje_exceso = porcentaje_exceso+velocidad_maxima;
			
			if(velocidad_empleada < porcentaje_exceso) {
				resolucion = "MULTA";
			}else {
				resolucion = "PUNTOS";
			}
		}
		
		if(distancia < 0 || velocidad_maxima < 0 || tiempo_recorrido < 0) {
			resolucion = "ERROR";
		}
		
		if(distancia == 0 && velocidad_maxima ==0 && tiempo_recorrido == 0) {
			resolucion = "";
		}
		
		System.out.println(resolucion);
		
	}while(distancia !=0 && velocidad_maxima !=0 && tiempo_recorrido != 0);
	
	
	}

}
