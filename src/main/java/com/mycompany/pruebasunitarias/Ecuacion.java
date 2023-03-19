/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebasunitarias;

/**
 *
 * @author franc
 */
public class Ecuacion {
    private Parseador parseador = new Parseador();

	public double obtenerResultado(final String ecuacion) {

		int parte1 = parseador.obtenerParte1(ecuacion);
		int parte2 = parseador.obtenerParte2(ecuacion);
		int parte3 = parseador.obtenerParte3(ecuacion);
		double resultado = Double.valueOf((parte3 - parte2)) / Double.valueOf(parte1);
		return resultado;
	}
}

class Parseador {

	public int obtenerParte1(final String ecuacion) {

		String[] partes1 = obtenerPartes12(ecuacion);

		String parte1 = partes1[0].trim();

		return Integer.valueOf(parte1.substring(0, parte1.length() - 1));
	}

	public int obtenerParte2(final String ecuacion) {

		String[] partes1 = obtenerPartes12(ecuacion);

		String parte2 = partes1[1].trim();

		String operador = obtenerOperador(ecuacion);

		if ("-".equals(operador)) {
			return Integer.valueOf(parte2) * (-1);
		}

		return Integer.valueOf(parte2);
	}

	public String obtenerOperador(final String ecuacion) {
		if (ecuacion.indexOf('+') > 0) {
			return "+";
		} else {
			return "-";
		}
	}

	public int obtenerParte3(final String ecuacion) {
		String[] partesEcuacion = ecuacion.split("=");
		return Integer.valueOf(partesEcuacion[1].trim());
	}

	private String[] obtenerPartes12(final String ecuacion) {
		String[] partesEcuacion = ecuacion.split("=");

		String operador = obtenerOperador(ecuacion);

		String[] partes1 = partesEcuacion[0].split("\\" + operador);

		return partes1;
	}
}
