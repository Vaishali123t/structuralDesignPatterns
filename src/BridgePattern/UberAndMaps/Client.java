package BridgePattern.UberAndMaps;

public class Client {

    public static void main(String[] args) {

        NavigationImpl navigationImpl = new GoogleMaps();

        NavigationSystem uberRide = new UberRides(navigationImpl);

        uberRide.navigate("pune");

    }

}
