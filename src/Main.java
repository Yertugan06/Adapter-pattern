public class Main {
    public static void main(String[] args) {
        FuelCar toyota = new Toyota();
        GasCar hyundai = new Hyundai();
        GasCar adaptedtoyota = new FueltoGasAdapter(toyota);

        hyundai.drive();
        hyundai.fillGas();

        System.out.println("----");

        adaptedtoyota.drive();
        adaptedtoyota.fillGas();
    }
}
