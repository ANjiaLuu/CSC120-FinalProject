public class Item {
  String itemName;
  String itemDescription;
  boolean hasBeenPickedUp;
  Coordinates itemLocation;

  public Item(String itemName, Coordinates itemLocation, String itemDescription, boolean hasBeenPickedUp){
    this.itemName = itemName;
    this.itemLocation = itemLocation;
    this.itemDescription = itemDescription;
    this.hasBeenPickedUp = hasBeenPickedUp;
  } 
}
