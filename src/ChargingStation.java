public class ChargingStation {
    private String id;
    private String location;
    private double availableChargingCapacity;
    protected ChargingStation(){
        this("","",0);
    }

    protected  ChargingStation (String id, String location, double availableChargingCapacity){
        this.id = id;
        this.location = location;
        this.availableChargingCapacity = availableChargingCapacity;
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public double getAvailableChargingCapacity() {
        return availableChargingCapacity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAvailableChargingCapacity(double availableChargingCapacity) {
        this.availableChargingCapacity = availableChargingCapacity;
    }

    @Override
    public String toString() {
        return "----------Charging Station----------" + "\nId: " + getId() + "\nLocation: " + getLocation() + "\nAvailable Charging Capacity: " + getAvailableChargingCapacity() + " kWh";
    }
}
