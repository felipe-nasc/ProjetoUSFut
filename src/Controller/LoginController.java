/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.Banco;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;
import java.sql.Connection;

/**
 *
 * @author FelipeCruz
 */
public class LoginController {
    
    private Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
        Banco.inicia(); //comando para iniciar o banco de dados
    }
    
    public void entrarNoSistema(){
    
        //Pegar Usuario da View        
        Usuario usuarioNaoAutenticado = helper.obterModelo(); //depurar aqui
        
        //Pesquisa Usuario no Banco
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuarioNaoAutenticado);
        
        //Se o usuario da view tiver mesmo usuario e senha que o usuario vindo do banco direcionar para menu principal
        if(usuarioAutenticado != null){
            
            MenuPrincipal menuPrincipal = new MenuPrincipal();
            menuPrincipal.setVisible(true);
            this.view.dispose(); //fecha a view atual
        }else{
            this.view.exibeMensagem("Usuario ou senha incorretos");
        }
        
    }
    
    /* public void cadastrar(){
        
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);      
        
    }*/
    
    
}
