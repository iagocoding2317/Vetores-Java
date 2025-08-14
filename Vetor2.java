public class Vetor2{
    public static void main(String args[]){
        int[] Vetor2 = new int[10];
        Vetor2[0] = 18;
        Vetor2[1] = 43;
        Vetor2[3] = 89;
        Vetor2[4] = 1;
        Vetor2[5] = 77;
        Vetor2[6] = 33;
        Vetor2[7] = 12;
        Vetor2[8] = 0;
        Vetor2[9] = -2;
        
        int Vetor6[] = new int[10];
        for(int i = 0; i < Vetor2.length; i++){
            Vetor6[i] = Vetor2[i] * i;
        }
        
        for(int i = 0; i < 10; i++){
            System.out.println("Os valores de Vetor2 são: " + Vetor2[i]);
            System.out.println("Os valores de Vetor6 são: " + Vetor6[i]);
            System.out.println("-------------------------------------------");
        }
    }
}