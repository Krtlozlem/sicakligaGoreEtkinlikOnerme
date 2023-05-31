import java.util.Scanner;

public class etkinlikOnerme {
    public static void main(String[] args) {
        int heat;

        Scanner inp =new Scanner(System.in);

        System.out.print("Sıcaklık: ");
        heat = inp.nextInt();
        if(heat <= 5){
            System.out.println("kayak yapabilirsiniz ");
        }else if(heat >= 5 && heat <= 25){
            if(heat<= 15){
                System.out.println("sinamaya gidebilirsin.");
            }
            if(heat>=10){
                System.out.println("pikniğe gidebilirsin. ");
            }else{
                System.out.println("yüzmeye gidebilirsin.12");
            }
        }
    }
}
