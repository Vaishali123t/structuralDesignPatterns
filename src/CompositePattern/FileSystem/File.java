package CompositePattern.FileSystem;

public class File implements Component{

    private String name;
    private int size;

    File(String filename, int fileSize){
        this.name= filename;
        this.size= fileSize;
    }

    @Override
    public Integer getSize() {
        return this.size;
    }

    @Override
    public void listContents() {
        System.out.println("File: "+this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

}
