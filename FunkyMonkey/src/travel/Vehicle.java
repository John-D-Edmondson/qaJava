package travel;

public class Vehicle {
    private String vehicle_colour;

    public String getVehicle_colour() {
        return vehicle_colour;
    }
    public void setVehicle_colour(String vehicle_colour) {
        this.vehicle_colour = vehicle_colour;
    }

    private int wheels = 4;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private int id;

    public String getRegistration() {
        return registration;
    }
    public void setRegistration(String registration) {
        this.registration = registration;
    }
    private String registration;

    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }

    private int doors;

    private String vehicleType;
    public String getVehicleType() {
        return "car";
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void horn(){
        System.out.println("beep beep");
    }
}
