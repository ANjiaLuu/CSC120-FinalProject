import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
public class Gameloop{
    private Player player;
    private boolean ShakilaAccusedHanyu;
    private boolean StillPlaying;
    public Gameloop(){
      this.player= new Player(new Coordinates(0, 0));
      this.ShakilaAccusedHanyu=false; 
      this.StillPlaying=true;
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
