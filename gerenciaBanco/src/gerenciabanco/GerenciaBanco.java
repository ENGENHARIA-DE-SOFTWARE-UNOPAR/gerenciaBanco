
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
        String cpf;
        String conta;
        String saldo;
        
        
        public void Conta(){
            int numConta;
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
        
        cliente cliente = new cliente();
        
        cliente.nome = JOptionPane.showInputDialog(null, "Informe seu Nome.", "Nome");
        cliente.sobrenome = JOptionPane.showInputDialog(null, "Informe seu Sobrenome.","Sobrenome");
        cliente.cpf = JOptionPane.showInputDialog(null, "Informe o numéro do CPF.","000.000.000-00");
        
        while(true){            
            String opcao = JOptionPane.showInputDialog(null,"Opção 1 - Consulta saldo\n Opção 2 - Realizar um deposito\n Opção 3 - Realizar um saque\n Opção 4 - Sair \n",4);//deixa a opçã4 4 como deful
            //conversão de String para int
            
            //Object[] itens = {"Saque","Consulta Saldo","Realiza Saque","Sair"};//!<Para melhorias
            //Object valorSelecionado = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,itens, itens [0]);
            
            int control = Integer.parseInt(opcao);
        
              //controle de erro
            if ("opcao"  == null){//caso o usuario cancele a opção
                JOptionPane.showMessageDialog(null, "Você cancelou a operação");
                break;            
            }
            if (control == 4){//para sair da operação
                JOptionPane.showMessageDialog(null,"Volte sempre "+cliente.nome+" "+cliente.sobrenome+"\nTenha um bom dia!", "LOGOUT", JOptionPane.INFORMATION_MESSAGE, icon);//add custon icon
                break;
            }
            switch (control){
                case 1:
                    JOptionPane.showMessageDialog(null,"Consulta saldo.", cliente.nome+" "+cliente.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);//add custon icon
                    
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Realizar um deposito.", cliente.nome+" "+cliente.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);
                    int pilaDeposito = Integer.parseInt(JOptionPane.showInputDialog(null,"Informa a quantidade em Reais (R$) a ser depositado na conta do "+cliente.nome+" "+cliente.sobrenome));
                    
                    
                    JOptionPane.showMessageDialog(null,"Seu Saldo é ", cliente.saldo, JOptionPane.INFORMATION_MESSAGE, icon);
                    
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Realiza um saque.", cliente.nome+" "+cliente.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);
                    
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção invalida.");
                    break;
            }
        }
               
    }
    
}
