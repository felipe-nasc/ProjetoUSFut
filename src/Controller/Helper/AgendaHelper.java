/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Agendamento;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FelipeCruz
 */
public class AgendaHelper implements IHelper{

    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }
    
    
    public void preencherTabela(ArrayList<Agendamento> agendamentos){
        
        //Tabela tambem funciona com MVC precisamos pegar o mode da tabela
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        
        //Percorrer a lista preenchendo o tableModel
        
        for (Agendamento agendamento : agendamentos) {
            
            tableModel.addRow(new Object[]{
                agendamento.getId(),
                agendamento.getDataFormatada(),
                agendamento.getHoraFormatada(),
                agendamento.getObservacao()
            });
            
        }        
        
    }
    
    /**
     *
     * @return 
     */
    
    @Override
    public Agendamento obterModelo() {
        
        String idString = view.getTextId().getText();
        int id = Integer.parseInt(idString);
        String data = view.getTextFormatedData().getText();
        String hora = view.getTextFormatedHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getTextObservacao().getText();
        
        Agendamento agendamento = new Agendamento(id, dataHora, observacao);
        return agendamento;
        
    }

    /**
     *
     */
    @Override
    public void limparTela() {
        view.getTextId().setText("");
        view.getTextFormatedData().setText("");
        view.getTextFormatedHora().setText("");
        view.getTextObservacao().setText("");
    }
    
}
