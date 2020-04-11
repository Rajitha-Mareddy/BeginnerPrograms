package JavaPractice;

public class Datatypes {

	public static void main(String[] args) {

		byte b = (byte) 128;
		Short s = 250;
		int a = 100;
		long l = 123;
		float f = 100.3424354354546f;
		double d = 120.454657657687768655454534234324234d;
		char c = 'c';

		System.out.println("value of b is : " + b );
		System.out.println("value of s is : " + s);
		System.out.println("value of a is : " + a);
		System.out.println("value of l is : " + l);
		System.out.println("value of f is : " + f);
		System.out.println("value of d is : " + d);
		System.out.println("value of c is : " + c);

		/*
		 * int a = Character.MAX_VALUE; System.out.println(a);
		 */

		/* type casting or type conversion */

		/*
		 * Widening casting/implicit casting - small size data type to large size data
		 * type - automatically will be done
		 */

		double mydouble = a; // in this 'a' is from data type and 'my double' is to data type //
		
		System.out.println("value of mydouble before  is : " + mydouble);
		
		System.out.println(a);

		/*
		 * Narrowing casting/Explicit casting - big size data type to small size data
		 * type - manually we have to do it
		 * 
		 * syntax : to data type = (provide "to data type" to which its being changed)
		 * from data type
		 */

		a = (int) l; // in this 'l' is from data type and 'a' is to data type // we have to pass to data type in ()//

	}

}
