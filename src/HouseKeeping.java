// Subsystem
public class HouseKeeping implements HotelService{
    @Override
    public void requestingService(){
        System.out.println("Requesting housekeeping service..");
    }

    public void cleanRoom(int roomNumber){
        System.out.println("Cleaning room number " + roomNumber);
    }
}
