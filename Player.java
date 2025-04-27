import java.util.ArrayList;
import java.util.Map;

/*
 * keeps track of the player's name, location, and stuff they carry (inventory)
 * is a Coordinates object (inherits x, y, name, and description)
 */
 public class Player{

    private String playerName;  //player's name
    private ArrayList<Item>inventory; //items player has picked up
    private Coordinates location;


    /*
     * Constructor – player with a name and starting location
     */
        public Player (String playerName, double x, double y) {
            this.playerName = playerName;
            this.inventory = new ArrayList<>(); //empty bag at the begginning, No items
            this.location = new Coordinates(x,y);


        }
        
        public String getName(){
            return playerName;
        }


        //where the player is currently
        public Coordinates getLocation(){
            return location;

        }

        //what the player have (what objects)
        public void showInventory(){
            if(inventory.isEmpty()){
                System.out.println("You don't have anything yet");
            } else {
                System.out.println("You have: ");
                for(Item item : inventory){
                    System.out.println(" " + item.displayName()); //just show item names
                }
            }
        }

        // //Shows the map's description ( the map should have a getDescription method)
        // public void showMap(Map map){
        //     System.out.println(item.itemDescription());

        // }

        //picks up an item if it hasn't already been picked up
        public void pickUp(Item item){
            if (!item.hasItem()){
                inventory.add(item); //add it to the bag
                item.addItem();  // mark the item as picked up!
                System.out.println("You picked up: " + item.getName());
            } else {
                System.out.println("You've already picked this up.");

            }
        }  
        
        //remove an item from invwntory
        public void putdown(Item item){
            if (inventory.contains(item)){
                inventory.remove(item);
                System.out.println("You put down: " + item.getName());
            } else{
                System.out.println("You don't even have that item!");
            }
        } 
        public void inspect(String itemName){
            System.out.println(item.itemDescription());

            // inspect an item 
            if (lowerInput.contains("inspect")) {
                for (Item item : items) {
                    if (lowerInput.contains(item.getName().toLowerCase())) {
                        inspect(item);
                        return "Inspected " + item.getName();
                    }
                }
            }
    
        } 
        public void inspect(Building bulding){
            System.out.println(building.getDescription());
        }

        // Inspect a building
        if (lowerInput.contains("inspect")) {
            for (Building building : buildings) {
                if (lowerInput.contains(building.getName().toLowerCase())) {
                    inspect(building);
                    return "Inspected " + building.getName();
                }
            }
         
       }
        // public String interpret(String input, Building[] building, Item[] items){
        //     if (input == null || input.trim().isEmpty()) {
        //         return "You need to enter a command.";
        //     }
        
        
        
        // 
        
       if (lowerInput.contains("talk")) {
        return "Talking to someone...";
        }

        //talk to the person if they are in  the same plave
        public void talkTo(NPC npc){
            if (npc.getLocation().equals(this.getLocation())){
                npc.talk(); //the NPC speaks
            } else{
                System.out.println(npc.getName()+ "isn't here right now");
            }
        }

        }



