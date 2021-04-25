package task1;

// Represents an operation upon 4 double-valued operands and producing a double-valued result
@FunctionalInterface
public interface FourDoubleInterface {
    double applyAsDouble(double a, double b, double c, double d);
}