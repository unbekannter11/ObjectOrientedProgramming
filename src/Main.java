public class Main {
    public static void main(String[] args) {
        int n = 5;           // Parametre değerini başlatıyoruz
        int b = 4;           // 'foo' metodunu çağırırken kullanılacak diğer bir parametre
        int a = calculateA(n);  // 'a' değişkenine bir değer atıyoruz

        System.out.println("a'nın değeri: " + a);

        foo(a, b, n);  // 'foo' metodunu a, b ve n parametreleri ile çağırıyoruz

        int result = divideByTwo(n);  // 'divideByTwo' metodunu çağırıyoruz ve sonucu 'result' değişkenine atıyoruz
        System.out.println("n'in yarısı: " + result);

       printStars(8);
        System.out.println(" ###############");
       printStarRows(8);
        System.out.println();
        System.out.println("#################");
       printYildiz(8);
       printYildiz2(8);
       printYildiz3(8);

       double nparabeldeneme = nparabel(2,4,6,8);
       System.out.println(nparabeldeneme);

       int maxDeneme = max3(30,56,55);
        System.out.println(maxDeneme);

        max2(12,23);

        //20922789888000
        int fac_deneme = fac(16);
        System.out.println(fac_deneme);

        int facWhileDeneme = facWhile(8);
        System.out.println("While döngüsü ile Fakültät " + facWhileDeneme);

        int mcCarthyDeneme = mcCarthy(100);
        System.out.println(mcCarthyDeneme);




    }

    // 'foo' metodu, üç parametre alır ve bu parametreleri kullanarak bir işlem gerçekleştirir
    public static void foo(int a, int b, int c) {
        System.out.println("Foo çağrıldı: a=" + a + ", b=" + b + ", c=" + c);
    }

    // 'calculateA' metodu, aldığı parametreyi kullanarak hesaplama yapar ve sonucu döndürür
    public static int calculateA(int n) {
        return 3 * n + 1;
    }

    // 'divideByTwo' metodu, aldığı sayının yarısını hesaplar ve döndürür
    public static int divideByTwo(int number) {
        return number / 2;
    }

    static void printStars(int k) {
        int i = 0;
        while (i < k) { // Blockanweisung
            System.out.print("*");
            i = i + 1;

        }
    }

    static void printStarRows(int k) {
        while (k > 0) { // Blockanweisung
            printStars(k);
            System.out.println();
            k = k -1;
        }
    }

    static void printYildiz(int m){
        int i = 0;
        if (i < m){
            System.out.println("*");
            i= i+1;
        }
        System.out.println();
        m = m-1;

    }
    static void printYildiz2(int p){
        for(int i = p; i >0; i--){
            for(int k = 0; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * @param p
     * @return *****
     * @see
     */
    static void printYildiz3(int p){
        for(int i = p; i >0; i--){
            System.out.print("*");
        }
        System.out.println();
    }

    /**
     * bu bir javaDoc örnegidir
     * bu örnek ile sinav gecilir
     * @author osman
     * @version
     * @deprecated
     */


    /** Die Methode nparabel liefert zum den y-Wert an der Stelle x von einer Parabel.
     * Die Parabel hat die Gleichung y = a*xˆ2 + b * x + c.
     * @param x ist der x-Wert der Parabel
     * @param a ist der quadratische Koeffizient
     * @param b ist der lineare Koeffizient
     * @param c ist die Konstante
     * @return liefert den Wert an der Stelle x der Parabel
     */
    public static double nparabel(double a, double b, double c, double x) {
        return a*x*x + b*x + c;
    }

    /**
     * Der Algorithmus berechnet Maximum von zwei Zahlen a und b.
     * @param a
     * @param b
     * @return maximum von a und b
     */
    public static int max2(int a,int b){
        if(a < b){
            return b;
        }else
            return a;
    }

    /**
     * Der Algorithmus return maximun vvon drei Zahlen
     * @param a
     * @param b
     * @param c
     * @return Maximum a, b und c
     */
    public static int max3(int a,int b, int c){
        int temp = max2(a, b);
        return max2(c, temp);
    }

    public static int fac(int n){
        if(n == 0){
            return 1;
        }else {
            return n * fac(n-1);
        }

    }

    public static int facWhile(int n){
        int erg = 1;
        while(n>0){
            erg = erg*n;
            n = n-1;
        }
        return erg;
    }

    static int mcCarthy(int n){
        if (n > 100)
            return n-10;
        else
            return mcCarthy(mcCarthy(n+11));
    }

    void bewegeStapel (int n, int von, int nach, int ueber) {
        if (n == 1) { // Stopbedingung für die Rekursion
            bewegeScheibe(von, nach);
        } else { // Zurückführung auf einfachere Probleme
            bewegeStapel(n - 1, von, ueber, nach);
            bewegeScheibe(von, nach);
            bewegeStapel(n - 1, ueber, nach, von);
        }
    }

    private void bewegeScheibe(int von, int nach) {
    }

}
