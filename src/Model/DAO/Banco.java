/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Agendamento;
import Model.Usuario;
import java.util.ArrayList;
import java.sql.Connection;

/**
 *
 * @author FelipeCruz
 */
public class Banco {
    
    public static ArrayList<Usuario> usuario;
    public static ArrayList<Agendamento> agendamento;
    
    
    public static void inicia(){
    
        //Instancia os Objetos
        usuario = new ArrayList<Usuario>();
        agendamento = new ArrayList<Agendamento>();
        
        //criando elementos
        
        Usuario usuario1 = new Usuario(1, "adm", 'M', "11999998888", "123456789", "admin", "administrador");
        Usuario usuario2 = new Usuario(2, "felipe", 'M',  "11988880000", "987654321", "felipe", "administrador");
         
       
       
        //Agendamento agendamento = new Agendamento(0, "data hh:mm");
        Agendamento agendamento = new Agendamento (0,"Teste");
        
        //Adiciona Elementos na lista
        usuario.add(usuario1);
        usuario.add(usuario2);
        
        //Adiciona Elementos na lista
    
       // agendamento.add(agendamento1);
        
    }
    
    
}
