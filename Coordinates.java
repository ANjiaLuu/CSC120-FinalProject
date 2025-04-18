public class Coordinates {
  x: double;
  y: double;
  string name; 

  public Location(String n, double x, double y) {
    this.name = n;
    this.x = x;
    this.y = y;
  }
  
  public static void main{
    Location Quad = new Location("Quad", 0, 0);
    Location Talbot_House = new Location ("Talbot_House", 0, 1);
    Location Lamont_Dining = new Location ("Lamont_Dining", 0, 2);
    Location Seelye_Basement = new Location ("Seelye_Basement", 1, 0);
    Location Campus_Center =  new Location ("Campus_Center", 1, 1);
    Location College_Hall = new Location ("College_Hall", 1, 2);
    Location Outdoor_Track = new Location ("Outdoor_Track", 2, 0);
    Location Chemistry_Lab = new Location ("Chemistry_Lab", 2, 1);
    Location Ceramics_Building = new Location ("Ceramics_Building", 2, 2); 
  
  }
}
