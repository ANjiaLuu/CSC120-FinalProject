import java.util.Scanner;
public class Gameloop{
  Boolean shakila_accused_hanyu;
  
  public Gameloop{
    this.shakila_accused_hanyu=false;
    
  }
  public static void main(String[] args){
  ##Shakila
    String [] shakila_d={ “Look closely at the EpiPen - it was broken! Someone messed with it so it wouldn’t work properly.”
, “I was framed! I wrote the essay a few days ago and showed it to Hanyu to help me make edits. But Hanyu and Boba both lived in Talbot House. Maybe Hanyu was involved…”,“I forgot to say this earlier, but I lent Anjia my OneCard earlier, and she could access all sorts of buildings with it…”
};
 
    NPC Shakila=NPC("Shakila","Works in Seelye basement, and has access to every door on campus with Seelye OneCard. Victim copied Shakila’s homework and accusations of plagiarism nearly got her to the honor board. :( 
", Array.asList(shakila_d), Location Seelye_Basement);
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

        
  ##Hanyu 
    String [] hanyu_d={“I think it was Savannah! She was acting weird, asking me about peanut allergies when I don’t do food science, I do other things in Chemistry. If you want to look for Savannah I think she’s working a shift in Lamont dining hall. Also my lab is nearly over so I’m going to go back to my House.”
,“Didn’t we just talk earlier? I’d like to help you more but I don’t know what else to say.”
,“I didn’t help Boba cheat. Actually… I think Anjia hates Boba’s most because in every running race, Boba is the winner and Anjia is the runner up.”
};
    NPC Hanyu=NPC("Hanyu","lives in Talbot House, just like the victim! Maybe Hanyu wanted her room next year.
	
", Array.asList(hanyu_d), Location Chemistry_Lab);
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
  ##Savannah
     String [] savannah_d={ “Look at the newspaper! There’s a photo of me in Ceramics Club during the night of the murder. I have to be innocent!”};
     NPC Savanah=NPC("Savanah","Works in Lamont Dining Hall, just like the victim. Didn’t like how lazy they were in the dining hall. Had a chance to poison the student with peanuts!
",Array.asList(savannah_d),Location Lamont_Dining);
      if (player.talk_to(Savannah)){
        Savannah.talk();
      }

      


    

}

