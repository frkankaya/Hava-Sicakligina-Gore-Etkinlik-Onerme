import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kayak, sinema, piknik, yuzme, heat;
        Scanner inp = new Scanner(System.in);


        System.out.print("Hava Sicakligini Giriniz :");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapiniz");
        } else if (heat >= 5 && 25 >= heat) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if (heat >= 10)
                System.out.println("Piknige gidebilirsiniz");
        } else {
            System.out.println("Yuzmeye gidebilirsiniz");
        }


    }
}
