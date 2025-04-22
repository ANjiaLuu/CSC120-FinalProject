import java.util.Scanner;
public class Gameloop{
  boolean shakila_accused_hanyu;
  boolean still_playing;
  public Gameloop{
    shakila_accused_hanyu=false; 
    still_playing=true;
    
  }
  if (player.talk_to(Shakila)){
      if (player.has_Item(Epipen){
        Shakila.talk();
      }
      if (player.has_Item(Shakila's essay)){
        Shakila.talk();
        shakila_accused_hanyu=true;
      }
      if (player.has_Item(Epipen)&&player.has_Item(Cake)&& player.has_Item(Photo)){
        Shakila.talk();
      }
 
 if (player.talk_to(Hanyu)){
      if player.location=="Chemistry_Lab"{
        Hanyu.talk();
      }
      if !shakila_accused_hanyu{
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

