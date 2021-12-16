/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsc.sistemaordens;

import Conexao.DBController;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Cliente
 */
public class Usuarios {
    private Integer id;
    private String codigo;
    private String senha;
    private String nome;
    private String telefone;
    private Integer setor;
    private String statos;
    
    public Usuarios() {
    }
    
    public Usuarios(Setor setor) {
       // this.setor = setor;
    }
    
    public void adicionar() throws Exception {
        DBController db = new DBController();
        Map<String,String> dados = new HashMap<>();
        
        dados.put("codigo", codigo);
        dados.put("senha", senha);
        dados.put("nome", nome);
        dados.put("telefone", telefone);
        dados.put("setor_id", String.valueOf(setor));
        dados.put("statos", statos);
        
        db.conectar();
        db.insert("Usuario", dados);
        db.desconectar();
    }
    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
     public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Integer getSetor() {
        return setor;
    }
    public void setSetor(Integer setor) {
        this.setor = setor;
    }   
    
    public String getStatos() {
        return statos;
    }
    public void setStatos(String statos) {
        this.statos = statos;
    }
    
    
    
}
