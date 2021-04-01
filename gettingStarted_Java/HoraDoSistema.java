/*
- Programa que mostra data e hora atual.
- O uso da palavra "new" cria um novo objeto.
*/

import java.util.Date;

public class HoraDoSistema {
    public static void main(String[] args) {
      Date data = new Date();  
      
      System.out.println("A hora do sistema é");
      System.out.println(data.toString());
    }
}