/*
 * CPS 150
 * Algorithms & Programming I
 * 
 * Lab Project: Arithmetic Expressions in Java
 * 
 * Name: Bharat Khadka
 */

public class ArithmeticExpressions
{
  public static void main(String[] args)
  {
    // start adding code after this line
	  
    int a = 3;
    // Initiliaze variable a to int value 3
    int b = 4;
	// Initiliaze variable b to int value 4
    int c = 5;
	// Initiliaze variable c to int value 5
    int d = 17;
	// Initiliaze variable d to int value 17
    System.out.print("(a + b)/ c : ");
	// Prints the phrase (a + b)/ c : without a new line
    System.out.println((a + b)/ c);
	// Prints the value of (a + b) / c as an int which is (3 + 4) / 5 which equals 1
    // 3 and 4 are added with sum 7
    // 7 is divided by 5 with quotient 1
    System.out.print("a + b / c : ");
	// Prints the phrase (a + b)/ c : without a new line
    System.out.println(a + b / c);
	// Prints out the value of (b / c) + a  as an int which is (4 / 5) + 3 which equals 3
    // 4 is divided by 5 with quotient 0
    // 3 is added to 0 with sum 3
    System.out.print("a++ : ");
    System.out.println(a++);
	// Variable a which equals 3 is printed out following a++ : and then incremented by 1 making it's value equal to 4
	// a++ : 3
    System.out.print("a-- : ");
    System.out.println(a--);
	// Variable a which equals 4 is printed out following a-- : and then decremented by 1 making it's value equal to 4
	// a-- : 4
    System.out.print("a + 1 : ");
    System.out.println(a + 1);
	// Prints out the value of a + 1 without changing the value of a, which equals 3
	// a + 1 : 4
    System.out.print("d % c : ");
    System.out.println(d % c);
	// Prints out the remainder of d, which equals 17, divided by c, which equals 5
	// d % c : 2
    System.out.print("d / c : ");
    System.out.println(d / c);
	// Prints out the value of d, which equals 17, divided by  c, which equals 5, as an int
	// d / c : 3
    System.out.print("d % b : ");
    System.out.println(d % b);
	// Prints out the remainder of d, which equals 17, divided by b, which equals 4
	// d % b : 1
    System.out.print("d / b : ");
    System.out.println(d / b);
	// Prints out the value of d, which equals 17, divided by b, which equals 4, as an int
	// d / b : 4
    System.out.print("d + a / d + b : ");
    System.out.println(d + a / d + b);
	// Prints out the value of d + (a / d) + b as an int which is 17 + (3 / 17) + 4 which equals 21
	// d + a / d + b : 21
    System.out.print("(d + a) / (d + b) : ");
    System.out.println((d + a) / (d + b));
	// Prints out the value of (d + a) / (d + b) as an int which is (17 + 3) / (17 + 4) which equals 0
	// (d + a) / (d + b) : 0	
    System.out.print("Math.sqrt(b) : ");
    System.out.println(Math.sqrt(b));
	// Prints the square root of b as a double, which is 2.0
	// Math.sqrt(b) : 2.0
    System.out.print("Math.pow(a, b) : ");
    System.out.println(Math.pow(a, b));
	// Prints the value of a to the power of b as a double, which is 81.0
	// Math.pow(a, b) : 81.0
    System.out.print("Math.abs(-a) : ");
    System.out.println(Math.abs(-a));
	// Prints out the absolute value of -a which is 3
	// Math.abs(-a) : 3
    System.out.print("Math.max(a, b) : ");
    System.out.println(Math.max(a, b));
	// Prints the greater of the two numbers provided to the function Math.max() which is b which is 4
	// Math.max(a, b) : 4
    
    // stop adding code before this line
  } // end main method
} // end ArithmeticExpressions class