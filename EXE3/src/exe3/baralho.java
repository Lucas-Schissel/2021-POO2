//EXE3 LUCAS SCHISSEL POO2 - 2021
package exe3;

//CLASSE BARALHO, SUPERCLASSE QUE INDICA O TIPO DE JOGO
public class baralho {
    String nome;    
    
    //CONSTRUTOR VERIFICA SE O JOGO RECEBE UM NOME NAO NULLO ACEITAVEL
    public baralho(String nome) throws Exception{
       if((nome != null) && (nome !="")){ 
            this.nome = nome;
       }else{
           throw new Exception("Nome Invalido");
       } 
    }
    
    //METODO TIPO, RETORNA O TIPO DE JOGO CADASTRADO
    void tipo(){
        System.out.println("Tipo baralho: "+getNome());
   
    }
    
    //GETTERS E SETTERS CLASS NAIPE
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
