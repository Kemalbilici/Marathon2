package controller;

import entity.Ipucu;
import entity.Unlu;
import entity.Yarismaci;
import service.IpucuService;

import java.util.List;
import java.util.Scanner;

public class YarismaController {

    public static void ipucu(Yarismaci yarismaci, List<Unlu> unluList) {
        Scanner scanner = new Scanner(System.in);

        long baslangicZamani = System.currentTimeMillis();

        for (Unlu unlu : unluList) {
            System.out.println("------------Bil Bakalim Kim?-------------");

            List<Ipucu> ipucuList = IpucuService.ipucu(List.of(unlu));
            boolean dogruTahmin = false;

            while (!dogruTahmin) {
                System.out.println("Tahmininizi giriniz:");
                String tahmin = scanner.nextLine();
                Ipucu ipucu = ipucuList.get(0);

                if (unlu.getId().equals(ipucu.getUnlu().getId()) &&
                        tahmin.equalsIgnoreCase(unlu.getName()) &&
                        tahmin.equalsIgnoreCase(unlu.getSurname())) {
                    System.out.println("Tebrikler, doğru tahmin ettiniz!");
                    dogruTahmin = true;
                } else {
                    System.out.println("Yanlış tahmin, tekrar deneyiniz.");
                }
            }
        }

        long bitisZamani = System.currentTimeMillis();
        int yarismaSuresi = (int) ((bitisZamani - baslangicZamani) / 90);
        System.out.println("Yarışma sonlandı!");
    }
}