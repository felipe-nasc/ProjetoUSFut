/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.DAO.AgendamentoDAO;
import View.Agenda;
import View.MenuPrincipal;
import java.util.ArrayList;

/**
 *
 * @author FelipeCruz
 */
public class AgendaController {

    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void atualizaTabela(){
    
        //Buscar Lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamento = agendamentoDAO.selectAll();//depurar aqui
        
        //Exibir essa lista na view
        helper.preencherTabela(agendamento);
    }

    public void agendar() {
        
        //Buscar Objeto Agendamento da Tela
        Agendamento agendamento = helper.obterModelo();
        
        //Salvar no banco de dados
       // AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        new AgendamentoDAO().insert(agendamento);
        
        //atualizar Tabela
        atualizaTabela();
        helper.limparTela();
  
    }
      public void navegarParaMenuPrincipal(){
        
        MenuPrincipal menuprincipal = new MenuPrincipal();
        menuprincipal.setVisible(true);       
    }
    
}
