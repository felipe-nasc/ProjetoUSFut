/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.Login;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author FelipeCruz
 */

public class utilitario {
    
public void InserirIcone(JFrame frm) {

    frm.setIconImage(Toolkit.getDefaultToolkit().getImage("/View/imagens/icone.png"));

    try{
    
    }catch (Exception ex){
    System.out.println(ex.toString());
     }
    }

    public void inserirIcone(Login aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class frm {

        private static void setIconImage(Image image) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public frm() {
            
        }
    }
  }