
package pkg3d.surface;

interface Function {
    double evaluate(double x, double y);
}

class FunctionAtan1 implements Function {
    @Override
    public double evaluate(double x, double y) {
        return 100 * Math.atan(x * x + y * y);
    }
}


class FunctionPyramid implements Function {
    @Override
    public double evaluate(double x, double y) {
        return 1 - Math.max(Math.abs(x), Math.abs(y));
    }
}

class FunctionSqrt implements Function {
    @Override
    public double evaluate(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }
}
