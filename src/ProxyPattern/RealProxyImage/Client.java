package ProxyPattern.RealProxyImage;

public class Client {

    public static void main(String args[]){

        // create an image proxy for high resolution image
        Image proxy= new ProxyImage("proxy_pattern.png");

        // display the image (loading it on-demand)
        proxy.display();

        // the image is not loaded again if we display it multiple time
        proxy.display();


    }

}
