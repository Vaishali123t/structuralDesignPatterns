package CompositePattern.FileSystem;

public class Client {

    public static void main(String[] args) {

        Directory rootDir= new Directory("Root");
        Component file1= new File("learn.txt",1024);
        Component file2= new File("document.txt",2000);

        Directory subDir = new Directory("Subdirectory");
        Component file3 = new File("Data.csv", 150);

        subDir.addChild(file3);
        rootDir.addChild(subDir);
        rootDir.addChild(file1);
        rootDir.addChild(file2);

        rootDir.listContents();
        int totalSize= rootDir.getSize();
        System.out.println("Total size of "+rootDir.getName()+" is: "+rootDir.getSize());

    }

}
