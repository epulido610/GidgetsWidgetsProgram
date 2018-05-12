/*
Ethan Pulido
CS/IS 130
Dice Program





*/


import java.util.Scanner;
import java.util.Random;

public class DiceRoller{
   
   public static void main(String[] args){
   
      Random randNumbers = new Random();
      
      int userChoice, numRolls, snakeEyes, sevens, elevens, timesRolled;
      
      userChoice = snakeEyes = sevens = elevens = 0;
      
      

      Scanner input = new Scanner(System.in);
      
      do{
         System.out.println(" Welcome to the Roll Dice Program ");
         System.out.println(" 1. To Start the program ");
         System.out.println(" 2. Quit the Program");
         userChoice = input.nextInt();
      
            switch(userChoice)
             {
               case 1:
         
                  System.out.println("How many times would you like to roll the dice");
                  numRolls = input.nextInt();
            
                  timesRolled = 0;
            
                     do{
                        int d1 = randNumbers.nextInt(8);
                        int d2 = randNumbers.nextInt(8);
                   
                        System.out.println(d1 + " " + d2);
                   
                   
                           if(d1 == 0 || d2 == 0)
                              {
                                 snakeEyes++;
                              }
                           else if(d1 == 7 || d2 == 7)
                              {
                                 sevens++;
                              }
                           else if(d1 + d2 == 11)
                              {
                                 elevens++;
                              }
               
                           timesRolled++;
              
                      }while(timesRolled <= numRolls);
            
               
               System.out.println("Number of Snake Eyes is " + snakeEyes);
               System.out.println("Number of 7's is " + sevens);
               System.out.println("Number of 11's is " + elevens + "\n");
               
            break;
            
         case 2:
         
            System.out.println("PEACEEEEE");
        
            System.exit(0);
        
            break;
         
         default:
         
            System.out.println("Int input ONLY!!!!!!!!!!!!!!!");
            
            break;
            
      
      
         }

      }while(userChoice != 2);
   
   
    }

}