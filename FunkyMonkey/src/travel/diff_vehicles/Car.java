package travel.diff_vehicles;

import travel.Vehicle;

public class Car extends Vehicle {
    public Car(int id, String registration, int doors, String vehicle_colour, boolean sunroof, String vehicleType){
        this.setId(id);
        this.setDoors(doors);
        this.setVehicle_colour(vehicle_colour);
        this.setRegistration(registration);
        this.setSunroof(sunroof);
        this.setVehicleType(vehicleType);
    }
    private boolean sunroof;
    public boolean getSunroof(){
        return sunroof;
    }
    public void setSunroof(boolean sunroof){
        this.sunroof = sunroof;
    }


}


