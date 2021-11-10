import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int data,j=1,i=0;

        System.out.println("Kuuvetini bulmak istediğiniz sayıyı girin: ");
        data = scn.nextInt();
        for (i = 1,j=1; i <= data || j <= data ; i *= 4,j*=5) {
            System.out.println(i+ " " +j);
        }


    }
}
