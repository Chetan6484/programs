class student{
    String name;
    static String college ="flora college";
    student(String name){
    this.name=name;
    }
    void show(){
        System.out.println("name is:"+name);
        System.out.println("college is:"+college);
    }
}
public class static1{
    public static void main(String []args){
        student s1=new student("xyz");
        student s2=new student("abc");
        s1.show();
        s2.show();
        student.college="pqr";
        System.out.println(student.college);
        s2.show();
    }
}
