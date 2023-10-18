package FacadePattern.StartComputer;

public class Client {

    public static void main(String args[]){

        ComputerFacade computerFacade= new ComputerFacade();
        // User initiates the computer startup process with a single call
        computerFacade.bootComputer();

    }

}
