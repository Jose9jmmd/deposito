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
	
	public double num1;
	public double num2;
	public double res;
	
	public DepositoCombuestibleTestParametrizadaLlenar(double num1, double num2, double res) {
		this.num1 = num1;
		this.num2 = num2;
		this.res = res;
	}
	
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][] {
			{30.0, 20.0,50.0},{30.0,5.0,35.0},{30.0,-5.0,25.0}
		});
	}
	
	@Test
	public void testFill() {
		DepositoCombustible dc = new DepositoCombustible(50,num1);
		dc.fill(num2);
		assertEquals(res, dc.getDepositoNivel(),0);
	}

}
