import java.util.ArrayList;
public class NPC{
  public String name;
  public String description;
  public ArrayList<String> dialogue;
  public Coordinates location;
  
  public NPC(String name,String description,ArrayList<String> dialogue, Coordinates location){
    this.name=name;
    this.description=description;
    this.dialogue=dialogue;
    this.location= location;
  }

  }
