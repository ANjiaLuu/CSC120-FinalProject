import java.util.Scanner;
import java.util.Collection;
public class Item extends Coordinates {
  String name;
  x: double;
  y: double;
  String itemDescription;
  boolean hasBeenPickedUp;
  boolean isInsideAnotherItem;
  Collection<String> collectionOfItems = new ArrayList<String>();

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
    
  public Item(String n, double x, double y, String d, boolean i){
    this.name = n;
    this.x = x;
    this.y = y;
    this.itemDescription = d;
    this.hasBeenPickedUp = false;
    this.isInsideAnotherItem = i;
  }
/**
   * Item descriptions have not been written yet.
   **/
  public static void main {
    Item newspaper = new Item("Newspaper", 1, 1, "", false);
    Item epipen = new Item("EpiPen", 0, 2, "", false);
    Item essay = new Item("Shakila's Essay", 2, 2, "", false);
    Item backpack = new Item("Boba's Backpack", 1, 2, "", false);
    Item photo = new Item("Photo", 1, 2, "", true);
    Item cake = new Item("Cake", 0, 1, "", false);

    }
  }
}
