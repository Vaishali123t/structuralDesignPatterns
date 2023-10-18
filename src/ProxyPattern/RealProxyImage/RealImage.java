package ProxyPattern.RealProxyImage;

public class RealImage implements Image{

    private String name;

    RealImage(String filename){
        this.name= filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading the image from disk..");
    }

    @Override
    public void display() {
        System.out.println("The image named "+ this.name+ " displayed");
    }
}
