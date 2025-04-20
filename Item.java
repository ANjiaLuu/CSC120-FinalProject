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

  public 
  public Item(String n, double x, double y, String d, boolean i){
    this.name = n;
    this.x = x;
    this.y = y;
    this.itemDescription = d;
    this.hasBeenPickedUp = false;
    this.isInsideAnotherItem = i;
  }

  public showDescription(String[] args){
    Scanner scansForItem = new Scanner(System.in);
    String userInput = scansForItem.nextLine();
    switch(userInput contains "inspect") && (userInput contains ListOfItems){
      case NEWSPAPER:
        System.out.println(newspaper.itemDescription);
        break;
      case EPIPEN:
        System.out.println(epipen.itemDescription);
        break;
      case ESSAY:
        System.out.println(essay.itemDescription);
        break;
      case BACKPACK:
        System.out.println(backpack.itemDescription);
        break;
      case PHOTO:
        System.out.println(photo.itemDescription);
        break;
      case CAKE:
        System.out.println(cake.itemDescription);
        break;
    }
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
    enum ListOfItems {
      NEWSPAPER,
      EPIPEN,
      ESSAY,
      BACKPACK,
      PHOTO,
      CAKE
    }
  }
}
