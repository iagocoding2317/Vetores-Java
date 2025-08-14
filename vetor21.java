public class vetor21{
    public static void main(String[] args){
         int vetor21[]= new int[10];
            vetor21[0] = 7;
            vetor21[1] = 71;
            vetor21[2] = 24;
            vetor21[3] = 56;
            vetor21[4] = 32; 
            vetor21[5] = 12;
            vetor21[6] = 73;
            vetor21[7] = 79; 
            vetor21[8] = 5; 
            vetor21[9] = 2;  
         int vetor23[] = new int[10];    
            vetor23[0] = 7;
            vetor23[1] = 50;
            vetor23[2] = 29;
            vetor23[3] = 21;
            vetor23[4] = 3; 
            vetor23[5] = 1;
            vetor23[6] = 721;
            vetor23[7] = 7; 
            vetor23[8] = 52; 
            vetor23[9] = 21; 
         int vetor25[] = new int[10];
            for(int i = 0; i< vetor21.length; i++){
                vetor25[i] = vetor21[i] * vetor23[i];
            }

                 for(int i = 0; i < 10; i++){
            System.out.println("Os valores de vetor21 são: " + vetor21[i]);
            System.out.println("Os valores de vetor23 são: " + vetor23[i]);
            System.out.println("A multiplicação dos valores é: " + vetor25[i]);
            System.out.println("-------------------------------------------");
        }
            






            
    }
}
