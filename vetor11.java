// Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a subtração dos respectivos elementos em A e B, ou seja: C[i] = A[i] – B[i]. 

public class vetor11{
    public static void main(String[] args){
         int vetor11[]= new int[10];
            vetor11[0] = 7;
            vetor11[1] = 71;
            vetor11[2] = 24;
            vetor11[3] = 56;
            vetor11[4] = 32; 
            vetor11[5] = 12;
            vetor11[6] = 73;
            vetor11[7] = 79; 
            vetor11[8] = 5; 
            vetor11[9] = 2;  
         int vetor13[] = new int[10];    
            vetor13[0] = 7;
            vetor13[1] = 50;
            vetor13[2] = 29;
            vetor13[3] = 21;
            vetor13[4] = 3; 
            vetor13[5] = 1;
            vetor13[6] = 721;
            vetor13[7] = 7; 
            vetor13[8] = 52; 
            vetor13[9] = 21; 
         int vetor15[] = new int[10];
            for(int i = 0; i< vetor11.length; i++){
                vetor15[i] = vetor11[i] - vetor13[i];
            }

                 for(int i = 0; i < 10; i++){
            System.out.println("Os valores de vetor11 são: " + vetor11[i]);
            System.out.println("Os valores de vetor13 são: " + vetor13[i]);
             System.out.println("A subtração dos valores são: " + vetor15[i]);
            System.out.println("-------------------------------------------");
        }
            






            
    }
}