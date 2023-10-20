package BridgePattern.UberAndMaps;

public class UberEats extends NavigationSystem{

    UberEats(NavigationImpl navigation){
        navigationImpl=navigation;
    }

    @Override
    public void navigate(String destination) {

        super.navigationImpl.navigate(destination);
    }
}
