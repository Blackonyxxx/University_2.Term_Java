
package pkg3d.surface;


public class Surface {

     public static void main(String[] args) {
        final int count = 51;
        final double rangeMin = -80;
        final double rangeMax = 80;
        Function fn1 = new FunctionAtan1();
        Function fn2 = new FunctionSqrt();
        Function fn3 = new FunctionPyramid();       
        Function fn4 = new FunctionAdder(fn2, fn1);

        Function[] functions = {fn1, fn2, fn3,fn4};
        for (Function fn : functions) {
            Model3D model = ModelGenerator.create(fn, rangeMin, rangeMax, count);
            String fileName = fn.getClass().getName() + ".obj";
            model.saveToFile(fileName);
            System.out.println("3D model is saved to file as " + fileName);
        }
    }
}

