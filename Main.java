/*
Mini Project 1
Group #5: Devin Fish, Evan Smith, Maria Staubach, Evan Woods
Date: 9/26/2021
*/

import java.util.*;//importing both scanner and random number

class Main {
  
  public static void main(String[] args) {
    //Making the object and variables we need
    Scanner s = new Scanner(System.in);
    Random r = new Random();
    int userNum;
    
    //User enters the number to use
    System.out.println("Welcome to the guessing game!\nPlease enter any positive whole number:");
    userNum = s.nextInt(); //first user input for number to guess

    //Make a random number between 0 and userinput - 1
    int randomNum;
    randomNum = r.nextInt(userNum);
    System.out.println("A random number to guess has been generated");

    //calling new method  
    playGame(randomNum, userNum);
  }

  static void playGame(int randomNum, int enteredNum) //new method 
    {
      //Calling new variables
      int numTries=0;
      Scanner s2 = new Scanner(System.in);

      //User Guess is collected
      System.out.println("Please guess a number between 0 and " + enteredNum);
      int userGuess = s2.nextInt();

      //Loop through telling them higher or lower until the guess matches the random number
      while(userGuess!=randomNum) {
        if (userGuess>randomNum) {
          System.out.println("Guess lower!");
          System.out.println("Enter your new guess:");
          userGuess = s2.nextInt(); //new user input
          numTries++;
        } else if (userGuess<randomNum) {
          System.out.println("Guess higher!");
          System.out.println("Enter your new guess:");
          userGuess = s2.nextInt(); //new user input
          numTries++;
        }
      }
      //Output the total number of tries after a successful guess.
      numTries++; //one more addition to numtries to account for the successful guess.
      System.out.println("Great, you win! It took you " + numTries + " tries.");
      }

      
    }
  
