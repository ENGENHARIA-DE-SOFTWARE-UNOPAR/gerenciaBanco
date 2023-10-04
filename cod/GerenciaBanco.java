
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
        * @param nome da conta a ser consultado
        *
        * @return O saldo da conta
        */
        public double consultaPilas(String nome){
            //double pilas = this.saldo;
            return this.saldo;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("C:\\Users\\AULA-1\\Documents\\(Engenharia de Software)\\Fase 3\\Linguagem Orientada a Objetos\\gerenciaBanco\\gerenciaBanco\\src\\gerenciabanco\\saracura.jpg");

        cliente cliente1 = new cliente();//instancia a cliente
      
}
