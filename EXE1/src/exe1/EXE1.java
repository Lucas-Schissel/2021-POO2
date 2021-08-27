//Classe principal, adiciona e testa livros

package exe1;


public class EXE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         biblioteca library1 = new biblioteca("IFSC");
         biblioteca library2 = new biblioteca("UFRJ");
         autor schissel = new autor("schissel");
         autor genesis = new autor("genesis");
         autor cortela = new autor("cortela");
         livro book1 = new livro("Programacao",schissel,3);
         livro book2 = new livro("Eletricidade",schissel,10);
         livro book3 = new livro("Automaçao",schissel,25);
         livro book4 = new livro("Planeta",genesis,47);
         livro book5 = new livro("Realidade",genesis,33);
         livro book6 = new livro("Sociedade",cortela,14);
         library1.adicionarLivro(book1);
         library1.adicionarLivro(book2);
         library2.adicionarLivro(book3);
         library1.adicionarLivro(book4);
         library1.adicionarLivro(book5);
         library2.adicionarLivro(book6);
         library1.mostraLivros();
         library2.mostraLivros();
         
        
    }
    
}
