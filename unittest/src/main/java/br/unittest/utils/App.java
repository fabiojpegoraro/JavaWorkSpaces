package br.unittest.utils;

import org.junit.Assert;
import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    @Test
	public void Teste()
    {
    	Calculos soma = new Calculos();
    	//int resultado = soma.Somar(1, 2);
    	
        //Estamos exibindo o resultado da soma
    	//System.out.println(Integer.toString(resultado));
        
    	//Comparando o resultado da soma com um valor esperado
    	//System.out.println(soma.Somar(1, 2, 0) == 4);
    	
    	Assert.assertTrue(soma.Somar(1, 2) == 3);
    	
    }
}
