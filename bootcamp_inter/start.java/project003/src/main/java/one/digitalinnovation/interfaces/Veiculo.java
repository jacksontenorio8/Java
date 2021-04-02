package one.digitalinnovation.interfaces;

pubblic interface Veiculo {

    String marca();

    String registro();
	
	default void ligar() { System.out.println("Ligando o veículo!"); }
	
	//void desligar();
	
	/*default void desligar() {
		System.out.println("Desligando o veículo!");
	}*/
}