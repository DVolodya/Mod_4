package random;

import java.util.Random;

public class CentralLimitTheory {
    public static double[] CentralLimitTheory(int n){
       double[] randomArray = new double[1500];
        double matoz1 = 4.3 ;
        double disp1 = 0.5;
        Random random = new Random();
        double s, r;
        for (int i = 0; i<n; i++){
            s = 0;
        for (int j = 0; j < 12; j++) {
            r = random.nextDouble();
            s+=r;
        }
        double x = s-6;
        x = matoz1+x*Math.sqrt(disp1);
        randomArray[i] = x;
        System.out.println("Itog = "+randomArray[i]);
    }
    return randomArray;
    }
}
