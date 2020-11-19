/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.Agenda;
import View.Reserva;
import View.MenuPrincipal;

/**
 *
 * @author FelipeCruz
 */
public class MenuPrincipalController {

    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
    }
    
    public void navegarParaAgenda(){
        
        Agenda agenda = new Agenda();
        agenda.setVisible(true);      
        
    }

    public void navegarParaReserva(){
        
        Reserva reserva = new Reserva();
        reserva.setVisible(true);       
    }
    
      public void navegarParaMenuPrincipal(){
        
        MenuPrincipal menuprincipal = new MenuPrincipal();
        menuprincipal.setVisible(true);       
    }

    
}
