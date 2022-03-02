import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Klavyeden okuma yapmak için Scanner nesnesini oluştur.

        Scanner reader = new Scanner(System.in);


        System.out.print("İnsert Number: ");

        // nextInt() metodu ile tam sayı türünde değer okuması yapılır.

        int num = reader.nextInt();

        int adet = 0;

        while(num != 0)
        {
            //num = num/10;
            num /= 10;
            ++adet;
        }

        System.out.println("Number of Digits: " + adet);
    }
}