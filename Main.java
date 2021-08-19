import kareltherobot.*;


public class Main implements Directions{
  
  public static void main(String[] args) {
   
    World.setVisible(true);// allows us to see the run output
    // the bigger the street, the farther north
    World.setSize(20,20);// 20 streets by 20 avenues.

    World.setDelay(5);

    // The line below creates a Robot that we will refer to as rob  
    // Find out what the numbers and direction do!
    // Put rob in a better location for your initials.
    Robot rob = new Robot(15,2,South,99);


		
    // Want a second robot?  No prob.  They are cheap :)
    //Robot dude = new Robot(7,5,West,9);
    // examples of commands you can invoke on a Robot
    //writeInitials(rob);
    writeDiamond(rob);
     
    
  }

  private static void writeDiamond(Robot rob){
    		
    // Want a second robot?  No prob.  They are cheap :)
    //Robot dude = new Robot(7,5,West,9);
    // examples of commands you can invoke on a Robot
    //rob.move();// move one step in the direction it is facing


    for(int i = 0; i<5; i++){
        rob.putBeeper();
        rob.turnLeft();
        rob.move();
        turnRight(rob);
        rob.move();
        rob.putBeeper();
    }

      rob.turnLeft();
      rob.turnLeft();
      rob.move();
      turnRight(rob);
      rob.move();
      rob.putBeeper();

      for(int i = 0; i<5; i++){
          rob.putBeeper();
          rob.turnLeft();
          rob.move();
          turnRight(rob);
          rob.move();
      }

      rob.turnLeft();
      rob.turnLeft();
      rob.move();
      rob.move();
      rob.putBeeper();

      for(int i = 0; i<5; i++){

          rob.putBeeper();
          turnRight(rob);
          rob.move();
          rob.turnLeft();
     rob.move();

      }
      rob.turnLeft();
      rob.move();
      rob.move();
      rob.putBeeper();

      for(int i = 0; i<5; i++){

          rob.putBeeper();
          turnRight(rob);
          rob.move();
          rob.turnLeft();
          rob.move();

      }

  }

  private static void writeInitials(Robot rob){
        rob.move();// move one step in the direction it is facing
    
    
    // starting the letter R
    // rob.putBeeper();
    // rob.move();
		// rob.putBeeper();
    // rob.move();
    // rob.turnLeft();
    // rob.move();

    rob.putBeeper();
   rob.move();
   rob.putBeeper();
   rob.move();
   rob.putBeeper();
   rob.move();
   rob.putBeeper();
   rob.turnLeft();
   rob.turnLeft();
   rob.move();
   rob.move();
   rob.move();
   rob.turnLeft();
   rob.turnLeft();
   rob.turnLeft();
   rob.move();
   rob.turnLeft();
   rob.turnLeft();
   rob.turnLeft();
   rob.move();
   rob.putBeeper();
   rob.move();
    rob.turnLeft();
   rob.move();
   rob.putBeeper();
   rob.turnLeft();
   rob.move();
    rob.turnLeft();
   rob.turnLeft();
   rob.turnLeft();
   rob.move();
   rob.putBeeper();
   rob.turnLeft();
   rob.move();
    rob.turnLeft();
   rob.turnLeft();
   rob.turnLeft();
   rob.move();
   rob.putBeeper();
    rob.turnLeft();
   rob.turnLeft();
   rob.turnLeft();
   rob.move();
   rob.putBeeper();
   rob.move();
   rob.putBeeper();
   rob.move();
   rob.putBeeper();
   rob.turnLeft();
   rob.move();
   rob.move();
     rob.move();
   rob.move();
   rob.move();
   rob.turnLeft();
     rob.move();
   rob.move();
    rob.move();


  //Starting Letter S

  rob.turnLeft();
  
  rob.putBeeper();
  rob.move();
  rob.putBeeper();
  rob.move();
  rob.putBeeper();
  rob.move();
 
  
  rob.turnLeft();
  rob.move();
   rob.putBeeper();
   rob.move();
   rob.turnLeft();
   rob.move();
   rob.putBeeper();
   rob.move();
   rob.putBeeper();
   rob.move();
   rob.putBeeper();

   rob.turnLeft();
   rob.turnLeft();
   rob.turnLeft();
   rob.move();
   rob.turnLeft();
   rob.move();
   rob.putBeeper();
   rob.turnLeft();
   rob.turnLeft();
   rob.turnLeft();
   rob.move();

   rob.turnLeft();
   rob.turnLeft();
   rob.turnLeft();
   rob.move();
   rob.putBeeper();
    rob.move();
   rob.putBeeper();
    rob.move();
   rob.putBeeper();
   rob.move();



  }

    public static void turnRight(Robot rob){

   rob.turnLeft();
   rob.turnLeft();
   rob.turnLeft();

  }
}