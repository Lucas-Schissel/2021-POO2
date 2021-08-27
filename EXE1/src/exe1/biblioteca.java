//Classe biblioteca, recebe um nome e livros

package exe1;

public class biblioteca {
    private String nome;
    private livro livros[];
    private int total_cadastrados;
    
    public biblioteca(String nome){
        setNome(nome);
        setLivros(new livro[100]);
        setTotal_cadastrados(0);
    }
    
    public void adicionarLivro(livro book){
        this.livros[total_cadastrados] = book;
        this.total_cadastrados++;
    }    
    
    public void mostraLivros(){
        System.out.println("Biblioteca:" + getNome());
        System.out.println("Livros Disponiveis:" + getTotal_cadastrados());
        System.out.println("--------------------------------------------------------");
            for(int i=0; i < getTotal_cadastrados(); i++){  
                this.livros[i].imprimeSumario();
            }
            
        System.out.println("\n");
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
     public livro[] getLivros() {
        return livros;
    }
    public void setLivros(livro[] livros) {
        this.livros = livros;
    }
//---------------------------------------------------------------
    public int getTotal_cadastrados() {
        return total_cadastrados;
    }
    public void setTotal_cadastrados(int total_cadastrados) {
        this.total_cadastrados = total_cadastrados;
    }
//---------------------------------------------------------------   
}
