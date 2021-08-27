//Classe capitulo, recebe apenas o indice e o livro

package exe1;

public class capitulo {
    private int numero;
    private livro book;
    
   
   public capitulo(livro book,int num){
       setBook(book);
       setNumero(num);      
   }
   
//Getters e Setters
//---------------------------------------------------------------
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
//---------------------------------------------------------------
    public livro getBook() {
        return book;
    }
    public void setBook(livro book) {
        this.book = book;
    }
//---------------------------------------------------------------    
    
}
