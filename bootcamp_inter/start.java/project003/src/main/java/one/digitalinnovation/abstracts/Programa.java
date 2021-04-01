package one.digitalinnovation.abstracts;

public class Programa {
	
	public static void main(String[] args) {
		
		//final FormaGeometrica formaGeometrica = new FormaGeometrica();
		
		final FormaGeometrica quadrado = new Quadrado(nome: "quadrado", area:10.0);
		
		System.out.println(quadrado);
		
		System.out.println(quadrado.desenha(x:12, y:34));
		System.out.println(quadrado.nome());
		System.out.println(quadrado.area());
	}

}