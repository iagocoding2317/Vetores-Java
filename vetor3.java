public class vetor3 {
    public static void main(String[] args){
        int vetor5[] = new int[8];
        vetor5[0] = 5;
        vetor5[1] = 8;
        vetor5[2] = 0;
        vetor5[3] = 7;
        vetor5[4] = 29992;
        vetor5[5] = 1945;
        vetor5[6] = -28;
        vetor5[7] = 91;

        int vetor6[] = new int[8];
        for(int i = 0; i < vetor5.length; i++){
            vetor6[i] = 2*vetor5[i];
        }

        for(int i = 0; i < 8; i++){
            System.out.println("Os valores do vetor 5: " + vetor5[i]);
            System.out.println("Os valores do vetor 6: " + vetor6[i]);  
            System.out.println("--------------------------------------------------");
        }

    }
}
