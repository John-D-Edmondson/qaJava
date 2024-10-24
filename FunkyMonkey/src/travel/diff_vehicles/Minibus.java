package travel.diff_vehicles;

import travel.Vehicle;

public class Minibus extends Vehicle {
    public Minibus(int id, String registration, int doors, String vehicle_colour, int wheels, int extraSeats, String vehicleType){
        this.setId(id);
        this.setDoors(doors);
        this.setVehicle_colour(vehicle_colour);
        this.setRegistration(registration);
        this.setWheels(wheels);
        this.setExtraSeats(extraSeats);
        this.setVehicleType(vehicleType);
    }

    private int extraSeats;

    public int getExtraSeats() {
        return extraSeats;
    }

    public void setExtraSeats(int extraSeats) {
        this.extraSeats = extraSeats;
    }
}
