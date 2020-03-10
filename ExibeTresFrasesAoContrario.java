import javax.swing.JOptionPane;
public class ExibeTresFrasesAoContrario {
   public static void main (String [] args) {
      //Declarar vari�veis 
      String palavra1;
      String palavra2;
      String palavra3;
      
      //Entrada de dados
      palavra1 = JOptionPane.showInputDialog ("Digite a primeira palavra");
      palavra2 = JOptionPane.showInputDialog ("Digite a segunda palavra");
      palavra3 = JOptionPane.showInputDialog ("Digite a terceira palavra");
      
      //Processamento
      String resultado = palavra3 + ' ' + palavra2 + ' ' + palavra1;
      
      //Sa�da
      JOptionPane.showMessageDialog (null, resultado); 
      
   }

}