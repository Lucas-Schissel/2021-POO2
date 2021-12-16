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
public class Maquinas {
    private Integer id;
    private String nome3;
    
    public Maquinas() {
    }
    public String toString() {
        String nome3 = this.nome3;
        return nome3;
    }
    
    public void adicionar() throws Exception {
        DBController db = new DBController();
        Map<String,String> dados = new HashMap<>();
        
        dados.put("nome3", nome3);
        
        db.conectar();
        db.insert("Maquina", dados);
        db.desconectar();
    }
    
     public static List<Maquinas> buscaMaquinas() throws Exception {
        DBController db = new DBController();
        ResultSet rset;
        List<Maquinas> mqns = new ArrayList<>();
                
        db.conectar();
        rset = db.executeQuery("SELECT * FROM Maquina");
            
        try {
            while (rset.next()) {
                Maquinas m = new Maquinas();
   
                m.id = rset.getInt("id");
                m.nome3 = rset.getString("nome3");
            
                
                mqns.add(m);
            }
        } catch (SQLException ex) {
            throw new Exception("Erro ao percorrer resultados!");
        }
            
        db.desconectar();                
        return mqns;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome3;
    }
    public void setNome(String nome3) {
        this.nome3 = nome3;
    }
     
     
    
}
