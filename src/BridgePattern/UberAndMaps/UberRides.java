package BridgePattern.UberAndMaps;

public class UberRides extends NavigationSystem{


    UberRides(NavigationImpl navigation){
        navigationImpl=navigation;
    }

    @Override
    public void navigate(String destination) {

      super.navigationImpl.navigate(destination);
    }
}
