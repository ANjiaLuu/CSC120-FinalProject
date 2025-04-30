import java.util.ArrayList;
import java.util.List;

/*
 * keeps track of the player's name, location, and stuff they carry (inventory)
 * is a Coordinates object (inherits x, y, name, and description)
 */
 public class Player{

    private List<Item> inventory; //items player has picked up
    public Coordinates playerLocation;


    /*
     * Constructor – player with a name and starting location
     */
        public Player() {
            playerLocation = new Coordinates(1, 1); // initially player is at Campus Center
            inventory = new ArrayList<>();
        }
        public List<Item> getInventory() {
            return inventory;
        }

        public Coordinates move(String direction) {
            if (direction.equalsIgnoreCase("east")) {
                playerLocation.x += 1;
            } else if (direction.equalsIgnoreCase("west")) {
                playerLocation.x -= 1;
            } else if (direction.equalsIgnoreCase("north")) {
                playerLocation.y += 1;
            } else if (direction.equalsIgnoreCase("south")) {
                playerLocation.y -= 1;
            } else {
                System.out.println("Direction unavailable");
            }
            return playerLocation;
        }
        

        //what the player have (what objects)
        public void showInventory(){
            if(inventory.isEmpty()){
                System.out.println("You don't have anything yet");
            } else {
                System.out.println("You have: ");
                for(Item item : inventory){
                    System.out.println(item.itemName); //just show item names
                }
            }
        }

        //picks up an item if it hasn't already been picked up
        public void pickUp(String playerPickedItem, List<Item> items){
            boolean beenFound = false;
            for (Item item : items) {
                if (playerPickedItem.equals(item.itemName) && !inventory.contains(item) && (item.hasBeenPickedUp == false)) {
                    inventory.add(item); //add it to the bag
                    item.hasBeenPickedUp = true;  // mark the item as picked up!
                    beenFound = true;
                    System.out.println("You picked up: " + item.itemName);
                    break;
                } }
            if (!beenFound) {
                    System.out.println("Action unsuccessful.");
                }
            }
        
        
        
        //remove an item from invwntory
        public void putDown(String playerPutDownItem){
            for (Item item : inventory) {
                if (playerPutDownItem.equalsIgnoreCase(item.itemName)){
                    inventory.remove(item);
                    item.hasBeenPickedUp = false;
                    System.out.println("You put down: " + item.itemName);
                } 
                System.out.println("You don't even have that item!");}
            }
        
        
        public void inspect(String playerInspect, List<Building> buildings) {
            //System.out.println(inventory);
        //Check items in inventory
        for (Item item : inventory) {
            if (item.itemName.equalsIgnoreCase(playerInspect)) {
                System.out.println(item.itemDescription);
            }
            System.out.println("Please pick up the item before inspecting it.");
        }

        // Check buildings
        for (Building building : buildings) {
            if (playerLocation.equals(building.location) && playerInspect.equalsIgnoreCase(building.name)) {
                System.out.println(building.description);
            }
        }

        }
        }


