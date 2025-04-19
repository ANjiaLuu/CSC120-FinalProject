import java.util.ArrayList;
public class Building {
    protected String name;
    protected ArrayList<Item> evidence;
    protected String description;
    protected Coordinates location;

    public Building(String name, String description, Coordinates location) {
        this.name = name;
        this.description =  description;
        this.location =  location;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public Coordinates getLocation() {
        return this.loctaion;
    }
}
