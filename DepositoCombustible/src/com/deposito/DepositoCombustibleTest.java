package com.deposito;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible dc = new DepositoCombustible(50,30);
		double res = dc.getDepositoNivel();
		assertEquals(30,res,0);
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible dc = new DepositoCombustible(50,30);
		double res = dc.getDepositoMax();
		assertEquals(50,res,0);
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible dc = new DepositoCombustible(50,30);
		boolean res = dc.estaVacio();
		assertTrue(res == false);
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible dc = new DepositoCombustible(50,30);
		boolean res = dc.estaLleno();
		assertTrue(res == false);
	}

}
