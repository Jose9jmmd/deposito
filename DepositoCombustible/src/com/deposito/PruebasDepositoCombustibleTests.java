package com.deposito;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DepositoCombuestibleTestParametrizadaConsumir.class, DepositoCombuestibleTestParametrizadaLlenar.class,
		DepositoCombustibleTest.class })
public class PruebasDepositoCombustibleTests {

}
