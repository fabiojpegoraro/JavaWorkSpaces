package br.unittest.utils;

import org.junit.Assert;
import org.junit.Test;

import br.unittest.utils.Calculos;

public class CalculosTests {
    
	
	@Test
	public void TesteSomar()
    {
    	Calculos soma = new Calculos();
    	//int resultado = soma.Somar(1, 2);
    	
        //Estamos exibindo o resultado da soma
    	//System.out.println(Integer.toString(resultado));
        
    	//Comparando o resultado da soma com um valor esperado
    	//System.out.println(soma.Somar(1, 2, 0) == 4);
    	
    	Assert.assertTrue(soma.Somar(1, 2) == 3);
    	Assert.assertTrue(soma.Subtrair(3, 2) == 1);
    	Assert.assertEquals(soma.Somar(1, 2), 3);
    	Assert.assertEquals(0.45234, 0.45288, 0.01);
    	
    }
	
	@Test
	public void TesteSubtrair() {
		Calculos subtrair = new Calculos();
		Assert.assertTrue(subtrair.Subtrair(3, 3) == 0);
	}
	
	@Test
	public void TestarDividir() {
		Calculos dividir = new Calculos();
		Assert.assertTrue(dividir.Dividir(3, 0) == 0.0);
	}

}
