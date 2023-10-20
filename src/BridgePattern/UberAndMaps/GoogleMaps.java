package BridgePattern.UberAndMaps;

public class GoogleMaps implements NavigationImpl{

    @Override
    public void navigate(String destination) {
        System.out.println("Navigate to "+destination+" via google maps");
    }
}
