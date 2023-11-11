import java.util.Scanner;

/*
 * CirclesLab.java
 */

/**
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: Overlapping circles
 *
 * name: Bharat Khadka
 */

public class CirclesLab
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      
      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;
      
      // Your work goes here:
      
      //Distance Formula
      double distance = Math.sqrt((xcenter2 - xcenter1) * (xcenter2 - xcenter1) + (ycenter2 - ycenter1) * (ycenter2 - ycenter1));

      if (distance > radius1 + radius2) {
          System.out.println("Disjoint");
      } else if (distance <= Math.abs(radius1 - radius2)) {
          if (radius1 > radius2) {
              System.out.println("Circle 2 is mutually contained in circle 1");
          } else if (radius1 < radius2) {
              System.out.println("Circle 1 is mutually contained in circle 2");
          } else {
              System.out.println("Disjoint");
          }
      } else {
          System.out.println("Overlapping");
      }
      
   } // end main method
} // end class CirclesLab
