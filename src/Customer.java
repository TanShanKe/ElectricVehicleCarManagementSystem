import java.util.ArrayList;

public class Customer {
    private String id;
    private String name;
    private ArrayList<ElectricCar> ownedElectricCars;

    protected Customer(){
        this("","", null);
    }

    protected Customer(String id, String name, ElectricCar ownedElectricCars){
        this.id = id;
        this.name = name;
        this.ownedElectricCars = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOwnedElectricCars() {
        String info = "";
        for (ElectricCar electricCar: ownedElectricCars) {
            info += "";
            if (electricCar instanceof Tesla) {
                Tesla teslaCar = (Tesla) electricCar;
                info += teslaCar.toString();
            } else if (electricCar instanceof Ora) {
                Ora oraCar = (Ora) electricCar;
                info += oraCar.toString();
            }
        }
        return info;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOwnedElectricCars(ArrayList<ElectricCar> ownedElectricCar) {
        this.ownedElectricCars = ownedElectricCar;
    }

    public void addElectricCar(ElectricCar electricCar){
        ownedElectricCars.add(electricCar);
    }

    public void setChargingStationForElectricCar(ElectricCar electricCar, ChargingStation chargingStation) {
        // Check if the ownedElectricCars list contains the specified electric car
        if (ownedElectricCars.contains(electricCar)) {
            // Set the charging station for the specified electric car
            electricCar.setChargingStation(chargingStation);
        } else{
            System.out.println("No certain car!");
        }
    }

    public String getChargingStation() {
        String info = "";
        for (ElectricCar electricCar: ownedElectricCars) {
            info += "\nCar Id: " + electricCar.getId() + " Car Model: " + electricCar.getModel() + " Car Charging Station: " + electricCar.getChargingStation().getLocation() ;
        }
        return info;
    }

    @Override
    public String toString() {
        return "----------Customer----------" + "\nCustomer Id: " + getId() + "\nCustomer Name: " + getName() + "\nElectric Cars: " + getOwnedElectricCars();
    }
}
