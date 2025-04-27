import java.util.ArrayList;
public class NPC{
  protected String name;
  protected String description;
  protected ArrayList<String> dialogue;
  protected Building building;
  protected Coordinates coordinates;
  protected int dialogueIndex=0;
  
  public NPC(String name,String description,ArrayList<String> dialogue,Building building){
    this.name=name;
    this.description=description;
    this.dialogue=dialogue;
    this. building= building;
  }
	
  public void talk(){
    if (dialogueIndex<dialogue.size()){
      System.out.println(name+":"+dialogue.get(dialogueIndex));
	dialogueIndex+=1;}
  }
	
  public String getName(){
    return this.name;
  }
	
  public Coordinates getCoordinates(){
    return this.coordinates;
  }
	
  public void move(Building newBuilding){
    this.building=newBuilding;
  }

  public String getDescription(){
    return this.description;
  }}
    
