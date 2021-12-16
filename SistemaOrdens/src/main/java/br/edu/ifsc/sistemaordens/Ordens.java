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
public class Ordens {
    private Integer id;
    private Integer maquina_id;
    private String problema;
    private String causa;
    private String solucao;
    private String comentario;
    private Double tempo;
    private Integer usuario;
    
    public Ordens() {
    }
    
    public void adicionar() throws Exception {
        DBController db = new DBController();
        Map<String,String> dados = new HashMap<>();
        
        dados.put("maquina_id", String.valueOf(maquina_id));
        dados.put("problema", problema);
        dados.put("causa", causa);
        dados.put("solucao", solucao);
        dados.put("comentario", comentario);
        dados.put("tempo",String.valueOf(tempo));
        dados.put("usuario",String.valueOf(usuario));
        
        db.conectar();
        db.insert("Ordem", dados);
        db.desconectar();
    }
    
    public static List<Ordens> buscaOrdens() throws Exception {
        DBController db = new DBController();
        ResultSet rset;
        List<Ordens> odms = new ArrayList<>();
                
        db.conectar();
        rset = db.executeQuery("SELECT * FROM Ordem");
            
        try {
            while (rset.next()) {
                Ordens o = new Ordens();
                o.id = rset.getInt("id");
                o.maquina_id = rset.getInt("maquina_id");
                o.problema = rset.getString("problema");
                o.causa = rset.getString("causa");
                o.solucao = rset.getString("solucao");
                o.comentario = rset.getString("comentario");
                o.tempo = rset.getDouble("tempo");
                o.usuario = rset.getInt("usuario");
                
                odms.add(o);
            }
        } catch (SQLException ex) {
            throw new Exception("Erro ao percorrer resultados!");
        }
            
        db.desconectar();
                
        return odms;
    }
    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getMaquina_id() {
        return maquina_id;
    }
    public void setMaquina_id(Integer maquina_id) {
        this.maquina_id = maquina_id;
    }
    public String getProblema() {
        return problema;
    }
    public void setProblema(String problema) {
        this.problema = problema;
    }
    public String getCausa() {
        return causa;
    }
    public void setCausa(String causa) {
        this.causa = causa;
    }
    public String getSolucao() {
        return solucao;
    }
    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public Double gettempo(){
        return tempo;
    }
    public void setTempo(Double tempo) {
        this.tempo = tempo;
    }
    public Integer getUsuario() {
        return usuario;
    }
    public void setUsuario_id(Integer usuario) {
        this.usuario = usuario;
    }

    void getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
