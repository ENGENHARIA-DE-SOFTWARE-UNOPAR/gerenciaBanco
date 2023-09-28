
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
        String sobrenome;
        int cpf;
        String conta;
        
        
        public void Conta(){
            int numConta;
            String titularConta;
            double saldo;
        }    
        public void depositaSaldo(double pilas, String titularConta){
            int z;
                   
        }
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ImageIcon icon = new ImageIcon("C:\\Users\\AULA-1\\Documents\\(Engenharia de Software)\\Fase 3\\Linguagem Orientada a Objetos\\gerenciaBanco\\gerenciaBanco\\src\\gerenciabanco\\saracura.jpg");
        JOptionPane.showMessageDialog(null,"Bem vindo ao Banco Saracura do Banhado\n", "INÍCIO", JOptionPane.INFORMATION_MESSAGE, icon);//add custon icon
        while(true){
            // Scanner menu = new Scanner(System.in);// habilita a leitura pelo teclado
            cliente cliente = new cliente();
            
            cliente.nome = JOptionPane.showInputDialog(null, "Informe seu Nome.");
           
            
            String opcao = JOptionPane.showInputDialog(null,"Opção 1 - Consulta saldo\n Opção 2 - Realizar um deposito\n Opção 3 - Realizar um saque\n Opção 4 - Sair \n",4);//deixa a opçã4 4 como deful
            //conversão de String para int
            int control = Integer.parseInt(opcao);
        
              //controle de erro
            if ("opcao"  == null){//caso o usuario cancele a opção
                //JOptionPane.showMessageDialog(null, "Você cancelou a operação");
                break;            
            }
            if (control == 4){//para sair da operação
                JOptionPane.showMessageDialog(null, "Volte sempre\nTenha um bom dia!.");
                break;
            }
            switch (control){
                case 1:
                    JOptionPane.showMessageDialog(null, "Consulta saldo.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Realizar um deposito.");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Realiza um saque.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção invalida.");
                    break;
            }
        }
               
    }
    
}
