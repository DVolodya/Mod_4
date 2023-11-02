//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import random.BoxAndMallerMethod;
import random.CentralLimitTheory;
import java.io.*;

public class Main {
    public static int Y = 4001;
    public static double f, dis;
    int intervalAmount;

    public static double func1(int A, int B, int C, int Mm) {
        //int a = 5;
        Y = (A * Y * Y + B * Y + C) % Mm;
        return (double) Y / Mm;
    }

    public static void main(String[] args) throws FileNotFoundException {
        CentralLimitTheory.CentralLimitTheory(1500);
        BoxAndMallerMethod.BoxAndMallerMethod(1500);
    }
}

        /*// Creating a blank Excel sheet
        XSSFSheet sheet
                = workbook.createSheet("lr1");

        int N = 5000;
        int A = 6;
        int B = 7;
        int C = 3;
        int Mm = 4096;
        int k = 25;
        int K=2;
        double[] myArray = new double[5001];
        double[] myArray2 = new double[5001];
        double[] myArray3 = new double[5001];
        double[] myArray4 = new double[5001];
        double[] myArray5 = new double[5001];
        //Arrays.sort();
        for (int i = 1; i <= N; i++) {
            myArray[i] = func1(A, B, C, Mm);
            myArray2[i] = myArray[i] * myArray[i];
            myArray3[i] = myArray2[i] * myArray[i];

        }

        Map<Double, Object[]> data
                = new TreeMap<Double, Object[]>();

        double sum = Arrays.stream(myArray).sum();
        f = sum / N;

        System.out.println("Matozh1=" + f);
        for (int i = 1; i <= N; i++) {
            double g = (myArray[i] - f);
            dis = g * g;
            myArray4[i] = dis;
            data.put(Double.valueOf(i),
                    new Object[]{(i), myArray[i]});
        }
        Set<Double> keyset = data.keySet();

        int rownum = 0;

        for (Double key : keyset) {

            Row row = sheet.createRow(rownum++);

            Object[] objArr = data.get(key);

            int cellnum = 0;

            for (Object obj : objArr) {

                Cell cell = row.createCell(cellnum++);

                if (obj instanceof Double)
                    cell.setCellValue((Double) obj);

                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
            }
        }

//................................
        double sum2 = Arrays.stream(myArray2).sum();
        double f1 = sum2 / N;
        System.out.println("Moment2=" + f1);
//................................
        double sum3 = Arrays.stream(myArray3).sum();
        double f2 = sum3 / N;
        System.out.println("Moment3=" + f2);
//...............................
        double sum4 = Arrays.stream(myArray4).sum();
        double dis1 = sum4 / (N - 1);
        System.out.println("Dis=" + dis1);

        try {

            FileOutputStream out = new FileOutputStream(
                    new File("mod1.xlsx"));
            workbook.write(out);

            out.close();
        }

        // Catch block to handle exceptions
        catch (Exception e) {

            // Display exceptions along with line number
            // using printStackTrace() method
            e.printStackTrace();
        }

        //сортировака и разбиение на интервалы====================================
        // k = 25
        //myArray.length = 5000
        Arrays.sort(myArray);
        double Len = (myArray[5000] - myArray[1]) / k;
        int[] kol = new int[25];//количество элементов в каждом интервале
        for (int i = 0; i < k; i++)//интервалы
        {
            for (int n = 0; n < myArray.length; n++)//перебор элементов массива
            {
                if ((Double.compare(i * Len, myArray[n]) <= 0) &&
                        (Double.compare((i + 1) * Len, myArray[n]) > 0)) {
                    kol[i]++;
                }
            }
        }
        /*for(int i=0;i<kol.length;i++)
        {
            System.out.println("Quantity "+(i+1)+"="+kol[i]);
        }
        // System.out.println("Length=" + Len); // Длина интервала
        //конец сортировки и разбиения на интервалы=====================================================

        //Критерий Пирсона============================================
        double xi = 0;
        for (int j = 0; j < k; j++) {
            xi += (Math.pow((kol[j]) - myArray.length / k, 2) / myArray.length / k);
        }
        System.out.println("Pearson criterion=" + xi);

        //====================================================================
        //Критерий Колмогорова=========================================
        Arrays.sort(myArray);
        double dMax = 0.0;
        for (int j = 0; j < myArray.length; j++) {
            Double dp = Math.abs((double) (j + 1) / myArray.length - myArray[j]);
            double dm = Math.abs(myArray[j] - (double) j / myArray.length);
            if (dp > dMax) dMax = dp;
            if (dm > dMax) dMax = dm;
        }
        System.out.println("Kolmogorov criterion =" + dMax * Math.sqrt((myArray.length)));

    }
}
*/
