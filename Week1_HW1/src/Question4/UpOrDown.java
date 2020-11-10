package Question4;

import java.util.Scanner;

/*
4- Kullanıcıdan alınan ondalıklı bir sayının ondalık kısmına göre aşağı ve yukarı doğru yuvarlama işlemi yapacak
    bir program yazınız.
  - aşağı veya yukarı yuvalarlanacağını kullanıcıdan bir bilgi olarak alınız.

 */
public class UpOrDown {

    public static void main(String[] args) {
        round();
    }

    public static void round() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen ondalıklı bir sayı giriniz..");
        double number = scanner.nextDouble();

        System.out.println("Girdiğiniz sayıyı\nAşağıya yuvarlamak isterseniz 1'i"
                + "\nYukarı yuvarlamak isterseniz 2 yi tuşlayınız..");

        int choosen = scanner.nextInt();

        boolean rightChoose = (choosen == 1 && choosen == 2) ? true : false;

        while (!rightChoose) {
            if (choosen == 1) {
                System.out.println("Girdiğiniz sayının aşağıya yuvarlanmış hali = " + Math.floor(number));
                rightChoose = true;
            } else if (choosen == 2) {
                System.out.println("Girdiğiniz sayının yukarı yuvarlanmış hali = " + Math.ceil(number));
                rightChoose = true;

            } else {
                System.out.println("Öyle bir seçenek yok\n\nGirdiğiniz sayıyı\nAşağıya yuvarlamak isterseniz 1'i" +
                        "                +\nYukarı yuvarlamak isterseniz 2 yi tuşlayınız..");
                choosen = scanner.nextInt();
            }
        }


    }
}