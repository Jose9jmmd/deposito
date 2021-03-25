package com.deposito;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DepositoCombuestibleTestParametrizadaLlenar {
	
	public double num;
	public double res;
	
	public void DepositoCombuestibleParametrizada(double num, double res) {
		this.num = num;
		this.res = res;
	}
	
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][] {
			{20,50},{5,35},{-5,25}
		});
	}
	
	@Test
	public void testFill() {
		DepositoCombustible dc = new DepositoCombustible(50,30);
		double resultado = dc.fill(num);
		assertEquals(res, resultado);
	}

}
