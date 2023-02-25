import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String symbol = "";

        //System.out.println("Enter # of rows ");
        //rows = scanner.nextInt();
        //System.out.println("Enter # of columns: ");
        //columns = scanner.nextInt();
        System.out.println("Enter Symbol to use: ");
        symbol = scanner.next();

        for (int i=1; i<=1; i++){
            System.out.println();
            while( i<=0){
                System.out.println(i);
                i = i + 1;
            }
            for(int j=1; j<=1; j++){
                System.out.print(symbol + i++);
            }
        }




    }
}