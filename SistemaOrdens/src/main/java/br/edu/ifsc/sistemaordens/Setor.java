/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsc.sistemaordens;

import Conexao.DBController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Cliente
 */
public class Setor {
    private Integer id;
    private String nome2;
    
    public Setor() {
    }
    
    public String toString() {
        String nome2 = this.nome2;
        return nome2;
    }
    
    public void adicionar() throws Exception {
        DBController db = new DBController();
        Map<String,String> dados = new HashMap<>();
        
        dados.put("nome2", nome2);
        
        db.conectar();
        db.insert("Setor", dados);
        db.desconectar();
    }
    
     public static List<Setor> buscaSetores() throws Exception {
        DBController db = new DBController();
        ResultSet rset;
        List<Setor> sto = new ArrayList<>();
                
        db.conectar();
        rset = db.executeQuery("SELECT * FROM Setor");
            
        try {
            while (rset.next()) {
                Setor s = new Setor();
   
                s.id = rset.getInt("id");
                s.nome2 = rset.getString("nome2");           
                
                sto.add(s);
            }
        } catch (SQLException ex) {
            throw new Exception("Erro ao percorrer resultados!");
        }
            
        db.desconectar();
        return sto;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome2;
    }
    public void setNome(String nome2) {
        this.nome2 = nome2;
    }
}
