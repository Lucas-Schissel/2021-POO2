//Classe livro, recebe titulo,autor, capitulos

package exe1;

public class livro {
    private String isbn;
    private autor nome;
    private capitulo numero[];
    private int qtdCapitulos;
    
    public livro(String isbn,autor criador,int qtd){
        setISBN(isbn);
        setNome(criador);
        setQtdCapitulos(qtd);
        setNumero(new capitulo[qtd]);
    }
     
    public void setDadosCapitulo(int n){
        this.numero[n] = new capitulo(this, n);
    }     
    
    public void imprimeSumario(){
        System.out.println("Titulo: "+getIsbn());
        System.out.println("Autor:" + nome.getNome());
        System.out.println("Capitulos: "+getQtdCapitulos());
       
    }
    
   //Getters e Setters
   //--------------------------------------------------------------- 
    public String getIsbn() {
        return isbn;
    }
    public void setISBN(String ISBN) {
        this.isbn = ISBN;
    }
  //---------------------------------------------------------------  
    public autor getNome() {
        return nome;
    }
    public void setNome(autor nome) {
        this.nome = nome;
    }
//-----------------------------------------------------------------
    public int getQtdCapitulos() {
        return qtdCapitulos;
    }
    public void setQtdCapitulos(int qtdCapitulos) {
        this.qtdCapitulos = qtdCapitulos;
    }
 //----------------------------------------------------------------
    public capitulo[] getNumero() {
        return numero;
    }
    public void setNumero(capitulo[] numero) {
        this.numero = numero;
    }
 //----------------------------------------------------------------  
}
