//EXE3 LUCAS SCHISSEL POO2 - 2021
package exe3;

//CLASSE CARTA, SUBCLASSE DE BARALHO QUE INDICA O TIPO DE CARTA
public class carta extends baralho{
    private naipe naipe;
    
     //CONSTRUTOR VERIFICA SE CARTA RECEBE UMA NAIPE NAO NULA
    public carta(String nome, naipe npe) throws Exception{
      super(nome);
        if(npe != null){ 
            this.naipe = npe;
        }else{
           throw new Exception("Naipe Invalida");
        }        
    }
    
    @Override
    //METODO TIPO,SOBRESCREVE E APRESENTA TODOS AS INFORMAÇÕES DA CARTA E NAIPE
    void tipo(){
        System.out.println("Carta: "+getNome()+
                         " Naipe: "+naipe.getNome()+
                         " Cor: " + naipe.getCor() +
                         " Simbolo: "+naipe.getSimbolo()
                          );
    }
    
     //GETTERS E SETTERS CLASS CARTA
    public naipe getNaipe() {
        return naipe;
    }
    public void setNaipe(naipe naipe) {
        this.naipe = naipe;
    }
    
    
   
    
    
}
