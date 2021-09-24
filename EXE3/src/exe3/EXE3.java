//EXE3 LUCAS SCHISSEL POO2 - 2021
package exe3;

//CLASSE PRINCIPAL DECLARA VARIAVEIS E TESTAR OS METODOS DO BARALHO
public class EXE3 {

    public static void main(String[] args) throws Exception {
       final int tam = 4;
       final int qtd = 52;
       
       //VETOR DE BARALHOS
       baralho b[] = new baralho[tam];
       b[0] = new baralho("Truco");
       b[1] = new baralho("Cacheta");
       b[2] = new baralho("Poker");
       b[3] = new baralho("Cacheta");
       //TENTAR EXECUTAR A LINHA ABAIXO GERA EXCEPTION, NOME INVALIDO PARA JOGO!
       //b[3] =  new baralho("");
       
       //ESTRUTURA DE REPETIÇÃO MOSTRA OS JOGOS CRIADOS------------------------
       for(int i=0;i<tam;i++){
        b[i].tipo();
       }
       //----------------------------------------------------------------------
       System.out.println("\n");
       
       //VETOR DE NAIPES
       naipe n[] = new naipe[tam];
       n[0] = new naipe("Paus","Preta","Flor");
       n[1] = new naipe("Copas","Vermelha","Taça");
       n[2] = new naipe("Spada","Preta","Espada");
       n[3] = new naipe("Ouro","Vermelha","Lozango");
       //TENTAR EXECUTAR AlGUMA DAS LINHAS ABAIXO GERA EXCEPTION, NOME,COR,SIMBOLO INVALIDO PARA NIPE!
       //n[0] =  new naipe("","Pretas","Flor");
       //n[1] =  new naipe("Copas","","Flor");
       //n[2] =  new naipe("Ouro","Vermelha","");
       
       //ESTRUTURA DE REPETIÇÃO MOSTRA OS NIPES CRIADOS------------------------
       for(int i=0;i<tam;i++){
        n[i].tipo();
       }
       //----------------------------------------------------------------------
       System.out.println("\n");
       
       
       //VETOR DE CARTAS
       carta c[] = new carta[qtd];
       
       //ESTRUTURA DE REPETIÇÃO PREENCHE O BARALHO-----------------------------
        int linha=0;
           for(int coluna=0;coluna<4;coluna++){
            c[linha] = new carta("As",n[coluna]);
            c[linha+1] = new carta("Dois",n[coluna]);
            c[linha+2] = new carta("Tres",n[coluna]);
            c[linha+3] = new carta("Quatro",n[coluna]);
            c[linha+4] = new carta("Cinco",n[coluna]);
            c[linha+5] = new carta("Seis",n[coluna]);
            c[linha+6] = new carta("Sete",n[coluna]);
            c[linha+7] = new carta("Oito",n[coluna]);
            c[linha+8] = new carta("Nove",n[coluna]);
            c[linha+9] = new carta("Dez",n[coluna]);
            c[linha+10] = new carta("Dama",n[coluna]);
            c[linha+11] = new carta("Valete",n[coluna]);
            c[linha+12] = new carta("Rei",n[coluna]);
          //TENTAR EXECUTAR AlGUMA DAS LINHAS ABAIXO GERA EXCEPTION, NOME,NIPE INVALIDO PARA CARTA!  
          //c[linha+12] = new carta("",n[coluna]);
          //c[linha+12] = new carta("Rei",null);
            linha = linha+13;
         }
       //----------------------------------------------------------------------
       
       //ESTRUTURA DE REPETIÇÃO MOSTRA AS CARTAS GERADAS-----------------------
       for(int i=0;i<qtd;i++){
        c[i].tipo();
       }
       //----------------------------------------------------------------------
       System.out.println("\n");
      
    }
    
}
