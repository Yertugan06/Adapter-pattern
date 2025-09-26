public class FueltoGasAdapter implements GasCar{
    private final FuelCar fuelCar;

    public FueltoGasAdapter(FuelCar fuelCar){
        this.fuelCar = fuelCar;
    }

    @Override
    public void drive(){
        fuelCar.drive();
    }

    @Override
    public void fillGas(){
        System.out.println("Adapter changes fuel into gas");
        fuelCar.refuel();
    }
}
