public class vetor51{

    public static void main(String[] args) {
        int vetor51[] = new int[10];
        vetor51[0] = 7;
        vetor51[1] = 71;
        vetor51[2] = 24;
        vetor51[3] = 56;
        vetor51[4] = 32; 
        vetor51[5] = 12;
        vetor51[6] = 73;
        vetor51[7] = 79; 
        vetor51[8] = 5; 
        vetor51[9] = 2;  

        int vetor55 = 0;
        for (int i = 0; i < vetor51.length; i++) {
            if (vetor51[i] % 2 == 0) {
                vetor55++;
            }
        }

        System.out.println("A quantidade de pares é: " + vetor55);
    }
}
