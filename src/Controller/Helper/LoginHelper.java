/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import View.Login;

/**
 *
 * @author Felipecruz
 */
public class LoginHelper implements IHelper{

    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    public void limparTela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }

    
}
