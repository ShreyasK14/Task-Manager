import java.io.Serializable;

public class Task implements Serializable {
    String name;
    String description;
    String descriptionTitle;

    //4 constructors - 1 for every possible field that is or isn't filled out
    public Task(String name, String description, String descriptionTitle) {
        this.name = name;
        //this.group = group;
        this.descriptionTitle = descriptionTitle;
        this.description = description;
    }
    
    public Task(String name, String descriptionTitle) {
        this.name = name;
        //this.group = group;
        description = "--";
        this.descriptionTitle = descriptionTitle;
    }

    public Task(String name) {
        this.name = name;
        description = "--";
        descriptionTitle = "--";
        //group = "";
    }
    
    //returns the task name
    public String getName() {
        return name;
    }
    
    //edits the task group
    public void setName(String name) {
        this.name = name;
    }

    //returns the task's description
    public String getDescription() {
        return description;
    }

    //edits the task's descpription
    public void setDescription(String description) {
        this.description = description;
    }

    //returns the task's description title
    public String getDescriptionTitle() {
        return descriptionTitle;
    }

    //edits the task's description title
    public void setDescriptionTitle(String descriptionTitle) {
        this.descriptionTitle = descriptionTitle;
    }
    
    //a clean way to print all the info in a task
    public String toString() {
        return "Name: " + name + " DescriptionTitle: " + descriptionTitle + "Description: " + description;
    }
    
}
