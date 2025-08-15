public class vetor61 {

    public static void main(String[] args) {
        int vetor61[] = new int[10];
        vetor61[0] = 7;
        vetor61[1] = 71;
        vetor61[2] = 24;
        vetor61[3] = 56;
        vetor61[4] = 32; 
        vetor61[5] = 12;
        vetor61[6] = 73;
        vetor61[7] = 79; 
        vetor61[8] = 5; 
        vetor61[9] = 2;  
        int soma = 0;
        for (int i = 0; i < vetor61.length; i++) {
                soma = vetor61[i] + soma;
            
        }

        System.out.println("Soma = " + soma);
    }
}
