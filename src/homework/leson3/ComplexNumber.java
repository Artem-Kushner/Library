package homework.leson3;

import java.util.Objects;

public class ComplexNumber {
    private double firstNumber;
    private double secondNumber;

    public ComplexNumber(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

    }

    @Override
    public int hashCode() {

        return Objects.hash(firstNumber, secondNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        ComplexNumber c = (ComplexNumber) o;
        return this.firstNumber == c.firstNumber && this.secondNumber == c.secondNumber;
    }

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(1.3, 2.6);
        ComplexNumber complexNumber1 = new ComplexNumber(1.3, 2.6);
        ComplexNumber complexNumber2 = new ComplexNumber(5.6, 8.4);
        System.out.println(complexNumber.hashCode());
        System.out.println(complexNumber1.hashCode());
        System.out.println(complexNumber2.hashCode());
        boolean result = complexNumber.equals(complexNumber1);
        System.out.println(result);
        result = complexNumber.equals(complexNumber2);
        System.out.println(result);

    }
}
