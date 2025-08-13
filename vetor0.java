import static java.lang.Math.sqrt;

public class vetor0{
    public static void main(String[] args){

        int vetor0[] = new int[15];
        vetor0[0] = 5;
        vetor0[1] = 8;
        vetor0[2] = 0;
        vetor0[3] = 7;
        vetor0[4] = 29992;
        vetor0[5] = 38383;
        vetor0[6] = 888;
        vetor0[7] = 123;
        vetor0[8] = 456;
        vetor0[9] = 789;
        vetor0[10] = 1011;
        vetor0[11] = 1213;
        vetor0[12] = 1415;
        vetor0[13] = 1617;
        vetor0[14] = 1819;
    
    

        double vetor9[] = new double[15];
        for(int i = 0; i < vetor0.length; i++){
        vetor9[i] = sqrt(vetor0[i]);
    }

    for(int i = 0; 1 < 15; i++){
    System.out.println("Os valores do vetor 0 são: " + vetor0[i]);
    System.out.println("Os valores do vetor 9 são: " + vetor9[i]);
    System.out.println("----------------------------------------------------------------------");
    }
    }
}





