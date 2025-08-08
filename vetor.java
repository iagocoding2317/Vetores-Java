public class vetor{
    public static void main(String[] args){
        int vetor1[] = new int[5];
        vetor1[0] = 5;
        vetor1[1] = 8;
        vetor1[2] = 0;
        vetor1[3] = 7;
        vetor1[4] = 29992;

        int vetor2[] = new int[5];
        vetor2[0] = vetor1[0];
        vetor2[1] = vetor1[1];
        vetor2[2] = vetor1[2];
        vetor2[3] = vetor1[3];
        vetor2[4] = vetor1[4];

        for(int i = 0; i < 5; i++){
            System.out.println("Os valores do vetor 1: " + vetor1[i]);
            System.out.println("Os valores do vetor 2: " + vetor2[i]);
            System.out.println("--------------------------------------------------");
        }

    }
}