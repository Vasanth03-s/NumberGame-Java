import java.util.Scanner;
import java.util.Random;

public class jgame1 {
    public static void main(String[] args)
    {
      try( Scanner s=new Scanner(System.in);)

       {
        Random r=new Random();
        int tnum,attempt,guess;
        
        int score=0;
        System.out.println("NUMBER GUESS GAME");

        do
        {
            tnum=r.nextInt(100+1);
            System.out.println("Guess number between 1 to 100");

            for(attempt=1;attempt<=3;attempt++)
            {
                System.out.println("ATTEMPT"  +attempt+  "Enter your guessed number:");
                guess=s.nextInt();
                if(guess==tnum)
                {
                    System.out.println("Hurray!You guessed the right number");
                    score++;
                    break;
                }
                else if(guess<tnum)
                {
                    System.out.println("OOPS! Wrong .Try higher number");
                }
                else{
                    System.out.println("OOPS! Wrong .Try lower number");
                }

                if(attempt==3)
                {
                    System.out.println("OOPS! You've reached maximum attempts.the correct number is "+tnum);
                }

            }
            System.out.println("Do you want to play again?");
           
        }
       
        
        while (s.next().equalsIgnoreCase("yes"));


        {
            System.out.println("GAME OVER! Your final score is " + score);
           
        
    
        

        }



    

        }
    }
    

}

