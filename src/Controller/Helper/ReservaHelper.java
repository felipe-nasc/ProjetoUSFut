/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Helper;

import Model.Agendamento;
import View.Reserva;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe Cruz
 */
public class ReservaHelper implements IHelper{

    private final Reserva view;

    public ReservaHelper(Reserva view) {
        this.view = view;
    }
    
    /*
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
        
    }*/
    
    @Override
    public Object obterModelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void limparTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
