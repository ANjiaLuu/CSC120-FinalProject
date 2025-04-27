// import java.util.Scanner;
// import javax.xml.transform.Templates;


// public class Command{
//   private Player player;
//   private Scanner scanner = new Scanner (System.in);
//   public Command(Player player, Map map){
//     this.player=player;
//     this.map=map;
//   }

//   public String interpret(String input){
//       if (input==null){
//         return "You need to enter a command.";
//     }
//       input=input.trim().toLowerCase();
//       if (input.startsWith("inspect") ){
//         String target =input.replace("inspect","").trim();
//       }
//         for (Item item: player.showInventory()){
//           if (item.name.toLowerCase().equal(target)){
//             return item.temDescription();
//           }
//         }
//         for (Building building: player.showInventory()){
//           if (item.name.toLowerCase().equal(target)){
//             return item.getItemDescription();
//           }
//         }
//       switch(userInput contains "inspect") && (userInput contains ListOfItems){
//         case NEWSPAPER:
//           System.out.println(newspaper.itemDescription);
//           break;
//         case EPIPEN:
//           System.out.println(epipen.itemDescription);
//           break;
//         case ESSAY:
//           System.out.println(essay.itemDescription);
//           break;
//         case BACKPACK:
//           System.out.println(backpack.itemDescription);
//           break;
//         case PHOTO:
//           System.out.println(photo.itemDescription);
//           break;
//         case CAKE:
//           System.out.println(cake.itemDescription);
//           break;
//   }
//   // Change this switch statement so the Player can only inspect the building they are currently in. 
//   // That means check the current coordinates of the player, and if they match the coordinates of the building then allow the description to be printed out.
//     switch(input contains "inspect") && (input contains ListOfBuildings){
//       case QUAD:
//         System.out.println(quad.description);
//         break;
//       case TALBOT_HOUSE:
//         System.out.println(talbotHouse.description);
//         break;
//       case LAMONT_DINING:
//         System.out.println(lamontDining.description);
//         break;
//       case SEELYE_BASEMENT:
//         System.out.println(seelyeBasement.description);
//         break;
//       case CAMPUS_CENTER:
//         System.out.println(campusCenter.description);
//         break;
//       case COLLEGE_HALL:
//         System.out.println(collegeHall.description);
//         break;
//       case OUTDOOR_TRACK:
//         System.out.println(outdoorTrack.description);
//         break;
//       case CHEMISTRY_LAB:
//         System.out.println(chemistryLab.description);
//         break;
//       case CERAMICS_BUILDING:
//         System.out.println(ceramicsBuilding.description);
//         break;
//   }
//  }
// }
/*
 * accuse <NPC> still needs to be added to the code, as well as what this command does.
 * go north/south/east/west still needs to be added to the code.
 * talk to <NPC>, pick up <Item> and put down <Item> are all in Player.java. This means that Command.java should extend Player.java
 */



