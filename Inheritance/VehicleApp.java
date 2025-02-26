package Inheritance;

public class VehicleApp {
    public static void main(String[] args) {
        Lada lada = new Lada();
        lada.start();
        Nissan nissan = new Nissan();
        nissan.start();
        Toyota toyota = new Toyota();
        toyota.start();
        Hyundai hyundai = new Hyundai();
        hyundai.start();
    }
}
