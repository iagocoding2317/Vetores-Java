public class vetor7 {
    public static void main(String[] args){

        int vetor7[] = new int[15];
        vetor7[0] = 5;
        vetor7[1] = 8;
        vetor7[2] = 0;
        vetor7[3] = 7;
        vetor7[4] = 29992;
        vetor7[5] = 1945;
        vetor7[6] = -28;
        vetor7[7] = 91;
        vetor7[8] = 12;
        vetor7[9] = 34;
        vetor7[10] = 56;
        vetor7[11] = 78;
        vetor7[12] = 90;
        vetor7[13] = 123;
        vetor7[14] = 456;

        int vetor8[] = new int[15];
        for(int i = 0; i < vetor7.length; i++){
            vetor8[i] = vetor7[i] * vetor7[i];
        }
        for(int i = 0; i < 15; i++){
            System.out.println("Os valores do vetor 7: " + vetor7[i]);
            System.out.println("Os valores do vetor 8: " + vetor8[i]);
            System.out.println("--------------------------------------------------");
        }
    }
}
