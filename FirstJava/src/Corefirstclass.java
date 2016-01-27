
// declaree class as public and start with braces//
public class Corefirstclass {

	// main method signature static as thhe main instance will be single in
	// class//
	public static void main(String agrs[]) {
		/* way to ouput the result */
		System.out.println("hai three");

		/* datatypes: 8 primitive data types */

		/*
		 * float byte and int data types all data types start with small letter
		 */
		String namString = "Aanika";
		char nameChar = 'C';
		int varint = 2; // 32-bit signed two's complement integer, which has a
						// minimum value of 2 exponent 31 and a maximum value of
						// 231-1
		float carFl = 3.4f;// 32 bit big decimal
		double salary = 120000.50;// 64 bit
		byte varbyt = 20;
		long valong = 33;// 64 bit integer
		short varsht = 33;// 16 bit intefger
		/*
		 * Data Type
		 * 
		 * Default Value (for fields)
		 * 
		 * byte 0 short 0 int 0 long 0L float 0.0f double 0.0d char '\u0000'
		 * String (or any object) null boolean false
		 */
		/*
		 * The floating point types (float and double) can also be expressed
		 * using E or e (for scientific notation), F or f (32-bit float literal)
		 * and D or d (64-bit double literal; this is the default and by
		 * convention is omitted).
		 * 
		 * double d1 = 123.4; // same value as d1, but in scientific notation
		 * double d2 = 1.234e2; float f1 = 123.4f;
		 */
		
		//
		System.out.println(namString);
		System.out.println(nameChar);
		

		System.out.println(varint + carFl);
		System.out.println(varbyt + varint);
		int i=5;
		System.out.println("i++ is " + i++);
		System.out.println(++i);
		
		for (i=0;i<5;i++){
			System.out.println(i);
		}
			
		System.out.println("After pre operator");
		
		for (i=0;i<5;++i)
			System.out.println(i);
		
		System.out.println("After post operator");
		
		//System.out.println(y);

		//System.out.println(z);
		for(int i1 = 1; i < 3; i++)
			  for(int j = 3; j >= 1; j--)
			     assert i!=j : i; 
		
		int[] numbar={1,2,3,4,5};
		for (i=0;i<numbar.length;i++)
			System.out.println(i);
		
		
		
	}
}
