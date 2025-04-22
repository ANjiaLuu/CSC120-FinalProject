import java.util.ArrayList;
public class Building {
    
    public String name;
    public ArrayList<Item> evidence;
    public String description;
    public Coordinates location;

    public Building(String name, String description, Coordinates location) {
        this.name = name;
        this.description =  description;
        this.location =  location;
    }

    public enum ListOfBuildings {
        QUAD("Quad"),
        TALBOT_HOUSE ("Talbot House"),
        LAMONT_DINING("Lamont Dining Hall"),
        SEELYE_BASEMENT("Seelye Basement"),
        CAMPUS_CENTER("Campus Center"),
        COLLEGE_HALL("College Hall"),
        OUTDOOR_TRACK("Outdoor Track"),
        CHEMISTRY_LAB ("Chemistry Lab"),
        CERAMICS_BUILDING("Ceramics Building")
    }
      private String displayName;

      ListOfBuildings(String displayName) {
        this.displayName = displayName;
      }
      public String displayName() {
        return displayName; 
      }
    
    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public Coordinates getLocation() {
        return this.location;
    }

    // Nine locations:
    Building quad = new Building("Quad", 
        "Home to many dorms on Smith College.", 
        new Coordinates(0, 0));
    Building talbotHouse = new Building("Talbot House", 
        "A dorm, where Boba used to live, so that’s why something feels off now.", 
        new Coordinates(0, 1));
    Building lamontDining = new Building("Lamont Dining Hall", 
        "Lamont Dining Hall. An Allergy-free dining hall, Savannah works here and maybe she knows something?!",
        new Coordinates(0, 2));
    Building seelyeBasement = new Building("Seelye Basement", 
        "Workplace for Student technology consultant, where Shakila works so she has access to onecards as a worker. The one card has access to any building on campus.",
        new Coordinates(1, 0));
    Building campusCenter = new Building("Campus Center", 
        "A common place for studying and meeting with friends. Also there is a cafe.", 
        new Coordinates(1, 1));
    Building collegeHall =  new Building("College Hall",
        "Home to the offices for Class Deans as well as the Student Financial Aid office.",
        new Coordinates(1, 2));
    Building outdoorTrack = new Building("Outdoor Track", 
        "Anjia and Boba used to meet here several times a week because running club practices here.",
        new Coordinates(2, 0));
    Building chemistryLab = new Building("Chemistry Lab", 
        "Hanyu does her experiments there, but maybe she knows something about the poison that killed Boba...",
        new Coordinates(2, 1));
    Building ceramicsBuilding = new Building("Ceramics Building", 
        "Ceramics Club meets in this lovely location to make pottery together.",
        new Coordinates(2, 2));
    
}

