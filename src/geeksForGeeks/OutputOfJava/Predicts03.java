package src.geeksForGeeks.OutputOfJava;

public class Predicts03 {
    public static void main(String[] args) {
        Test4 t4 = new Test4();
        System.out.println(t4.x);
        // print4 is a static method and can be called directly by calss name,
        //no need to create an object for it. This is not recommended.
        //https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html
        t4.printT4();
        Test4.printT4();
        System.out.println("**********************");
        Test5 t5 = new Test5();
        System.out.println("x = " + t5.x + ", y = " + t5.y);


        System.out.println("**********************");
        // the value assigned inside the constructor overwrites the previous value of x
        // which is 2, and x becomes 12.
        Test6 t6  = new Test6(12);
        System.out.println("x = " + t6.x);

        System.out.println("**********************");
        //First t8 object is instantiated in the main method. As the order of initialization
        // of local variables comes first then the constructor, first the instance variable
        // (t7), in the class Test2 is allocated to the memory. In this line a new Test1 object
        // is created, the constructor is called in class Test1 and ‘Constructor called 10’
        // is printed. Next, the constructor of Test8 is called and again a new object of the
        // class Test1 is created and ‘Constructor called 5’ is printed.
        // Creating instance of class Test8 inside main()
        Test8 t8 = new Test8(5);
        Test7.printaktuell();



    }
}
class Test4 {
    // Declaring and initializing integer variable
    int x = 10;
    static void printT4(){
        System.out.println("This is a static-method und in Test4.");
    }
}

class Test5 {
    int y = 2;
    int x = y+2;

}

class Test6 {

    // Declaring and initializing integer with custom value
    int x = 2;

    // Consructur of this class
    // Parameterized constructor
    Test6 (int i){
        x = i;
    }
}

class Test7 {

    /*
    `lastX` değişkeninin `static` olarak tanımlanması, bu değişkenin sınıf seviyesinde bir
    alan olmasını sağlar, yani `Test7` sınıfının tüm örnekleri arasında ortak bir değer tutar.
    `static` bir alanın değeri, sınıfın herhangi bir örneğine bağlı olmaksızın, sınıfın kendisi
     ile ilişkilendirilir. Bu nedenle, `Test7` sınıfının herhangi bir örneği tarafından
     değiştirildiğinde, değişiklik tüm sınıf için geçerli olur ve bu değere erişim de sınıf adı
      üzerinden sağlanabilir.

Bu özel durumda, `lastX`'i `static` olarak tanımlamak şu amaçları taşır:

1. **Son Atanan Değerin Takibi:** `Test7` sınıfının herhangi bir örneği oluşturulduğunda `x`
parametresi ile alınan değeri, sınıfın tüm örnekleri arasında "son değer" olarak saklamak.
Bu sayede, son oluşturulan `Test7` nesnesinin `x` değeri, `static` metod aracılığıyla sınıf
seviyesinde kolayca erişilebilir ve yazdırılabilir hale gelir.

2. **Sınıf Seviyesinde Erişim:** `lastX` değerine sınıfın örnekleri olmadan, doğrudan sınıf
adı (`Test7`) üzerinden erişilebilir. Bu, `lastX` değerinin son durumunu yazdırmak için
kullanılan `static void printLastX()` metodunun da `static` olmasını gerektirir. `static` bir
 metod, yalnızca `static` alanlara doğrudan erişebilir.

`static` değişkenler, aynı zamanda, bir sınıfın farklı örnekleri arasında paylaşılan verileri
 saklamak veya sınıfın durumundan bağımsız, genel amaçlı yardımcı metodlar ve sabitler
 tanımlamak için kullanılır. Bu durumda, `lastX` değişkeni `Test7` sınıfının herhangi
 bir örneği oluşturulduğunda alınan son `x` değerini saklamak için kullanılıyor, böylece
  bu değer sınıfın herhangi bir örneğinden bağımsız olarak erişilebilir ve yönetilebilir
   hale geliyor.
     */

    static int lastX = 0;

    // Constructor of this class
    Test7 (int x) {
        lastX = x;
        //Print statement whenever this constructor is called
        System.out.println("Constructor is called : " + x);
    }
    static void printaktuell(){
        System.out.println("last modified : " + lastX);
    }
}

//class Test8
//Class contains an instance of Test7
class Test8 {

    // Creating instance object of class Test7 in this class Test8
    Test7 t7 = new Test7(10);

    //Constructor of this class
    Test8 (int i) {
        t7 = new Test7(i);
    }


}