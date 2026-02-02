abstract class student {
    abstract void rollno();
}

class nandhini extends student {
    void rollno() {
        System.out.println("CH.SC.U4CSE25248");
    }
}

public class Exp3 {
    public static void main(String[] args) {
        nandhini n = new nandhini();
        n.rollno();
    }
}
