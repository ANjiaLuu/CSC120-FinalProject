import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
public class Gameloop{
    private Player player;
    private boolean ShakilaAccusedHanyu;
    private boolean StillPlaying;
    List<Building> buildings = new ArrayList<>();
    List<Item> items = new ArrayList<>();
    public Gameloop(){
      this.player= new Player(new Coordinates(0, 0));
      this.ShakilaAccusedHanyu=false; 
      this.StillPlaying=true;
    
// 9 buildings
    Building quad = new Building("Quad", 
        "Home to many dorms on Smith College.", 
        new Coordinates(0, 0));
    Building talbotHouse = new Building("Talbot House", 
        "A dorm, where Boba used to live, so that’s why something feels off now.", 
        new Coordinates(0, 1));
    Building campusCenter = new Building("Campus Center", 
        "A common place for studying and meeting with friends. Also there is a cafe.", 
        new Coordinates(1, 1));
    Building collegeHall =  new Building("College Hall",
        "Home to the offices for Class Deans as well as the Student Financial Aid office.",
        new Coordinates(1, 2));
    Building chemistryLab = new Building("Chemistry Lab", 
        "Hanyu does her experiments there, but maybe she knows something about the poison that killed Boba...",
        new Coordinates(2, 1));
    Building lamontDining = new Building("Lamont Dining Hall", 
        "Lamont Dining Hall. An Allergy-free dining hall, Savannah works here and maybe she knows something?!",
        new Coordinates(0, 2));
    Building seelyeBasement = new Building("Seelye Basement", 
        "Workplace for Student technology consultant, where Shakila works so she has access to onecards as a worker. The one card has access to any building on campus.",
        new Coordinates(1, 0));
    Building outdoorTrack = new Building("Outdoor Track", 
        "Anjia and Boba used to meet here several times a week because running club practices here.",
        new Coordinates(2, 0));
    Building ceramicsBuilding = new Building("Ceramics Building", 
        "Ceramics Club meets in this lovely location to make pottery together.",
        new Coordinates(2, 2));

    // add the buildings into the list
    buildings.add(quad);
    buildings.add(talbotHouse);
    buildings.add(campusCenter);
    buildings.add(chemistryLab);
    buildings.add(lamontDining);
    buildings.add(seelyeBasement);
    buildings.add(outdoorTrack);
    buildings.add(collegeHall);
    buildings.add(ceramicsBuilding);

    // 6 items
    Item newspaper = new Item("Newspaper", new Coordinates(1, 1), "Today's issue of the Sophian. Its main headline states 'Beloved Student Boba T. Slain Last Night in Talbot House!' Underneath it, there's another story about the Ceramics Club enjoying their pottery-making. Savannah is mentioned in this story.", false);
    Item epipen = new Item("EpiPen", new Coordinates(0, 2), "A medication used to treat allergic reactions. It seems like Boba used this sometime ago.", false);
    Item essay = new Item("Shakila's Essay", new Coordinates(2, 2), "A five-page essay. The very top of it says 'Shakila, this is the same paper that Boba give me! See me after class.'", false);
    Item backpack = new Item("Boba's Backpack", new Coordinates(1, 2), "There's a photo inside the front pocket of the backpack! You should be able to pick up this photo. Apart from that, the backpack appears to be empty.", false);
    Item photo = new Item("Photo", new Coordinates(1, 2), "A nice Polaroid picture of Boba, Shakila, Anjia, Savannah, and Hanyu. But it seems like Anjia's face has been written over with black marker.", true);
    Item cake = new Item("Cake", new Coordinates(0, 1), "A slice of vanilla cake on a paper plate. It doesn't seem like there are allergens in here, but you'd have to check...", false);

    // add the items into the list
    items.add(newspaper);
    items.add(epipen);
    items.add(essay);
    items.add(backpack);
    items.add(photo);
    items.add(cake);
    }
    public void run(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome, detective. Type commands like 'go east', 'inspect photo', or 'exit'.");

      while (true) {
        System.out.print("> ");
        String input = scanner.nextLine().trim().toLowerCase();

        if (input.equals("exit")) {
            System.out.println("Goodbye, detective.");
            break;
        } else if (input.startsWith("go ")) {
            String direction = input.substring(3);
            move(direction);
        } else if (input.startsWith("inspect ")) {
            String itemName = input.substring(8);
            inspect(itemName);
        } else if (input.startsWith("pickUp ")) {
            String itemName = input.substring(7);
            pickUp(itemName);
        } else if (input.startsWith("putDown ")) {
            String itemName = input.substring(8);
            putdown(itemName);
        } else if (input.startsWith("talkTo ")) {
            String itemName = input.substring(7);
            talkTo(itemName);
        }else {
            System.out.println("I don't understand that command.");
        }
    }

    scanner.close();


    }
      
      if (player.talk_to(Shakila)){
      if (player.has_Item(epipen){
        Shakila.talk();
      }
      if (player.has_Item(essay)){
        Shakila.talk();
        ShakilaAccusedHanyu=true;
      }
      if (player.has_Item(epipen)&&player.has_Item(cake)&& player.has_Item(photo)){
        Shakila.talk();
      }
 
 if (player.talk_to(Hanyu)){
      if player.location=="Chemistry_Lab"{
        Hanyu.talk();
      }
      if !shakilaAccusedHanyu{
        Hanyu.talk();
      }else {
        Hanyu.talk();
      }
 if (player.talk_to(Savannah)){
      Savannah.talk();
      }
 if (player.talk_to(Anjia)){
   if ! player.has_Item(photo){
       Anjia.talk();
      }else{
      Anjia.talk();   
     }
 }
 public void run(){
   
 }
}
}
