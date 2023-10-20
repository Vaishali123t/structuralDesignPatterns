package BridgePattern.UberAndMaps;

public abstract class NavigationSystem {

    protected  NavigationImpl navigationImpl;
    public abstract void navigate(String destination);


}
