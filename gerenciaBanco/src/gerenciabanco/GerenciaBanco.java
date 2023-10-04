
package gerenciabanco;

import java.util.*;
//import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.lang.Integer;
import java.lang.Exception;
import java.lang.Error;
import java.lang.reflect.Method;
/**
 *
 * @author Natan Ogliari
 * 
 * @version 0.1
 */
public class GerenciaBanco {
    
        
    public static class cliente{
        String nome;
        String sobrenome;
        String cpf;
        //String conta;
        double saldo;
        ImageIcon icon = new ImageIcon("C:\\Users\\AULA-1\\Documents\\(Engenharia de Software)\\Fase 3\\Linguagem Orientada a Objetos\\gerenciaBanco\\gerenciaBanco\\src\\gerenciabanco\\saracura.jpg");
          
         /**
        * @param nome da conta a ser depositado
        * 
        * @return 1 se deu certo e 0 se ocorreu um erro
        */
        public void depositaPila(double pilas, String nome){
            
            this.saldo += pilas;               
        }
        
         /**
        * @param nome da conta a ser saquada
        * @param pilas valor a ser saquado 
        * @return 1 se deu certo e 0 se ocorreu um erro
        */
        public int saquePila(double pilas, String nome){
            
            if (true){
            
                return 1;
            }
            else{
                return 0;
            }
        }
        
         /**
        * @param nome Passa o nome da conta a ser consultada
        * @return Retorna o saldo da conta
        */
        public double consultaPilas(String nome){
            
            return this.saldo;
        }
    
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ImageIcon icon = new ImageIcon("C:\\Users\\AULA-1\\Documents\\(Engenharia de Software)\\Fase 3\\Linguagem Orientada a Objetos\\gerenciaBanco\\gerenciaBanco\\src\\gerenciabanco\\saracura.jpg");
        
        cliente cliente1 = new cliente();//instancia a cliente
        JOptionPane.showMessageDialog(null,"Bem vindo ao Banco Saracura do Banhado\n", "INÍCIO", JOptionPane.INFORMATION_MESSAGE, icon);//add custon icon

        try {
            cliente1.nome = JOptionPane.showInputDialog(null, "Informe seu Nome.", "Nome");
            
        }
        catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "Entre com um nome válido.");
        }
        
        cliente1.sobrenome = JOptionPane.showInputDialog(null, "Informe seu Sobrenome.","Sobrenome");
        cliente1.cpf = JOptionPane.showInputDialog(null, "Informe o numéro do CPF.","000.000.000-00");
        cliente1.saldo = 445;//remover
        while(true){ //InterruptedIOException
            
            //try{
            String opcao = JOptionPane.showInputDialog(null,"Opção 1 - Consulta saldo\n Opção 2 - Realizar um deposito\n Opção 3 - Realizar um saque\n Opção 4 - Sair \n",4);//deixa a opçã4 4 como deful
            //conversão de String para int
            int control = Integer.parseInt(opcao);
            /** Object[] itens = {"Saque","Consulta Saldo","Realiza Saque","Sair"};//!<Para melhorias>
            Object valorSelecionado = JOptionPane.showInputDialog(null,"Escolha um item", "Opçao",JOptionPane.INFORMATION_MESSAGE, null,itens, itens [0]);
            } */
            
            
      
            
            if ("opcao"  == null){//caso o usuario cancele a opção
                JOptionPane.showMessageDialog(null, "Você cancelou a operação");
                break;            
            }
            if (control == 4){//para sair da operação
                JOptionPane.showMessageDialog(null,"Volte sempre "+cliente1.nome+" "+cliente1.sobrenome+"\nTenha um bom dia!", "LOGOUT", JOptionPane.INFORMATION_MESSAGE, icon);//add custon icon
                break;
            }
            switch (control){
                case 1://consulta de saldo
                    //double temp = cliente1.consultaPilas(cliente1.nome);
                    JOptionPane.showMessageDialog(null,"Consulta saldo.", cliente1.nome+" "+cliente1.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);//add custon icon
                    JOptionPane.showMessageDialog(null,"Seu saldo atual é de: R$" +cliente1.consultaPilas(cliente1.nome), cliente1.nome+" "+cliente1.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);
                    break;
                case 2://realiza deposito
                    JOptionPane.showMessageDialog(null,"Realizar um deposito.", cliente1.nome+" "+cliente1.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);                
                    
                    try {// verifica se a entrada e do tipo numeral
                        double pilaDeposito = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a quantidade em Reais (R$) a ser depositado na conta do "+cliente1.nome+" "+cliente1.sobrenome));
                        cliente1.depositaPila(pilaDeposito, cliente1.nome);
                        
                        //cliente1.saldo += pilaDeposito;
                        JOptionPane.showMessageDialog(null,"Seu Saldo é R$:"+cliente1.consultaPilas(cliente1.nome)+" Reais", cliente1.nome, JOptionPane.INFORMATION_MESSAGE, icon);
                    }
                    
                    catch (NumberFormatException e) {// imprime o erro na tela e informa o que foi digitado.
                        JOptionPane.showMessageDialog(null,"Entre com valor válido, do tipo númeral.\n Use (.) ponto em vez de (,) virgula\n ERRO: " + e.getMessage()  , "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    break;
                case 3:// realiza saque
                    JOptionPane.showMessageDialog(null,"Realiza um saque.", cliente1.nome+" "+cliente1.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);
                    try {// tratamento de exception
                        double pilaSaque = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a quantidade em Reais (R$) a ser sacada na conta do "+cliente1.nome+" "+cliente1.sobrenome));
                       
                       
                        //saquePila(pilaSaque, temp);
                        
                        if (cliente1.saldo >= pilaSaque){//verifica se tem saldo
                            cliente1.saldo -= pilaSaque; 
                                       
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"O valor informado para o saque é maior que seu saldo.\n seu saldo é de: R$ "+cliente1.saldo, "Saldo Insuficiente", JOptionPane.ERROR_MESSAGE, icon);
                        }
                        
                    }   
                    catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null,"Entre com valor válido, do tipo númeral.\n ERRO: " + e.getMessage()  , "ERRO", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida.", cliente1.nome+" "+cliente1.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);
                    
                    break;
            }
        }
               
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
