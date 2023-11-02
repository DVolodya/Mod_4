package random;

import java.util.Random;

public class BoxAndMallerMethod {
    public static double[] BoxAndMallerMethod(int n){
        double[] randomArray = new double[1500];
        double[] randomArray1 = new double[1500];
        double matoz1 = 4.3 ;
        double disp1 = 0.5;
        double matoz2 = 2 ;
        double disp2 = 0.4;
        Random random = new Random();
        double r1, r2, x, y;
        for (int i = 0; i < n; i++) {
            r1 = random.nextDouble();
            r2 = random.nextDouble();
            x = Math.sqrt(-2 * Math.log(r1)) * Math.cos(2 * Math.PI * r2);
            x = matoz1+x*Math.log(r1);
            randomArray[i]=x;
            y = Math.sqrt(-2 * Math.log(r1)) * Math.sin(2 * Math.PI * r2);
            y = matoz2+y*Math.log(r2);
            randomArray1[i]=y;
            System.out.println("x="+x+"\ny="+y);
        }
        return randomArray;
    }
}
