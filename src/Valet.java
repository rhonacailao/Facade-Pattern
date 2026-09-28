// Subsystem
public class Valet implements HotelService{
    @Override
    public void requestingService(){
        System.out.println("Requesting valet service..");
    }

    public void pickUpVehicle(int plateNumber){
        System.out.println("Picking up vehicle " + plateNumber);
    }
}
