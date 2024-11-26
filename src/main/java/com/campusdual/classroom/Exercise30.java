package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor){
        if (divisor == 0) {
            throw new DivisionByZeroException("divisor no puede ser cero.");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            int result = divisionWithCustomException(10, 2);
            System.out.println(result);
            int resultWithException = divisionWithCustomException(10, 0);
            System.out.println(resultWithException);
        } catch (DivisionByZeroException e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}
class DivisionByZeroException extends RuntimeException {
    public DivisionByZeroException(String message) {
        super(message);
    }
}



