package calculator.fixtures;

import calculator.Calculator;

public class CalculateDivision {

    private int numerator;
    private int demoninator;

    public void setNumerator(int n) {
        this.numerator = n;
    }

    public void setDenominator(int d) {
        this.demoninator = d;
    }

    public String quotient() {
        return Calculator.divide(numerator, demoninator);
    }
}
