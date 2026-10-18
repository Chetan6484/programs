class nstudent{
    static String name="xyz";
    static void show(){
        System.out.println(name);
    }
    static void display(nstudent s){
        System.out.println(s.name);
    }
}
public class instance {
    public static void main(String[] args) {
        nstudent s1=new nstudent();
        nstudent.display(s1);
    }    
} 
