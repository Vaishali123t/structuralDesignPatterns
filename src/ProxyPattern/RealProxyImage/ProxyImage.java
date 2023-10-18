package ProxyPattern.RealProxyImage;

public class ProxyImage implements Image{

    private RealImage realImage;
    private String name;

    ProxyImage(String filename){
        this.name= filename;
    }

    @Override
    public void display() {

        if (realImage == null) {
            realImage = new RealImage(this.name);
        }

        realImage.display();

    }
}
