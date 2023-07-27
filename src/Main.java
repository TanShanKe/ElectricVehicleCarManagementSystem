import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Create ArrayList to store manufacturers
        ArrayList<Manufacturer> manufacturers = new ArrayList<>();

        //Create ArrayList to store charging stations
        ArrayList<ChargingStation> chargingStations = new ArrayList<>();

        //Create ArrayList to store customers
        ArrayList<Customer> customers = new ArrayList<>();

        //Create Manufacturers
        Manufacturer manufacturer1 = new Manufacturer("M1","Tesla Manufacture",null);
        Manufacturer manufacturer2 = new Manufacturer("M2","Ora Manufacture",null);

        //Create Electric Cars
        ElectricCar electricCar1 = new Tesla("E1","Tesla Model S",manufacturer1,100,true,false,true);
        ElectricCar electricCar2 = new Tesla("E2","Tesla Model 3",manufacturer1,80,false, true,false);
        ElectricCar electricCar3 = new Ora("E3","Ora R1",manufacturer1,33,false,true);
        ElectricCar electricCar4 = new Ora("E4","Ora R2",manufacturer1,47.8,true,false);

        //Create Charging Stations
        ChargingStation chargingStation1 = new ChargingStation("C1","Impian Emas",2000);
        ChargingStation chargingStation2 = new ChargingStation("C2","Austin Height",1200);

        //Create customers
        Customer customer1 = new Customer("T1", "Happy", null);
        Customer customer2 = new Customer("T2", "Lucky", null);

        //Add customers to ArrayList
        customers.add(customer1);
        customers.add(customer2);

        //Add Cars to the Manufacturer
        manufacturer1.addElectricCar(electricCar1);
        manufacturer1.addElectricCar(electricCar2);
        manufacturer2.addElectricCar(electricCar3);
        manufacturer2.addElectricCar(electricCar4);

        //Add manufacturers to ArrayList
        manufacturers.add(manufacturer1);
        manufacturers.add(manufacturer2);

        //Add charging stations to ArrayList
        chargingStations.add(chargingStation1);
        chargingStations.add(chargingStation2);

        //Card owned by customers
        customer1.addElectricCar(electricCar1);
        customer1.addElectricCar(electricCar3);
        customer2.addElectricCar(electricCar2);
        customer2.addElectricCar(electricCar4);

        //Customers car charging stations
        customer1.setChargingStationForElectricCar(electricCar1,chargingStation1);
        customer1.setChargingStationForElectricCar(electricCar3,chargingStation2);
        customer2.setChargingStationForElectricCar(electricCar2,chargingStation1);
        customer2.setChargingStationForElectricCar(electricCar4,chargingStation2);

        //To know which customer is it
        int type = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Electric Vehicle Car Management System");
        System.out.print("Please enter your customer id:");
        String id;
        id = scanner.next().toUpperCase();

        if (id != null) {
            if (id.equals(customer1.getId())) {
                type = 1;
            } else if (id.equals(customer2.getId())) {
                type = 2;
            } else {
                System.out.println("Your id is invalid");
                System.exit(0);
            }
        }

        System.out.println("\nLogin Successful");
        System.out.println("What would you like to do?");
        System.out.println("1.View the list of electric car manufacturers and their car models");
        System.out.println("2.Purchase an electric car");
        System.out.println("3.View and update your car charging station");
        System.out.println("4.View the list of electric cars owned by each customer and their corresponding details");
        System.out.println("0.Exit");
        System.out.print("Enter your choice number: ");

        int choice;

        choice = scanner.nextInt();
        System.out.println();

        while (choice != 0){

            //View manufacturers and their car modules
            if (choice == 1){
                System.out.println("Manufacturer and their car modules:");
                for(Manufacturer manufacturer: manufacturers){
                    System.out.println(manufacturer);
                }
            }

            //purchase car
            else if (choice == 2){
                System.out.println("Manufacturer and their car modules:");
                for(Manufacturer manufacturer: manufacturers){
                    System.out.println("------------"+manufacturer.getName()+"------------");
                    System.out.print("Car Modules:");
                    System.out.println(manufacturer.getElectricCars());
                }

                System.out.print("Enter the Electric Car's ID that you want to purchase: ");
                String carId = scanner.next().toUpperCase();
                ElectricCar selectedCar = null;
                if(carId.equals(electricCar1.getId())){
                    selectedCar = electricCar1;
                }else if(carId.equals(electricCar2.getId())){
                    selectedCar = electricCar2;
                }
                else if(carId.equals(electricCar3.getId())){
                    selectedCar = electricCar3;
                }
                else if(carId.equals(electricCar4.getId())){
                    selectedCar = electricCar4;
                }

                if(type==1){
                    customer1.addElectricCar(selectedCar);
                    customer1.setChargingStationForElectricCar(selectedCar,chargingStation1);
                }else if(type==2){
                    customer2.addElectricCar(selectedCar);
                    customer2.setChargingStationForElectricCar(selectedCar,chargingStation2);
                }

                System.out.println("Successfully purchased " + selectedCar.getModel());

            }

            //View or update car charging station
            else if (choice==3) {
                System.out.println("--------Your car charging station--------");
                if(type == 1){
                    System.out.println(customer1.getChargingStation());
                }else if(type == 2){
                    System.out.println(customer2.getChargingStation());
                }

                System.out.print("\nDo you want to update your car charging station? (Y/N): ");
                String option = scanner.next().toUpperCase();
                if (option.equals("Y")){
                    for(ChargingStation chargingStation: chargingStations){
                        System.out.println(chargingStation);
                    }
                    System.out.print("\nEnter the Electric Car's ID that you want to update its charging station: ");
                    String carId = scanner.next().toUpperCase();
                    ElectricCar selectedCar = null;
                    if(carId.equals(electricCar1.getId())){
                        selectedCar = electricCar1;
                    }else if(carId.equals(electricCar2.getId())){
                        selectedCar = electricCar2;
                    }
                    else if(carId.equals(electricCar3.getId())){
                        selectedCar = electricCar3;
                    }
                    else if(carId.equals(electricCar4.getId())){
                        selectedCar = electricCar4;
                    }

                    System.out.print("\nEnter the charging station id that you would like to choose: ");
                    String stationId = scanner.next().toUpperCase();
                    ChargingStation selectedChargingStation = null;
                    if(stationId.equals(chargingStation1.getId())){
                        selectedChargingStation = chargingStation1;
                    }else if(stationId.equals(chargingStation2.getId())){
                        selectedChargingStation = chargingStation2;
                    }

                    if(type==1){
                        customer1.setChargingStationForElectricCar(selectedCar,selectedChargingStation);
                    }else if(type==2){
                        customer2.setChargingStationForElectricCar(selectedCar,selectedChargingStation);
                    }

                    System.out.println("Successfully updated your car charging station!");
                }

            }

            //display list of cars owned by each customer and its details
            else if (choice == 4){
                for(Customer customer: customers){
                    System.out.println(customer);
                }
            }

            else{
                System.out.println("Please enter a valid number!");
            }

            System.out.println("\nWhat would you like to do?");
            System.out.println("1.View the electric car manufacturers and their car models");
            System.out.println("2.Purchase an electric car");
            System.out.println("3.View and update your car charging station");
            System.out.println("4.View the electric cars owned by customers and its details");
            System.out.println("0.Exit");
            System.out.print("Enter your choice number: ");

            choice = scanner.nextInt();
            System.out.println();

        }


    }
}