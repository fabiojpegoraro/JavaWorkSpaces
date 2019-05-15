package br.unittest.utils;

public class Calculos {
	
	private int num1;
	private int num2;
	private int resultado;
	private float resultadodiv;

	
	public float getResultadodiv() {
		return resultadodiv;
	}
	public void setResultadodiv(float resultadodiv) {
		this.resultadodiv = resultadodiv;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}
	
	public int Somar(int valor1, int valor2) {
		num1 = valor1;
		num2 = valor2;
		
		resultado = valor1 + valor2;
		
		return resultado;
	}
	
	public int Subtrair(int valor1, int valor2) {
		num1 = valor1;
		num2 = valor2;
		
		resultado = valor1 - valor2;
		
		return resultado;
	}
	
	public float Dividir(int valor1, int valor2) {
		
		num1 = valor1;
		num2 = valor2;
		
		try {
			resultadodiv = num1/num2;
		}catch(Exception ex){
			
		}
		finally {
			
		}
		
		return resultadodiv;
		
	}

}
