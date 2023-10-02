package Classes;

import Enumerators.TypeCar;
import Enumerators.TypeFuel;
import Enumerators.TypeGearBox;
import java.awt.*;

public abstract class Car {
    private String mark;
    private String model;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gearBoxType;
    private Color bodyColor;
    private int engineCap;

    
    public Car(String mark, String model, TypeCar bodyType, 
                int numberWheels, TypeFuel fuelType,
                TypeGearBox gearBoxType, Color bodyColor, int engineCap) {
        this.mark = mark;
        this.model = model;
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
        this.fuelType = fuelType;
        this.gearBoxType = gearBoxType;
        this.bodyColor = bodyColor;
        this.engineCap = engineCap;
    }
    
    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public TypeGearBox getGearBoxType() {
        return gearBoxType;
    }

    public Color getBodyColor() {
        return bodyColor;
    }

    public int getEngineCap() {
        return engineCap;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public void setGearBoxType(TypeGearBox gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public void setBodyColor(Color bodyColor) {
        this.bodyColor = bodyColor;
    }

    public void setEngineCap(int engineCap) {
        this.engineCap = engineCap;
    }


    public void movement(){

    }

    public void maintenance(){

    }

    public boolean turnLights() {
        return true;
    }

    public boolean turnrubbers(){
        return true;
        
    }
}


