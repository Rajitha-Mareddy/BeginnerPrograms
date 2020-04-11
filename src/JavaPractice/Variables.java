 package JavaPractice;

public class Variables {

	// using local variable

	/*
	 * local variable can be used only in method in which it is created final
	 * keyword can be used then the value of variable cannot be changed
	 * Initialization is mandatory
	 */

//	public void sum() {
//
//		int a = 2;
//		int b = 3;
//		int Sum = a + b;
//		System.out.println("Value of a is : " + a);
//		System.out.println("Value of b is : " + b);
//		System.out.println("Sum of 2 numbers is: " + Sum);
//
//	}
//
//	public static void main(String[] args) {
//
//		Variables V = new Variables();
//		V.sum();
//	}
//}

/*************************************************************************************/

// using an instant variable

/*
 * Instance variables should be created outside a method but in a class Final
 * keyword should not be used Instance variable/non static variable/member
 * variable can be accessed by creating a object and then calling the reference
 * variable Access modifiers can be used instance variable need not be
 * initialized instance variable value can be changed in every object
 */

/*
 * int abc; String b;
 * 
 * public static void main(String[] args) {
 * 
 * Variables V1 = new Variables(); Variables V2 = new Variables(); Variables V3
 * = new Variables();
 * 
 * V1.abc = 50; V1.b = "Rajitha";
 * 
 * V2.abc = 51; V2.b = "Rajitha1";
 * 
 * V3.abc = 52; V3.b = "Rajitha2";
 * 
 * System.out.println(V1.abc); System.out.println(V1.b);
 * 
 * System.out.println(V2.abc); System.out.println(V2.b);
 * 
 * System.out.println(V3.abc); System.out.println(V3.b);
 * 
 * }
 * 
 * }
 */

// using an class/static variable

/*
 * Instance variables should be created outside a method but in a class Final
 * keyword should not be used class/static variable can be accessed by creating
 * a object and then calling the reference variable Access modifiers can be used
 * class/static variable variable need not be initialized class/static variable
 * variable value can not be changed in every object - the value remains unique
 */


  public static int a = 10;
  
  static String b = "John";
  
  public static void main(String[] args) {
  
  Variables V1 = new Variables();
  V1.a = 15; 
  V1.b = "John";
  
  Variables V2 = new Variables();
  V2.a = 100;
  V2.b = "John1";
  
  System.out.println(V1.a);
  System.out.println(V1.b);
  
  System.out.println(V2.a);
  System.out.println(V2.b);
  
  }
  
  }
 