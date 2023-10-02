package Classes;

import java.awt.Color;

import Enumerators.TypeCar;
import Enumerators.TypeFuel;
import Enumerators.TypeGearBox;
import Interfaces.ICarWash;
import Interfaces.IFuelStation;

public class Pickup extends Car implements IFuelStation, ICarWash{

    private int loadCap;

    public Pickup(String mark, String model, int numberWheels, TypeFuel fuelType,
            TypeGearBox gearBoxType, Color bodyColor, int engineCap) {
        super(mark, model, TypeCar.PICKUP, numberWheels, fuelType, gearBoxType, bodyColor, engineCap);

        this.loadCap = loadCap;
    }

    @Override
    public void fuel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fuel'");
    }

    @Override
    public void wipWindshield() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipWindshield'");
    }

    @Override
    public void wipHeadLights() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipHeadLights'");
    }

    @Override
    public void wipMirrors() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'wipMirrors'");
    }
    
}
