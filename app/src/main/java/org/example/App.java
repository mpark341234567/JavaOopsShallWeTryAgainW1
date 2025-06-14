package org.example;
import java.util.Scanner;

public class App {
  public int getInput() {
    boolean done = false;
    int returnValue = -1;
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a value. 'default' will set the value to 100. 'exit' to exit the program.");
    while (!done) {
      String userInput = input.nextLine();
      if (userInput.equalsIgnoreCase("exit")){ done = true; }
      else if (userInput.equalsIgnoreCase("default")) {
        returnValue = 100;
        done = true;
      } 
      else{
        try {
          returnValue = Integer.parseInt(userInput);
          if (returnValue < 0){
            throw new ArithmeticException();
          }
          done = true;
        } catch (NumberFormatException | ArithmeticException e) {
          System.out.println("Invalid input. Please enter a valid integer, 'default', or 'exit'.");
        }
      }
    }
    input.close();
    return returnValue;
    // Implement your function here
  }

  public static void main(String[] args) {
    // Test your function here in a driver program
    App app = new App();
    int a = app.getInput();
    if (a != -1) {
      System.out.println("The value chosen by the user is " + a);
    } 
  }
}
