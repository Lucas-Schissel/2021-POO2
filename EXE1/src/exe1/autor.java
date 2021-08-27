//Classe autor, recebe apenas o nome do mesmo

package exe1;

public class autor {
    private String nome;
    
    public autor(String nome){
        setNome(nome);
    }
    
 //Getters e Setters
 //---------------------------------------------------------------     
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
 //--------------------------------------------------------------- 
}
