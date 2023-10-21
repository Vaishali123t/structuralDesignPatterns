package CompositePattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Component{

    private String name;
    private List<Component> children;

    Directory(String filename){
        this.name= filename;
        this.children= new ArrayList<>();
    }

    public void addChild(Component file){
        children.add(file);
    }

    @Override
    public Integer getSize() {
        int totalSize=0;
        for(Component component:children){
            totalSize+=component.getSize();
        }
        return totalSize;
    }


    @Override
    public void listContents() {
        System.out.println("Directory: " + name);
        for(Component component:children){
            component.listContents();
        }
    }

    @Override
    public String getName() {
        return this.name;
    }
}
