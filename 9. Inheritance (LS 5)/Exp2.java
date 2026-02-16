public class Exp2{
String title; String author; int year;
public Exp2(String author,String title){
this.title=title;
this.author=author;
}public Exp2(String author, String title, int year){
this.author=author;
this.title=title;
this.year=year;
}public void display(){
System.out.println("Book Title: "+title+"\nAuthor:"+author+"\nyear"+year+"\n-------");
}
public static void main(String[] args){
Exp2 b1= new Exp2("Atomic Habits","James Clear",2007);
Exp2 b2= new Exp2("Compound Effect","Darren Harry",2016);
System.out.println("-------");
b1.display();
b2.display();
}
}

