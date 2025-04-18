public class Coordinates {
  x: double;
  y: double;
  string name; 
  string locationDescription;

  public Location(String n, double x, double y, String l) {
    this.name = n;
    this.x = x;
    this.y = y;
    this.locationDescription = l;
  }
  
  public static void main{
    Location Quad = new Location("Quad", 0, 0, "Home to many dorms on Smith College.");
    Location Talbot_House = new Location ("Talbot_House", 0, 1, "A dorm, where Boba used to live so that’s why something feels off now.");
    Location Lamont_Dining = new Location ("Lamont_Dining", 0, 2, "Lamont Dining Hall. An Allergy-free dining hall, Savannah works here and maybe she knows something?!");
    Location Seelye_Basement = new Location ("Seelye_Basement", 1, 0, "Workplace for Student technology consultant, where Shakila works so she has access to onecards as a worker. The one card has access to any building on campus.");
    Location Campus_Center =  new Location ("Campus_Center", 1, 1, "A common place for studying and meeting with friends. Also there is a cafe.");
    Location College_Hall = new Location ("College_Hall", 1, 2, "Home to the offices for Class Deans as well as the Student Financial Aid office.");
    Location Outdoor_Track = new Location ("Outdoor_Track", 2, 0, "Anjia and Boba used to meet here several times a week because running club practices here.");
    Location Chemistry_Lab = new Location ("Chemistry_Lab", 2, 1, "Hanyu does her experiments there, but maybe she knows something about the poison that killed Boba...");
    Location Ceramics_Building = new Location ("Ceramics_Building", 2, 2, "Ceramics Club meets in this lovely location to make pottery together."); 
  
  }
}
