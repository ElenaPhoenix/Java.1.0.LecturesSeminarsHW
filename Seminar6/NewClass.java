package Seminar6;
import java.util.ArrayList;

public class NewClass {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        MySet MySet = new MySet(2, "e");
        System.out.println(MySet.b);
        MySet.getInfo();
        System.out.println(MySet.b);
    }
}

class MySet{ // написание собственного класса
    int a; // поля класса
    String b;

    public MySet(int a, String b) {// конструктор
        this.a=a;
        this.b=b;
    }


public void getInfo() {
    System.out.println("Info");
}
}