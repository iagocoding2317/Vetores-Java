public class vetor41{
    public static void main(String[] args){
         int vetor41[]= new int[10];
            vetor41[0] = 7;
            vetor41[1] = 71;
            vetor41[2] = 24;
            vetor41[3] = 56;
            vetor41[4] = 32; 
            vetor41[5] = 12;
            vetor41[6] = 73;
            vetor41[7] = 79; 
            vetor41[8] = 5; 
            vetor41[9] = 2;  
         int vetor45[] = new int[10];
            for(int i = 0; i< vetor41.length; i++){
                vetor45[i] = vetor41[i] % 2;
            }

                 for(int i = 0; i < 10; i++){
            System.out.println("Os valor do vetor41 é: " + vetor41[i]);
            System.out.println("O resto da divisão do vetor por 2 é:" + vetor45[i]);
            System.out.println("-------------------------------------------");
        }
            






            
    }
}
