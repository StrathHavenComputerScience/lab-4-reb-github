public class Lab4
{
  public static void turnRight()
  {
    Robot.turnLeft();
    Robot.turnLeft();
    Robot.turnLeft();
  }
  
  public static void turnAround()
  {
    Robot.turnLeft();
    Robot.turnLeft();
  }

  public static void backUp()
  {
    turnAround();
    Robot.move();
    turnAround();
  }
  
  public static void completeBars()
  {
    //insert instructions below
    while (Robot.frontIsClear())
    {
      oneBar();
      Robot.move();
    }
    oneBar();
  }
  
  public static void oneBar()
  {
    Robot.turnLeft();
    while (!Robot.onDark())
    {
     Robot.makeDark();
     Robot.move();
    }
    turnAround();
    while (Robot.frontIsClear())
    {
     Robot.move();   
    }
    Robot.turnLeft();
    }
    
  public static void testCompleteBars1()
  {
    Robot.load("bars1.txt");
    Robot.setDelay(0.025);
    completeBars();
  }
  
  public static void testCompleteBars2()
  {
    Robot.load("bars2.txt");
    Robot.setDelay(0.025);
    completeBars();
  }
  
  public static void combinePiles()
  {
    //insert instructions below
    while (Robot.frontIsClear())
    {
     oneBlock();   
    }
    oneBlock();
    
  }

  public static void oneBlock()
  {
    if (Robot.onDark())
    {
     Robot.makeLight();
     turnRight();
     Robot.move();
     Robot.turnLeft();
     while (Robot.onDark())
     {
       Robot.move();  
        }
     Robot.makeDark();
     while (Robot.frontIsClear())
     {
       Robot.move();
        }
     Robot.turnLeft();
     Robot.move();
     Robot.turnLeft();
    }
    while (Robot.frontIsClear())
     {
       Robot.move();
      }
    turnAround();
    while (!Robot.onDark()&&Robot.frontIsClear())
    {
      Robot.move();  
    }
    }
  public static void testCombinePiles1()
  {
    Robot.load("piles1.txt");
    Robot.setDelay(0.025);
    combinePiles();
  }
  
  public static void testCombinePiles2()
  {
    Robot.load("piles2.txt");
    Robot.setDelay(0.025);
    combinePiles();
  }
  
  public static void connectDots()
  {
    //insert instructions below
    while (Robot.onDark())
    {
     doADot();
    }
  }
  
  
  public static void doADot()
  {
     if (goLeft())
     {
       Robot.turnLeft();
       Robot.move();
       Robot.makeDark();
       Robot.move();
        }
     else if (goRight())
     {
       turnRight(); 
       Robot.move();
       Robot.makeDark();
       Robot.move();
        }
     else if (goStraight())
     {
       Robot.move();
       Robot.makeDark();
       Robot.move();  
        }
     else
     {
       Robot.move();  
        }
    }
  
  
    public static boolean goLeft()
  {
    Robot.turnLeft();
    Robot.move();
    Robot.move();
    if (Robot.onDark())
    {
      turnAround();
      Robot.move();
      Robot.move();
      Robot.turnLeft();
      return true;  
    }
    turnAround();
    Robot.move();
    Robot.move();
    Robot.turnLeft();
    return false;
  }
    
  public static boolean goRight()
  {
    turnRight();
    Robot.move();
    Robot.move();
    if (Robot.onDark())
    {
      turnAround();
      Robot.move();
      Robot.move();
      turnRight();
      return true;  
    }
    turnAround();
    Robot.move();
    Robot.move();
    turnRight();
    return false;
  }
  
  public static boolean goStraight()
  {
    Robot.move();
    Robot.move();
    if (Robot.onDark())
    {
      turnAround();
      Robot.move();
      Robot.move();
      turnAround();
      return true;  
    }
    turnAround();
    Robot.move();
    Robot.move();
    turnAround();
    return false;
  }
  public static void testConnectDots1()
  {
    Robot.load("connect1.txt");
    Robot.setDelay(0.025);
    connectDots();
  }
  
  public static void testConnectDots2()
  {
    Robot.load("connect2.txt");
    Robot.setDelay(0.025);
    connectDots();
  }
}
