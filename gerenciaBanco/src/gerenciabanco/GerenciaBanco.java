
package gerenciabanco;

import java.util.*;
//import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.lang.Integer;
/**
 *
 * @author Natan Ogliari
 */
public class GerenciaBanco {
    
    
    public static class cliente{
        String nome;
        int cpf;
        String conta;
        
        
        public void Cliente(){
            //addPila();
    
        }
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        while(true){
            // Scanner menu = new Scanner(System.in);// habilita a leitura pelo teclado
            JOptionPane.showMessageDialog(null,"Bem vindo ao banco Saracura do Banhado\n");
            String opcao = JOptionPane.showInputDialog(null,"Opção 1 - Consulta saldo\n Opção 2 - Realizar um deposito\n Opção 3 - Realizar um saque\n Opção 4 - Sair \n");
        
              //conversão de String para int
            int control = Integer.parseInt(opcao);
        
              //controle de erro
            if ("opcao"  == null){//caso o usuario cancele a opção
                JOptionPane.Dialog(null, "Você cancelou a operação");
                break;            
            }        
        }
               
    }
    
}
