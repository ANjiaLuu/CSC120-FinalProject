import java.util.Scanner;
Boolean Shkila_accused_Hanyu;
public class Gameloop{
  
  public static void main(String[] args){
    String [] shakila_d={ “Look closely at the EpiPen - it was broken! Someone messed with it so it wouldn’t work properly.”
, “I was framed! I wrote the essay a few days ago and showed it to Hanyu to help me make edits. But Hanyu and Boba both lived in Talbot House. Maybe Hanyu was involved…”};
 
    NPC Shakila=NPC("Shakila","Works in Seelye basement, and has access to every door on campus with Seelye OneCard. Victim copied Shakila’s homework and accusations of plagiarism nearly got her to the honor board. :( 
", Array.asList(shakila_d), Location Seelye_Basement);
  }
  ##if talk_to (shakila) && has_EpiPen{
    Shakila.talk()
  }elif talk_to(shakila)&& has_essay{
    Shakila.talk()
  } 
   if shakila finish talking, make shakila_accused_hanyu == True.

}

