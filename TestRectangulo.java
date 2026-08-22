package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
	Rectangulo r1 = new Rectangulo() ;
	r1.altura= 5;
	r1.base=4;
	
	int resultadoArea;
	double resultadoPerimetro;
	resultadoArea=r1.calcularArea();
	resultadoPerimetro=r1.calcularPerimetro();
	System.out.println("Resultado rectangulo 1 (Area): "+resultadoArea);
	System.out.println("Resultado rectangulo 1 (Perimetro): "+resultadoPerimetro);
	
	Rectangulo r2= new Rectangulo();
	int resutaldoArea2;
	double resultadoPerimetro2;
	r2.altura=8;
	r2.base=2;
	resutaldoArea2= r2.calcularArea();
	resultadoPerimetro2=r2.calcularPerimetro();
	System.out.println("Resultado rectangulo 2 (Area): "+resutaldoArea2);
	System.out.println("Resultado rectangulo 2 (Perimetro): "+resultadoPerimetro2);
	
	
	}

}
