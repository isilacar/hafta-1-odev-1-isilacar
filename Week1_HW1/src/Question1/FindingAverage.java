package Question1;

public class FindingAverage {
    /*
    1- 0 ile 2000 arasında 3,5,7 ve 53’e bölünebilen sayıların
    ağırlıklı ortalamasını bulan bir uygulama yazınız.
     */

    public static void main(String[] args) {
        average();
    }

    public static void average() {
        int sumOfNumbers = 0;
        int countingNumbers = 0;
        double average;

        for (int i = 0; i < 2000; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0 && i % 53 == 0) {
                sumOfNumbers += i;
                countingNumbers++;
            }
        }

        average = sumOfNumbers / countingNumbers;
        System.out.println("0 ile 2000 arasında 3'e,5'e,7'ye ve 53'e aynı anda bölünebilen " + countingNumbers
                + " tane sayı vardır. Ortalamımız " + average);
    }
}
