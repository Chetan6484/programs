class studentid{
    void show(String name,int marks){
        System.out.println("name:"+name +" and  marks:"+marks);
    }
    void show(int marks,String name){
        System.out.println("marks:"+marks+" and name:"+name);
    }
}
public class parametord {
    public static void main(String []args){
        studentid s1=new studentid();
        s1.show(10,"xyz");
        s1.show("abc",20);
    }
}
