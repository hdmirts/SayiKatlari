import java.util.Scanner;
public class yirmikat {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);        
        System.out.print("Lütfen Bir sayı Giriniz :");
        n = input.nextInt();

        for(int k = 1; k<=n; k*=4){
            System.out.println(k);
        }
        for(int a =1; a<=n; a*=5){
            System.out.println(a);
        }
       
        
    }
    
}
