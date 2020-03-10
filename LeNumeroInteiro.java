import javax.swing.JOptionPane;
public class LeNumeroInteiro {
   public static void main (String [] args) {
  
   int numero = Integer.parseInt (javax.swing.JOptionPane.showInputDialog("Digite um Inteiro"));
   
   JOptionPane.showMessageDialog (null, "O valor do numero digitado �: " + " "+ numero);
   
   }
}