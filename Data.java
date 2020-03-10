import javax.swing.JOptionPane;
public class Data {
   public static void main (String [] args) {
   
   int dia =  Integer.parseInt (javax.swing.JOptionPane.showInputDialog("Digite o dia"));
   int mes =  Integer.parseInt (javax.swing.JOptionPane.showInputDialog("Digite o mes"));
   int ano =  Integer.parseInt (javax.swing.JOptionPane.showInputDialog("Digite o ano"));
   
   JOptionPane.showMessageDialog (null, dia + " / " + mes + " / " + ano);
   
   }
}