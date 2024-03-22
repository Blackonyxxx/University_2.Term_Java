
package pkg3d.surface;

class FunctionAdder implements Function {
    private Function function1;
    private Function function2;

    public FunctionAdder(Function function1, Function function2) {
        this.function1 = function1;
        this.function2 = function2;
    }

    @Override
    public double evaluate(double x, double y) {
        double value1 = function1.evaluate(x, y);
        double value2 = function2.evaluate(x, y);
        return value1 + value2; // İki işleve ait değerleri topla
    }
}