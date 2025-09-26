public class Hyundai implements GasCar {
    @Override
    public void fillGas() {
        System.out.println("Huyndai filled with gas...");
    }
    @Override
    public void drive() {
        System.out.println("Huyndai driving to Airport");
    }
}
