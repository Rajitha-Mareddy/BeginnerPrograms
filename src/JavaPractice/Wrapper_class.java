// wrapper class is conversion of primitive data types to objects and objects to primitive types

//Auto boxing - conversion form primitive to objects 
//Unboxing - conversion form objects to primitives

//Below are the wrapper classes of primitives

// int - Interger ; boolean - Boolean; long - Long; short - Short; char - Character ;

// byte -Byte ; float - Float ;



package JavaPractice;

public class Wrapper_class {

	public static void main(String[] args) {
		byte b = 20;
		double d = 20.02;
		long l =30L;
		boolean b1 = true;
		short s = 10;
		char c = 'S';
		int i =23;
		float f = 12.233f;
		
		
		//Auto boxing //
		System.out.println("***** Values after Autoboxing*****");
		
		Byte bobj=b;
		Double dobj =d;
		Long lobj =l;
		Boolean b1obj=b1;
		Short sobj =s;
		Character cobj= c;
		Integer iobj =i;
		Float fobj =f;
		
		System.out.println(bobj);
		System.out.println(dobj);
		System.out.println(lobj);
		System.out.println(b1obj);
		System.out.println(sobj);
		System.out.println(cobj);
		System.out.println(iobj);
		System.out.println(fobj);
		
		// unboxing //
		
		System.out.println("***** Values unboxing Autoboxing*****");
		
		byte k = bobj;
		double p = dobj;
		long m = lobj;
		boolean n = b1obj;
		short s1 = sobj;
		char c1 = cobj;
		int i1 = iobj;
		float f1 = fobj;
		
		System.out.println(k);
		System.out.println(p);
		System.out.println(m);
		System.out.println(n);
		System.out.println(s1);
		System.out.println(c1);
		System.out.println(i1);
		System.out.println(f1);
		
		
		
		
		
		

	}

}
