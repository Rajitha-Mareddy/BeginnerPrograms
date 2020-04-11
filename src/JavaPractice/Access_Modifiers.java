// Access modifiers defines the access level of field/class/constructor/package
// 4 types of access modifiers *public *protected *default *private
// private can access only within the class and main class can't be defined as private
// default can access only within the package
// protected can access with in class and package and out side through inheritance (extends keyword), Main class can't be declared as protected
// public can can any where inside/outside package
// Note : Access modifiers can't be specified for a Local variable
// below is the order from least restriction to higher restriction
/*Public->protected -> default ->private*/

 package JavaPractice;

 class Access_Modifiers {

		 int sum() {
		int a = 2; // local variable, so u can't define access modifiers
		
		int c = a + b;
		return c;

	}
		
	 protected static class multiply
	{
		 int multi (){
	
		
		int d = 10;
		int f =11;
		 int g = d*f;
		return g;
		
	}
	}
	private  int b = 5; // instant variable so we can assign access modifiers
	 
	public static void main(String[] args) 
	
	{
		
		Access_Modifiers ac = new Access_Modifiers();
		ac.sum();
		System.out.println(ac.sum());
		
		multiply m = new multiply();
		m.multi();
		System.out.println(m.multi());
		
		

	}

	

}
