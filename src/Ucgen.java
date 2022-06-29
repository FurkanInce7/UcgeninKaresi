import java.util.Scanner;
public class Ucgen
{
    public static void main(String[] args) {
        double uzunKenar, kisaKenar,hipotenus, alanToplami, alan1;

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen Kisa Kenar Uzunlugunu Giriniz: ");
        kisaKenar= input.nextDouble();
        System.out.println("Lutfen Uzun Kenar Uzunlugunu Giriniz");
        uzunKenar= input.nextDouble();
        hipotenus=Math.sqrt((kisaKenar*kisaKenar) + (uzunKenar*uzunKenar));
        alanToplami =( kisaKenar + uzunKenar + hipotenus)/2;
        alan1= Math.sqrt(alanToplami* (alanToplami-kisaKenar) * (alanToplami-uzunKenar) * (alanToplami-hipotenus));
        System.out.println("Ucgenin ALani: "+alan1);
    }
}
