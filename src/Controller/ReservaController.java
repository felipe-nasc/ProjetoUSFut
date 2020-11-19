/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.ReservaHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import View.MenuPrincipal;
import View.Reserva;
import java.util.ArrayList;

/**
 *
 * @author Felipe Cruz
 */
public class ReservaController {

    private final Reserva view;
    private final ReservaHelper helper;

    public ReservaController(Reserva view) {
        this.view = view;
        this.helper = new ReservaHelper(view);
    }
    /*
    public void atualizaTabela(){
    
        //Buscar Lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();//depurar aqui
        
        //Exibir essa lista na view
        helper.preencherTabela(agendamentos);
    }
    */
   public void navegarParaMenuPrincipal(){
        
        MenuPrincipal menuprincipal = new MenuPrincipal();
        menuprincipal.setVisible(true);       
    }

}
