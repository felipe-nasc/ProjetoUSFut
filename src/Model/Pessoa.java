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
abstract public class Pessoa {
    
    
    protected int id;
    protected String nome;
    protected char sexo;
    protected String telefone;
    protected String rg;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    

    public Pessoa(int id, String nome, char sexo, String telefone, String rg) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.telefone = telefone;
        this.rg = rg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }  
    
}
