package src.geeksForGeeks.OutputOfJava;

/**
 * [Geeks](https://www.geeksforgeeks.org/output-of-java-program-set-2/);
 */


public class Predicts02 {

    public static void doPrint(Base base){
        base.Print();
    }

    public static void main(String[] args) {

        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();
        Derived q = (Derived) y;
        // derive referansi Base ile referans sahibi bir objeye tanimlanamaz
        // Derived q1 = (Derived) x;

        doPrint(x);
        doPrint(y);
        doPrint(z);
        doPrint(q);
        //doPrint(q1);


        System.out.println("x.Print : ");
        x.Print();
        System.out.println("z.Print1 : ");
        z.Print1();
        System.out.println("((Derived) y).Print1() : ");
        ((Derived) y).Print1();

        }


    }


class Base {
    public void Print() {
        System.out.println("Base");
    }
}

class Derived extends Base {

    public void Print() {
        System.out.println("Derived");
    }

    public void Print1(){
        System.out.println("is Derived");
    }
}

class Point {

    protected int x, y;

    public Point(int _x, int _y){

        x = _x;
        y = _y;
    }
}