import java.util.Scanner;
public class Gameloop{
  Boolean shakila_accused_hanyu;
  
  public Gameloop{
    shakila_accused_hanyu=false; 
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
}

