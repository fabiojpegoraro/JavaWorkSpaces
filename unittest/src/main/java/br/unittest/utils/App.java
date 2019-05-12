package br.unittest.utils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculos soma = new Calculos();
    	int resultado = soma.Somar(1, 2);
    	
        //Estamos exibindo o resultado da soma
    	System.out.println(Integer.toString(resultado));
        
    	//Comparando o resultado da soma com um valor esperado
    	System.out.println(soma.Somar(1, 2) == 3);
    }
}
