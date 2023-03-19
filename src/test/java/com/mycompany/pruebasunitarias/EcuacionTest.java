/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pruebasunitarias;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author franc
 */
public class EcuacionTest {
    
   Ecuacion ecuacion = new Ecuacion();

	@Test
	public void solucionaEcuacionConMenos() {

		Double result = ecuacion.obtenerResultado("2x - 1 = 0");

		Double valueExpected = 0.5;

		assertEquals(valueExpected, result);
	}

	@Test
	public void solucionaEcuacionConMas() {

		Double result = ecuacion.obtenerResultado("2x + 1 = 0");

		Double valueExpected = -0.5;

		assertEquals(valueExpected, result);
	}

	@Test
	public void solucionaEcuacionConParte3Mayor0() {

		Double result = ecuacion.obtenerResultado("2x + 1 = 10");

		Double valueExpected = 4.5;

		assertEquals(valueExpected, result);
	}


}