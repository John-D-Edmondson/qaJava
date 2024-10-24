package travel;

import java.util.*;

public class Garage {
    private ArrayList<Vehicle> vehicles;
    public Garage(){
        vehicles = new ArrayList<>();
    }
    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    public void removeVehicle(int id) {
        vehicles.removeIf(vehicle -> vehicle.getId() == (id));
    }

    public void removeVehicle(String vehicleType){
        vehicles.removeIf(vehicle -> vehicle.getVehicleType().equals(vehicleType));
    }

    public double createBill(String vehicleType){
        return switch (vehicleType) {
            case "car" -> 50.50;
            case "minibus" -> 100.89;
            default -> 0;
        };
    }

    public ArrayList<Double> fixVehicles(){
        ArrayList<Double> costs = new ArrayList<>();
        for(Vehicle vehicle:vehicles){
            costs.add(createBill(vehicle.getVehicleType()));
        }
        return costs;
    }

    public void emptyGarage(){
        vehicles.removeAll(vehicles);
    }
}
