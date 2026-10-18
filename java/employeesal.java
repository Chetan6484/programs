class calculate{
    double calculate(double salary){
        return salary*0.10;
    }
    double calculate(double salary,double percent){
        return salary*percent/100;
    }
    double calculate(double salary,double percent,double extraamount){
        return salary*percent/100+extraamount;
    }
}
public class employeesal {
    public static void main(String []args){
        calculate c1=new calculate();
        System.out.println(c1.calculate(30000));
        System.out.println(c1.calculate(30000,15));
        System.out.println(c1.calculate(30000,15,20000));
    }
}
