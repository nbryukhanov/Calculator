package calculator_package;

public class Calculator {

    public String add(int x, int y){
        return "Ответ: " + (x+y);
    }

    public String substract(int x, int y) {
        return "Ответ: " + (x-y);
    }

    public String mult(int x, int y){
            return "Ответ: " + (x*y);
    }

    public void div(int x, int y){
        try{
            System.out.println("Ответ: " + (x/y));
        } catch (Exception e){
           System.out.println("Учи математику, не дели на ноль");
       }
    }
}
