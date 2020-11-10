package Question2;

/*
2- Bir araba nesnesi oluşturup bu arabaya ait özellikleri
kurucu methodlar sayesinde tanımlayabildiğimiz bir sınıf yazınız.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car(2018, "Citroen", 35000, "mavi");
    }
}


class Car {
    int year;
    String model;
    int km;
    String color;

    public Car(int year, String model, int km, String color) {
        this.year = year;
        this.model = model;
        this.km = km;
        this.color = color;
        System.out.println("Aracımızın \nModel yılı = " + year + "\nMarkası = " + model + "\nKilometresi = "
                + km + "\nRengi = " + color);
    }
}
