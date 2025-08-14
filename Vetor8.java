public class Vetor8 {
    public static void main(String args[]) {
        int[] Vetor8 = new int[10];

        Vetor8[0] = 72;
        Vetor8[1] = 51;
        Vetor8[2] = 42;
        Vetor8[3] = -56;
        Vetor8[4] = 3;
        Vetor8[5] = 91;
        Vetor8[6] = 33;
        Vetor8[7] = 13;
        Vetor8[8] = 29;
        Vetor8[9] = 2;

        int[] Vetor00 = new int[10];

        Vetor00[0] = 7;
        Vetor00[1] = 62;
        Vetor00[2] = -5;
        Vetor00[3] = 9;
        Vetor00[4] = 62;
        Vetor00[5] = 23;
        Vetor00[6] = 11;
        Vetor00[7] = 1;
        Vetor00[8] = 42;
        Vetor00[9] = 92;

        int[] VetorC = new int[10];

        {
            for (int i = 0; i < 10; i++) {
                VetorC[i] = Vetor8[i] + Vetor00[i];
            }

            for (int i = 0; i < 10; i++) {
                System.out.println("Os valores de Vetor8 são: " + Vetor8[i]);
                System.out.println("Os valores de Vetor00 são: " + Vetor00[i]);
                System.out.println("Os valores de VetorC são: " + VetorC[i]);
                System.out.println("----------------------------------------");
            }
        }
    }
}