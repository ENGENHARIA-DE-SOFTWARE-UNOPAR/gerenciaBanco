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
 * @author Natan Ogliari
 * @version 0.1
 */
public class GerenciaBanco {
    
    public static class cliente{
        String nome;
        String sobrenome;
        String cpf;
        double saldo;
        
        private static final int STATUS_OK = 1;//!<define um retorno caso de sucesso> 
        private static final int STATUS_FAIL = 0;//!<define um retorno caso de falha>
        
        ImageIcon icon = new ImageIcon("C:\\Users\\AULA-1\\Documents\\(Engenharia de Software)\\Fase 3\\Linguagem Orientada a Objetos\\gerenciaBanco\\gerenciaBanco\\src\\gerenciabanco\\saracura.jpg");
          
        /**
        * Realiza um deposito em uma conta
        * @param nome Informa o nome da conta a ser depositado
        * @return retorna STATUS_OK se a operação ocorreu com sucesso e retorna STATUS_FAIL se ocorrer um erro
        */
        public int depositaPila(String nome){
             
            try {// verifica se a entrada e do tipo numeral
               double pilaDeposito = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a quantidade em Reais (R$) a ser depositado na conta do "+this.nome+" "+this.sobrenome));
                 this.saldo += pilaDeposito;                                     
                //JOptionPane.showMessageDialog(null,"Seu Saldo é R$:"+this.consultaPilas(this.nome)+" Reais", this.nome, JOptionPane.INFORMATION_MESSAGE, icon);
                return STATUS_OK;
            }
                    
            catch (NumberFormatException e) {// imprime o erro na tela e informa o que foi digitado.
                JOptionPane.showMessageDialog(null,"Entre com valor válido, do tipo númeral.\n Use (.) ponto em vez de (,) virgula\n ERRO: " + e.getMessage()  , "ERRO", JOptionPane.ERROR_MESSAGE);
                return STATUS_FAIL;
            }
        }
        
