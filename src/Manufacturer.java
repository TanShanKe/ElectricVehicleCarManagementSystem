import java.util.ArrayList;

public class Manufacturer {
    private String id;
    private String name;
    private ArrayList<ElectricCar> electricCars;

    protected Manufacturer(){
        this("","",null);
    }

    protected Manufacturer (String id,String name, ElectricCar electricCars){
        this.id = id;
        this.name = name;
        this.electricCars = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getElectricCars() {
        String info = "";
        for (ElectricCar electricCar: electricCars) {
            info += "\nCar Id: " + electricCar.getId() + " Car Model: " + electricCar.getModel() ;
        }
        return info;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setElectricCars(ArrayList<ElectricCar> electricCars) {
        this.electricCars = electricCars;
    }

    public void addElectricCar(ElectricCar electricCar){
        electricCars.add(electricCar);
    }

    @Override
    public String toString() {
        return "---------------Manufacturer---------------" +"\nManufacturer Id: " + getId() + "\nManufacturer Name: " + getName() +"\nElectric Cars: " + getElectricCars();
    }

}
