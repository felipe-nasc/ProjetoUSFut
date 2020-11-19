/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Agendamento;
import Model.DAO.Banco;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import connection.ConnectionFactory;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author FelipeCruz
 */
public class Main {
    
    
        
public class TestaConexao {
    
    public void main (String []args){
        
        try{
            new ConnectionFactory().getConexao();
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        }catch(HeadlessException erro){
            JOptionPane.showMessageDialog(null, "Erro" +erro);
        }
    }
        
        private void initComponents() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
    
    public static void main(String[] args){
       
        String nome = "Felipe";
        System.out.println(nome);
           
        Usuario felipe = new Usuario(1, "felipe", 'M',  "11988880000", "987654321", "felipe", "administrador");
        System.out.println(felipe.getNome());       
        
        //--------------------- Criando Um Agendamento -----------------------------------------------------
        Agendamento agendamento = new Agendamento(1, "16/11/2020 19:00");
        System.out.println(agendamento.getData());
        
        
        Banco.inicia();
        
        //Testando DAO
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        usuarioDAO.insert(felipe);
        ArrayList<Usuario> usuarios = usuarioDAO.selectAll();
        felipe.setNome("Felipe Cruz");
        usuarioDAO.update(felipe);
        usuarios = usuarioDAO.selectAll();
        usuarioDAO.delete(felipe);
        usuarios = usuarioDAO.selectAll();
         
   }
    
}