        /**
        * Realiza o saque de uma conta
        * @param nome Informa o nome da conta a ser realizado o saque 
        * @return retorna STATUS_OK se a operação ocorreu com sucesso e retorna STATUS_FAIL se ocorrer um erro
        */
        public int saquePila(String nome){
            
            try {// tratamento de exception
                    double pilaSaque = Double.parseDouble(JOptionPane.showInputDialog(null,"Informe a quantidade em Reais (R$) a ser sacada na conta do "+this.nome+" "+this.sobrenome));  
                    if (this.saldo >= pilaSaque){//verifica se tem saldo
                        this.saldo -= pilaSaque; 
                        return STATUS_OK;
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"O valor informado para o saque é maior que seu saldo.\nSeu saldo é de: R$ "+this.saldo, "Saldo Insuficiente", JOptionPane.ERROR_MESSAGE, icon);
                        return STATUS_FAIL;
                    }   
            }   
            catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null,"Entre com valor válido, do tipo númeral.\n ERRO: " + e.getMessage()  , "ERRO", JOptionPane.ERROR_MESSAGE);
            return STATUS_FAIL;
            }
        }
        
        /**
        * Realiza a consulta do saldo de uma conta
        * @param nome Passa o nome da conta a ser consultada e informa o saldo ao cliente.
        */
        public void consultaPilas(String nome){
            JOptionPane.showMessageDialog(null,"Seu saldo atual é de: R$" +this.saldo, this.nome+" "+this.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }

    public static void main(String[] args) {
       
        ImageIcon icon = new ImageIcon("C:\\Users\\AULA-1\\Documents\\(Engenharia de Software)\\Fase 3\\Linguagem Orientada a Objetos\\gerenciaBanco\\gerenciaBanco\\src\\gerenciabanco\\saracura.jpg");
        String opcao = null;
        cliente cliente1 = new cliente();//instância o cliente
        JOptionPane.showMessageDialog(null,"Bem vindo ao Banco Saracura do Banhado\n", "INÍCIO", JOptionPane.INFORMATION_MESSAGE, icon);//add custon icon
        try {
            cliente1.nome = JOptionPane.showInputDialog(null, "Informe seu Nome.", "Nome");
            if ("opcao"  == null){//caso o usuario cancele a opção
                JOptionPane.showMessageDialog(null, "Você cancelou a operação");
                            
            }
        }
        catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "Entre com um Nome válido.","Erro" , JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            cliente1.sobrenome = JOptionPane.showInputDialog(null, "Informe seu Sobrenome.","Sobrenome");
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Entre com um sobrenome válido.","Erro" , JOptionPane.ERROR_MESSAGE);
        }
        
        try{
            cliente1.cpf = JOptionPane.showInputDialog(null, "Informe o numéro do CPF.","000.000.000-00");
        }
        catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "Entre com um CPF válido.","Erro" , JOptionPane.ERROR_MESSAGE);
        }
        //cliente1.saldo = 445;//remover
        while(true){ //InterruptedIOException
            
            opcao = JOptionPane.showInputDialog(null,"Opção 1 - Consulta saldo\n Opção 2 - Realizar um deposito\n Opção 3 - Realizar um saque\n Opção 4 - Sair \n",4);//deixa a opçã4 4 como deful
            //conversão de String para int
            int control = 0;
            if ("opcao" == null){
                
                control = 0;
            }            
            else {
                 control = Integer.parseInt(opcao);
            }  
            
            //int control = Integer.parseInt(opcao);
            
            if ("opcao"  == null){//caso o usuario cancele a opção
                JOptionPane.showMessageDialog(null, "Você cancelou a operação");
                break;            
            }
            
            if (control == 0){
                JOptionPane.showMessageDialog(null, "Você cancelou a operação");
                break;  
            }
            
            if (control == 4){//para sair da operação
                JOptionPane.showMessageDialog(null,"Volte sempre "+cliente1.nome+" "+cliente1.sobrenome+"\nTenha um bom dia!", "LOGOUT", JOptionPane.INFORMATION_MESSAGE, icon);//add custon icon
                break;
            }
            
            switch (control){
                case 1://consulta de saldo   consultaPilas(nome) 
                    JOptionPane.showMessageDialog(null,"Consulta saldo.", cliente1.nome+" "+cliente1.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);//add custon icon
                    cliente1.consultaPilas(cliente1.nome);  
                    break;
                
                case 2://realiza deposito
                    JOptionPane.showMessageDialog(null,"Realizar um deposito.", cliente1.nome+" "+cliente1.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);                
                    int verifica = cliente1.depositaPila(cliente1.nome);
                    if (verifica == 1){
                        JOptionPane.showMessageDialog(null,"Depósito realizado com sucesso.", cliente1.nome+" "+cliente1.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);
                    }else{
                        JOptionPane.showMessageDialog(null,"Falha no deposito.\n Tente novamente.", cliente1.nome+" "+cliente1.sobrenome, JOptionPane.ERROR_MESSAGE, icon);
                    }
                    break;
                
                case 3:// realiza saque
                    JOptionPane.showMessageDialog(null,"Realiza um saque.", cliente1.nome+" "+cliente1.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);                   
                    verifica = cliente1.saquePila(cliente1.nome);
                    
                    if (verifica == 1){
                        JOptionPane.showMessageDialog(null,"Saque realizado com sucesso.", cliente1.nome+" "+cliente1.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);
                    }else{
                        JOptionPane.showMessageDialog(null,"Falha no saque.\n Tente novamente.", cliente1.nome+" "+cliente1.sobrenome, JOptionPane.ERROR_MESSAGE, icon);
                    }
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null,"Opção inválida.", cliente1.nome+" "+cliente1.sobrenome, JOptionPane.INFORMATION_MESSAGE, icon);  
                    break;
            }
        }
               
    }
       
}
