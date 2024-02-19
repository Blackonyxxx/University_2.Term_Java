
package ObjectsAndClasses_1;

public class Test {

	public static void main(String[] args) {
		
		Fractional[] fractionals = {
				new Fractional(),
				new Fractional(2),
				new Fractional(2, 1),
				new Fractional(4, 2),
				new Fractional(60, 30),
				new Fractional(-2, -1),
				new Fractional(-3),
				new Fractional(3, -1),
				new Fractional(-3, 1),
				new Fractional(-12, 4),
				new Fractional(12, -4),
				new Fractional(-4, 0),
				new Fractional(4, 0),
				new Fractional(0, 0)
		};
		
		for (Fractional f : fractionals) {
			System.out.println(f + " = " + f.get());
		}
		System.out.println();

		Fractional f = new Fractional(14, 8);
		System.out.println("f = " + f);
		System.out.println("f = " + f + " = " + f.get());
		System.out.println("-f = -(" + f + ") = " + f.negate());
		System.out.println("2f = 2 * (" + f + ") = " + f.scale(2));
		
	}

}
