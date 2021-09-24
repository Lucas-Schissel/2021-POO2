//EXE3 LUCAS SCHISSEL POO2 - 2021
package exe3;

//CLASSE naipe, SUBCLASSE DE BARALHO QUE INDICA O TIPO DE NAIPE
public class naipe extends baralho {
    private String cor;
    private String simbolo;
    
    //CONSTRUTOR VERIFICA SE NAIPE RECEBE COR E SIMBOLO VALIDOS
    public naipe(String nome,String c, String s) throws Exception {
        super(nome);
        if((c == null)||(c == "")){ 
            throw new Exception("Cor Invalida");
        }else{
           this.cor = c;
        }
        if((s == null)||(s == "")){ 
            throw new Exception("Simbolo Invalido");
        }else{
           this.simbolo = s;
        }
    }
    
    @Override
    //METODO TIPO TIPO, SOBRESCREVE, E APRESENTA APENAS AS INFORMAÇÕES DA NAIPE CADASTRADA
    public void tipo(){
        System.out.println("Naipe: "+getNome()+
                           " Cor: "+getCor()+
                           " Simbolo: "+getSimbolo()
                            );
   
    }
    
    //GETTERS E SETTERS CLASS NAIPE
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getSimbolo() {
        return simbolo;
    }
    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }   
    
    
}
