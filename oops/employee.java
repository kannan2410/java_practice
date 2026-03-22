package oops;

public class employee {
    public int salary ;
    public int hourly ;
    public int salaryCalculate(int extrasalary){
        return salary + (hourly * extrasalary);
    }

    public void setSalary(int salary){
        if(salary<=0) throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }
}
