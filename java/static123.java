class astudent{
    String name;
    static String college ="flora college";
    astudent(String name){
    this.name=name;
    }
    void show(){
        System.out.println("name is:"+name);
        System.out.println("college is:"+college);
    }
}
public class static123{
    public static void main(String []args){
        astudent s1=new astudent("xyz");
        astudent s2=new astudent("abc");
        s1.show();
        s2.show();
        astudent.college="pqr";
        System.out.println(astudent.college);
        s2.show();
    }
}
