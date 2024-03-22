package src.geeksForGeeks.OutputOfJava;

public class Main {

    public static void main(String[] args) {

        Test t = new Test();
        System.out.println("x = " + t.x + ", y =  " + t.y);

    }
}

class Test{
    protected int x, y;
}
