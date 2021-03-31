// Program that says the screen resolution.
import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDoSistema {
    public static void main(String[] args){
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        System.out.println("Your screen has resolution " + lar + " x " +alt);
    }
}