interface HotelService {
    void requestingService(); // Added this method so interface isn't empty
}

// Subsystems
class Valet implements HotelService{
    @Override
    public void requestingService(){
        System.out.println("Requesting valet service..");
    }

    public void pickUpVehicle(int plateNumber){
        System.out.println("Picking up vehicle " + plateNumber);
    }
}

class HouseKeeping implements HotelService{
    @Override
    public void requestingService(){
        System.out.println("Requesting housekeeping service..");
    }

    public void cleanRoom(int roomNumber){
        System.out.println("Cleaning room number " + roomNumber);
    }
}

class Cart implements HotelService{
    @Override
    public void requestingService(){
        System.out.println("Requesting cart service..");
    }

    public void requestCart(int numberOfCarts){
        System.out.println("Requesting " + numberOfCarts + " carts.");
    }
}

// Facade
class FrontDesk {
    private Valet valet;
    private HouseKeeping housekeeping;
    private Cart cart;

    public FrontDesk(Valet valet, HouseKeeping housekeeping, Cart cart){
        this.valet = valet;
        this.housekeeping = housekeeping;
        this.cart = cart;
    }

    public void pickUpVehicle(int plateNumber) {
        valet.requestingService();
        valet.pickUpVehicle(plateNumber);
    }

    public void cleanRoom(int roomNumber) {
        housekeeping.requestingService();
        housekeeping.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        cart.requestingService();
        cart.requestCart(numberOfCarts);
    }
}

// Client
public class HotelApp {
    public static void main(String[] args){
        Valet valet = new Valet();
        HouseKeeping hs = new HouseKeeping();
        Cart cart = new Cart();

        FrontDesk facade = new FrontDesk(valet, hs, cart);
        facade.pickUpVehicle(138923);
        facade.cleanRoom(204);
        facade.requestCart(4);
    }
}