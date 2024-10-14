import java.util.Scanner;

public class usAl {

    static int usAl(int taban, int us){
        if(us == 0){
            return 1;
        } else if(taban == 1){
            return taban;
        }else{
            return taban * usAl(taban,us-1);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("taban değerini giriniz: ");
        int taban  = input.nextInt();

        System.out.println("üs değerini giriniz: ");
        int us  = input.nextInt();


        int sonuc =usAl(taban,us);
        System.out.println("sonuc : " +sonuc );

    }
}
