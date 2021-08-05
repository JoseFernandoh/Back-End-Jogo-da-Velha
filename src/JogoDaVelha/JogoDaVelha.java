package JogoDaVelha;

import TesteResultado.TesteResultado;

public class JogoDaVelha {
    public static void main(String[] args) throws Exception {
        int[][] tabelaJogo = new int[3][3];
        TesteResultado resultado = new TesteResultado();
        // Troque Os Zero para X=1 O=-1 Para Ver Quem Foi O Ganhador
        tabelaJogo[0] = new int[]{0,0,1};
        tabelaJogo[1] = new int[]{0,1,0};
        tabelaJogo[2] = new int[]{1,0,0};
        resultado.testeResultado(tabelaJogo);
        
    }
}
