package Resultado;

public class Resultado {
    public void resultado(int[][] result){
        int inpate = 0;
        for (int[] ref : result){
            for(int arr : ref){
                if(arr/3==1){
                    System.out.print("Jogador X Vençeu");
                    inpate++;
                    break;
                    
                }
                else if(arr/3==-1){
                    System.out.print("Jogador O vençeu");
                    inpate++;
                    break;
                }
            } 
        }
        if(inpate==0){
            System.out.print("Nenhum Jogador Vençeu");
        }
    }
}
