package org.example.lesson4;

public class Triangle {

    public static void main(String[] args) {

    }

    public double square(double a, double b, double c) throws MyException {

        if (a <= 0 || b <= 0 || c <= 0) {
            throw new MyException("Ошибка! Вы ввели отрицательное число или ноль");
        }

        if (a + b < c || a + c < b || b + c < a) {
            throw new MyException ("Стороны не образуют треугольник");
        }


        double p1 = ((a + b + c)) / 2;
        double result = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));

        return result;

    }
}
