package oops;

public class proceduralprogram{

    public static void main(String[] args){
        
        var Employee = new employee();
        Employee.salary = 100000;
        Employee.hourly = 30;
        int result = Employee.salaryCalculate(20);
        System.out.println(result);
    }

}