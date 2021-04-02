package one.digitalinnovvation.interfaces;

public interface Carro extendes Automovel{
	
	String marca();

	Double valor();
	
	default void ligar() { System.out.println("Ligando o carro!");
	}
	
	default String codigoRenavan() {
		return "6533jijiio";
	} 
	
}