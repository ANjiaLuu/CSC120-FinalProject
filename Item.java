import java.util.Scanner;
import java.util.Collection;
public class Item extends Coordinates {
  String name;
  x: double;
  y: double;
  boolean hasBeenPickedUp;
  boolean isInsideAnotherItem;
  ArrayList<Item> listOfItems = new ArrayList<Item>();
/**
  public enum ListOfItems {
      NEWSPAPER("Newspaper"),
      EPIPEN("Epipen"),
      ESSAY("Essay"),
      BACKPACK("Backpack"),
      PHOTO("Photo"),
      CAKE("Cake");

      private String displayName;

      ListOfItems(String displayName) {
        this.displayName = displayName;
      }
      public String displayName() {
        return displayName; 
      }
  */
    
  public Item(String n, double x, double y, String d, boolean i){
    this.name = n;
    this.x = x;
    this.y = y;
    this.itemDescription = d;
    this.hasBeenPickedUp = false;
    this.isInsideAnotherItem = i;
  }
  public static void main {
    Item newspaper = new Item("Newspaper", 1, 1, "Today's issue of the Sophian. Its main headline states 'Beloved Student Boba T. Slain Last Night in Talbot House!' Underneath it, there's another story about the Ceramics Club enjoying their pottery-making. Savannah is mentioned in this story.", false);
    Item epipen = new Item("EpiPen", 0, 2, "A medication used to treat allergic reactions. It seems like Boba used this sometime ago.", false);
    Item essay = new Item("Shakila's Essay", 2, 2, "A five-page essay. The very top of it says 'Shakila, this is the same paper that Boba give me! See me after class.'", false);
    Item backpack = new Item("Boba's Backpack", 1, 2, "There's a photo inside the front pocket of the backpack! You should be able to pick up this photo. Apart from that, the backpack appears to be empty.", false);
    Item photo = new Item("Photo", 1, 2, "A nice Polaroid picture of Boba, Shakila, Anjia, Savannah, and Hanyu. But it seems like Anjia's face has been written over with black marker.", true);
    Item cake = new Item("Cake", 0, 1, "A slice of vanilla cake on a paper plate. It doesn't seem like there are allergens in here, but you'd have to check...", false);

    
    }
  }
}
