// Subsystem
public class Cart implements HotelService{
    @Override
    public void requestingService(){
        System.out.println("Requesting cart service..");
    }

    public void requestCart(int numberOfCarts){
        System.out.println("Requesting " + numberOfCarts + " carts.");
    }
}
