/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FelipeCruz
 */
public class Agendamento {
    
    private int id;
    Date data;
    String observacao;

    public Agendamento(int id, String data) {
        this.id = id;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Agendamento(int id, String data, String observacao)
    {
        this(id, data);
        this.observacao = observacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Date getData() {
        return data;
    }
    
    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }
    
    public String getHoraFormatada(){
        return new SimpleDateFormat("HH:mm").format(data);
    }
    

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    
    
    
}
