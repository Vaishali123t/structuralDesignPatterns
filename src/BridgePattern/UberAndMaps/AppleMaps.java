package BridgePattern.UberAndMaps;

public class AppleMaps implements NavigationImpl{
    @Override
    public void navigate(String destination) {
        System.out.println("Navigate to "+destination+" via apple maps");
    }
}
