public class NPC{
  protected String name;
  protected String description;
  protected String dialogue;
  protected Location location;
  public NPC(String name,String description,String dialogue,Location,location){
    this.name=name;
    this.description=description;
    this.dialogue=dialogue;
    this.location=location;
  public void talk(){
    System.out.println(name+dialogue)
  }
  public String getName{
    return this.name;
  }
  public Location getLocation{
    return this.location;
  }
  public void move(Location newLocation){
    this.location=newlocation;
  }

  public String getDescription{
    return this.description;
}
