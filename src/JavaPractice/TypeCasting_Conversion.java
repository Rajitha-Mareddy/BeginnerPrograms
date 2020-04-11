/* type casting or type conversion */

		/*
		 * Widening casting/implicit casting - small size data type to large size data
		 * type - automatically will be done
		 * Syntax : toDatatype variableof_Todatatype = variableof_Fromdatatype
		 */

// small to big data type = byte>short>int>long>float>double
//big to small  =double>float>long>int>short>byte
	

		/*
		 * Narrowing casting/Explicit casting - big size data type to small size data
		 * type - manually we have to do it
		 * 
		* Syntax : toDatatype variableof_Todatatype =(todatatype) variableof_Fromdatatype
		 */

package JavaPractice;

public class TypeCasting_Conversion {

	public static void main(String[] args) {
		int i = 32;
		int j = 12;
		int divide = i / j;
		System.out.println("when value is int: " + divide);
		float f = divide; // widening casting small to big size data type //
		System.out.println("after changing to int to float(Widening casting) - value is: " + f);
		int g = (int) f; // narrow casting big to small size data type//
		System.out.println("after changing to float to int(narrow casting) - value is: " + g);

	}

}
