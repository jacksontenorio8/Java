package one.digitalinnovation.tipos.tipagem;

public class TipagemForte {
	
	public static void main(String[] args) {
		
		String texto = "meu texto";
		
		texto = 1000;   //NOK
		
		Integer numero = 1024;
		
		numero = 512;   //OK
	}
}