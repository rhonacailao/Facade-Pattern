// Facade
public class FrontDesk {
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
