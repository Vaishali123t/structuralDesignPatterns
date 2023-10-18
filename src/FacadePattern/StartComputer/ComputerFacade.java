package FacadePattern.StartComputer;

// Facade: Computer System
public class ComputerFacade {

    CPU cpu;
    Memory memory;
    Graphics graphics;

    ComputerFacade(){
        this.cpu= new CPU();
        this.graphics= new Graphics();
        this.memory= new Memory();
    }

    void bootComputer(){
        System.out.println("Starting the computer...");
        cpu.bootCPU();
        memory.initializeMemory();
        graphics.enableGraphics();
        System.out.println("Computer is ready to use.");
    }

}
