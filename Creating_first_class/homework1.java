package Creating_first_class;

class Car {
    String brand;
    String model;
    int year;
    double motor;

    Car(String inp_brand, String inp_model, int inp_year, double inp_motor) {
        brand = inp_brand;
        model = inp_model;
        year = inp_year;
        motor = inp_motor;
    }
}

public class homework1 {
    public static void main(String args[]) {
        Car ildirimin_masini = new Car("Mercedes", "E220", 2007, 5.5);
        System.out.println("Your car characteristics:");
        System.out.println(ildirimin_masini.brand);
        System.out.println(ildirimin_masini.model);
        System.out.println(ildirimin_masini.year);
        System.out.println(ildirimin_masini.motor);
    }
}