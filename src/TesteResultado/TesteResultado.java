package TesteResultado;

import Resultado.Resultado;

public class TesteResultado{
    public void testeResultado(int[][] tabelaJogo){
        Resultado resultadoJogo = new Resultado();
        int[][] result = new int[3][3];
        int cont=-1;
        for(int[] arr : tabelaJogo){
            cont++;
            for(int aux : arr){
                result[1][cont] += aux;
            }
        }
        for(int[] arr : tabelaJogo){
            cont=-1;
            for(int aux : arr){
                cont++;
                result[1][cont] += aux;
            }
        }
        result[2][0] = tabelaJogo[0][0]+tabelaJogo[1][1]+tabelaJogo[2][2];
        result[2][1] = tabelaJogo[2][0]+tabelaJogo[1][1]+tabelaJogo[0][2];
        resultadoJogo.resultado(result);
    }
    
}