import javax.swing.*;

public class index {
    public static void main(String [] args)
    {
        String numero = "";
        numero=JOptionPane.showInputDialog(null,"Digite seu cep");
        endereco endereco = new endereco();
        JOptionPane.showMessageDialog(null,endereco.getCep(numero).getAll());
    }
}
