package calculator_package;

public class Calculator {

    public String add(int x, int y){
        return "Ответ: " + (x+y);
    }

    public String substract(int x, int y){
        return "Ответ: " + (x-y);
    }

    public String mult(int x, int y){
        return "Ответ: " + (x*y);
    }

    public String div(int x, int y) throws ArithmeticException{
        String result;
        try{
            result = "Ответ: " + ((float)x/(float)y);
        }
        catch (ArithmeticException e){
           throw new ArithmeticException("Учи математику, не дели на ноль");
       }
       return result;
    }
}
