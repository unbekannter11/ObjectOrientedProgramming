package src.geeksForGeeks.OutputOfJava;

public class Predicts {
    public static void main(String[] args) {

    }
}

class Test{

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println("x = " + t.x + ", y =  " + t.y);

        //non-statoic method cannot be called in a static method without crating an object
        //System.out.println(fun());

        Test t1 = new Test();
        System.out.println(t1.fun());
        // or by creating an object
        int n1 = t1.fun();
        System.out.println(n1);

        // By defeining the method as static:
        System.out.println(funny());
    }
    protected int x, y;

    int fun(){
        return 20;
    }
    static int funny(){

        return 20;
    }
}

/**
 * java: incompatible types: int cannot be converted to boolean
 *There is an error in the condition check expression of for loop. Java differs
 * from C++(or C) here. C++ considers all non-zero values as true and 0 as false. Unlike C++,
 * an integer value expression cannot be placed where a boolean is expected in Java. Following is
 * the corrected program.
 *
 * class Test2{
 *     public static void main(String[] args) {
 *         for(int i = 0; 1; i++){
 *             System.out.println("Hello");
 *             break;
 *         }
 *     }
*/


class Test2{
    public static void main(String[] args) {
        for(int i = 0; true; i++){
            System.out.println("Hello");
            break;
        }
    }
}

class Test3{
    public static void main(String[] args) {

        Test3 t3 = new Test3();
        System.out.println(t3.funny());
        int n3 = t3.funny();
        System.out.println("n3  = " + n3);

    }

    //protected int x, y;

    //Unlike C++, static local variables are not allowed in Java.
    // We can have class static members to count number of function calls
    // and other purposes that C++ local static variables serve.
    // Following is the corrected program.
    //static int x = 0;

    private static int x;
    static int funny(){
        //static int x = 0;
        return ++x;
    }
}

