import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Gameloop {
    public Player player;
    private boolean ShakilaAccusedHanyu;
    // private boolean StillPlaying;
    public List<Building> buildings = new ArrayList<>();
    public List<Item> items = new ArrayList<>();
    public Gameloop(){
      player= new Player();
      ShakilaAccusedHanyu=false; 

// 9 buildings
    Building quad = new Building("Quad", 
        "Home to many dorms on Smith College.", 
        new Coordinates(0, 0));
    Building talbotHouse = new Building("Talbot House", 
        "A dorm, where Boba used to live, so that’s why something feels off now.Hanyu is standing in the aisle. Hanyu lives in Talbot House, just like the victim! Maybe Hanyu wanted her room next year.Did the person die from regular poisoning? Did one of the suspects intentionally poison them with peanuts Do you wanna talk to Hanyu to find out? And look! there is a cake at the corner of the sofa.", 
        new Coordinates(0, 1));
    Building campusCenter = new Building("Campus Center", 
        "A common place for studying and meeting with friends. Also there is a cafe.There is a newspaper on the table in the cafe.", 
        new Coordinates(1, 1));
    Building collegeHall =  new Building("College Hall",
        "Home to the offices for Class Deans as well as the Student Financial Aid office.",
        new Coordinates(1, 2));
    Building chemistryLab = new Building("Chemistry Lab", 
        "Hanyu does her experiments there, but maybe she knows something about the poison that killed Boba...",
        new Coordinates(2, 1));
    Building lamontDining = new Building("Lamont Dining Hall", 
        "Lamont Dining Hall. An Allergy-free dining hall. Savannah works in Lamont Dining Hall, just like the victim. Didn’t like how lazy they were in the dining hall. Had a chance to poison the student with peanuts! Do you wanna talk to her?",
        new Coordinates(0, 2));
    Building seelyeBasement = new Building("Seelye Basement", 
        "Workplace for Student technology consultant, where Shakila works so she has access to onecards as a worker. The one card has access to any building on campus.Victim copied Shakila’s homework and accusations of plagiarism nearly got her to the honor board. Do you wanna talk to her?",
        new Coordinates(1, 0));
    Building outdoorTrack = new Building("Outdoor Track", 
        "Anjia and Boba used to meet here several times a week because running club practices here. Anjia was on the running club just like the victim. Jealous of her mile time. Do you wanna talk to her?",
        new Coordinates(2, 0));
    Building ceramicsBuilding = new Building("Ceramics Building", 
        "Ceramics Club meets in this lovely location to make pottery together.There is an essay lying on the ground with Shakila’s name on it.",
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
    //Item backpack = new Item("Boba's Backpack", new Coordinates(1, 2), "There's a photo inside the front pocket of the backpack! You should be able to pick up this photo. Apart from that, the backpack appears to be empty.", false);
    Item photo = new Item("Photo", new Coordinates(1, 2), "A nice Polaroid picture of Boba, Shakila, Anjia, Savannah, and Hanyu. But it seems like Anjia's face has been written over with black marker.", false);
    Item cake = new Item("Cake", new Coordinates(0, 1), "A slice of vanilla cake on a paper plate. It doesn't seem like there are allergens in here, but you'd have to check...maybe go to the chemistry lab?", false);

    // add the items into the list
    items.add(newspaper);
    items.add(epipen);
    items.add(essay);
    //items.add(backpack);
    items.add(photo);
    items.add(cake);
    }

    // NPCs
    String [] shakila_d={ 
    "Look closely at the EpiPen - it was broken! Someone messed with it so it wouldn’t work properly."
     , "I was framed! I wrote the essay a few days ago and showed it to Hanyu to help me make edits. But Hanyu and Boba both lived in Talbot House. Maybe Hanyu was involved…",
     "I forgot to say this earlier, but I lent Anjia my OneCard earlier, and she could access all sorts of buildings with it…"
    };
    NPC Shakila= new NPC("Shakila","Works in Seelye basement, and has access to every door on campus with Seelye OneCard. Victim copied Shakila’s homework and accusations of plagiarism nearly got her to the honor board.", 
    new ArrayList<>(Arrays.asList(shakila_d)), new Coordinates(1, 0));

    
    String [] hanyu_d={
    "I think it was Savannah! She was acting weird, asking me about peanut allergies when I don’t do food science, I do other things in Chemistry. If you want to look for Savannah I think she’s working a shift in Lamont dining hall. Also my lab is nearly over so I’m going to go back to my House."
    ,"Didn’t we just talk earlier? I’d like to help you more but I don’t know what else to say.","I didn’t help Boba cheat. Actually… I think Anjia hates Boba’s most because in every running race, Boba is the winner and Anjia is the runner up."
    };
    NPC Hanyu=new NPC("Hanyu","lives in Talbot House, just like the victim! Maybe Hanyu wanted her room next year.", new ArrayList<>(Arrays.asList(hanyu_d)),new Coordinates(2, 1));

  
    String [] savannah_d={ 
      "Look at the newspaper! There’s a photo of me in Ceramics Club during the night of the murder. I have to be innocent!If you don't believe me, you can go to ceramics buidling."
    };
    NPC Savannah= new NPC("Savannah","Works in Lamont Dining Hall, just like the victim. Didn’t like how lazy they were in the dining hall. Had a chance to poison the student with peanuts!",new ArrayList<>(Arrays.asList(savannah_d)),new Coordinates(0, 2));


    String [] anjia_d={
      "There is no way I will kill Boba! I always run with her and she is awesome!
        Now it seems like every suspect doesn't admit they are related to Boba's death. Do you wanna go to College Hall where Baba last was. "
    ,"We weren’t really friends when Boba passed away, but that doesn’t mean I killed her. She died from a peanut poisoning, right? I had no way of poisoning her."
    };
    NPC Anjia=new NPC("Anjia","Was on the running club just like the victim. Jealous of her mile time.",new ArrayList<>(Arrays.asList(anjia_d)), new Coordinates(2, 0));


    public void run(){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Hello, Detective! You have been commissioned by the Chief of Northampton Police Station to investigate a murder case at Smith College. Your initial coordinates are (1, 1), Campus Center. Please check the cheatsheet if you are confused about your location or your commands.");

      while (true) {
        System.out.print(">>> ");
        String input = scanner.nextLine().trim();
        if (input.equalsIgnoreCase("show inventory")) {
          player.showInventory();
        } else if (input.equals("exit")) {
            System.out.println("Goodbye, detective.");
            break;
        } else if (input.startsWith("go ")) {
            String direction = input.substring(3);
            player.move(direction);
            System.out.println(player.playerLocation);
        } else if (input.startsWith("inspect ")) {
            String playerInspect = input.substring(8);
            player.inspect(playerInspect, buildings);
        } else if (input.startsWith("pick up ")) {
            String itemName = input.substring(8);
            player.pickUp(itemName, items);
        } else if (input.startsWith("put down ")) {
            String itemName = input.substring(8);
            player.putDown(itemName);

        } else if (input.startsWith("talk to ")) {
            String playerTalkTo = input.substring(8);

            if (playerTalkTo.equalsIgnoreCase(Shakila.name) && player.playerLocation.equals(Shakila.location)) {
              if (player.getInventory().contains(items.get(1))) {
                System.out.println(Shakila.dialogue.get(0));
              }
              if (player.getInventory().contains(items.get(2))) {
                System.out.println(Shakila.dialogue.get(1));
                ShakilaAccusedHanyu=true;
              }
              if (player.getInventory().containsAll(items)) {
                System.out.println(Shakila.dialogue.get(2));
              }
            } else if (playerTalkTo.equalsIgnoreCase(Hanyu.name)) {
              if (player.playerLocation.equals(buildings.get(3).location)) {
                  System.out.println(Hanyu.dialogue.get(0));
              } else if (player.playerLocation.equals(buildings.get(1).location)) {
                  if (!ShakilaAccusedHanyu) {
                      System.out.println(Hanyu.dialogue.get(1));
                  } else {
                      System.out.println(Hanyu.dialogue.get(2));
                  }
              }
          } else if (playerTalkTo.equalsIgnoreCase(Savannah.name)&& player.playerLocation.equals(Savannah.location)) {
              System.out.println(Savannah.dialogue.get(0));
          } else if (playerTalkTo.equalsIgnoreCase(Anjia.name)&& player.playerLocation.equals(Anjia.location)) {
              if (player.getInventory().contains(items.get(3))) {
                System.out.println(Anjia.dialogue.get(1));
              } else {
                System.out.println(Anjia.dialogue.get(0));
              }
            } 
        } else {
            System.out.println("I don't understand that command.");
        }
          if (input.equalsIgnoreCase("The murderer is Anjia") && player.getInventory().containsAll(items)) {
          System.out.println("Anjia was taken to the police station for questioning. Faced with your reasoning and sufficient evidence, she confessed to the crime. Congratulations, case solved!");
        } 
    }

    scanner.close();

  } 
  public static void main(String[] args) {
    Gameloop murderMystery = new Gameloop();
    murderMystery.run();
  }
  
}


  

    
 




