import java.util.ArrayList;

public class VehicleFleet {

    public static void main(String[] args) {

        ArrayList<Vehicle> fleet =
                new ArrayList<>();

        fleet.add(new Bike());
        fleet.add(new Bus());

        for(Vehicle v : fleet) {
            System.out.println(
                    "Fee = " +
                            v.calculateFee());
        }
    }
}