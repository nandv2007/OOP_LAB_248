package Acess_Modifiers;
public class Exp4{
    public static void main(String[] args) {
        student s=new student();
        s.print();
    }
}
class csec{
    protected String name="Nandhini";
    
}
class student extends csec{
    public void print(){
        System.out.println("Name: "+name);
    }
}