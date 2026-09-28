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