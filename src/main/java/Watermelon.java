import java.util.Scanner;
public class Watermelon {

    public boolean test(int w){
        boolean y=false;
        if (w > 2) {
            if (w % 2 == 0) {
                System.out.println("yes");
                y=true;
                return y;
            }
            else {
                System.out.println("no");
                y=false;
                return y;
            }

        }
        else{
            System.out.println("NO");
            y=false;
            return y;}

    }
        public static void main(String[]args) {
            Scanner scanner = new Scanner(System.in);
            int weigth = scanner.nextInt();
            var water = new Watermelon();
            water.test(weigth);

        }
}







