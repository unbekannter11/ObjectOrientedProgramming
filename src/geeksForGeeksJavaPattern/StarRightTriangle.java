package src.geeksForGeeksJavaPattern;

public class StarRightTriangle {
    public static void main(String[] args) {
        System.out.println("For Döngüsü ile:");
        rightStarFor(5);
        System.out.println("\nWhile Döngüsü ile:");
        rightStarWhile(5);

    }


    public static void rightStarFor(int n){

        int a, b;

            for(a = 0; a < n; a++){
                for(b = 0; b <= a; b++){
                    if(b == a){
                        System.out.print("*|");
                    } else {
                        System.out.print("* |");
                    }
                }
                System.out.println();
            }
    }

    public static void rightStarWhile(int n) {

        int x = 0;
        while(x < n){
            int y = 0;

            while (y <= x){
                if(x == y){
                    System.out.print("* |");
                }else{
                    System.out.print("*");
                }
                y++;
            }
            System.out.println();
            x++;
        }
    }
}
