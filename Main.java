import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        List<Auto> kocsi = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Adja meg a járművének a márkáját:");
        String jarmuMarka = sc.next();
        System.out.println("Adja meg a járművének a tipusat:");
        String jarmuTipus = sc.next();
        System.out.println("Adja meg a járművének a Lőerejét:");
        int jarmuLoEro = sc.nextInt();
        System.out.println("Adja meg a járművének a hengerűrtaltalmat:");
        int jarmuCm3 = sc.nextInt();

        kocsi.add(new Auto(jarmuMarka,jarmuTipus,jarmuLoEro,jarmuCm3));

        for (Auto autoObj:kocsi)
        {
            System.out.println(autoObj.getMarka() + " " + autoObj.getTipus() + " " + autoObj.getLoEro() + " " + autoObj.getHengerUrtaltalom());

        }


    }
}