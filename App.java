import java.util.Scanner;

public class App {

    public static void main(String[] args){
        int k;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sayı Giriniz: "); 
        k = inp.nextInt();

        System.out.println("Çift Sayılar: ");
        for(int i = 0; i <= k; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
} 

