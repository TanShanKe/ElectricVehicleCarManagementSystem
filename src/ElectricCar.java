import java.util.ArrayList;

public class ElectricCar {
    private String id;
    private String model;
    private Manufacturer manufacturer;
    private ChargingStation chargingStation;
    private double batteryCapacity;

    protected ElectricCar(){
        this("","",null,0);
    }

    protected ElectricCar(String id, String model, Manufacturer manufacturer, double batteryCapacity){
        this.id = id;
        this.model = model;
        this.manufacturer = manufacturer;
        this.chargingStation = new ChargingStation();
        this.batteryCapacity = batteryCapacity;
    }

    public String getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public ChargingStation getChargingStation() {
        return chargingStation;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setChargingStation(ChargingStation chargingStation) {
        this.chargingStation = chargingStation;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "\n------------Electric Car----------"+"\nId: " + getId() + "\nModel: " + getModel() +  "\nManufacturer: " + getManufacturer().getName() + "\nCharging station: " + getChargingStation().getLocation() + "\nBattery Capacity: " + getBatteryCapacity() + " kWh";
    }

}
