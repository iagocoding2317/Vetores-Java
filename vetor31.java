public class vetor31{
    public static void main(String[] args){
         int vetor31[]= new int[10];
            vetor31[0] = 7;
            vetor31[1] = 71;
            vetor31[2] = 24;
            vetor31[3] = 56;
            vetor31[4] = 32; 
            vetor31[5] = 12;
            vetor31[6] = 73;
            vetor31[7] = 79; 
            vetor31[8] = 5; 
            vetor31[9] = 2;  
         int vetor33[] = new int[10];    
            vetor33[0] = 7;
            vetor33[1] = 50;
            vetor33[2] = 29;
            vetor33[3] = 21;
            vetor33[4] = 3; 
            vetor33[5] = 1;
            vetor33[6] = 721;
            vetor33[7] = 7; 
            vetor33[8] = 52; 
            vetor33[9] = 21; 
         int vetor35[] = new int[10];
            for(int i = 0; i< vetor31.length; i++){
                vetor35[i] = vetor31[i] / vetor33[i];
            }

                 for(int i = 0; i < 10; i++){
            System.out.println("Os valores de vetor31 são: " + vetor31[i]);
            System.out.println("Os valores de vetor33 são: " + vetor33[i]);
             System.out.println("A divisão dos valores é: " + vetor35[i]);
            System.out.println("-------------------------------------------");
        }
            






            
    }
}
