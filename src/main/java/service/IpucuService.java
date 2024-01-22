package service;

import entity.Ipucu;
import entity.Unlu;
import repository.IpucuRepository;
import java.util.ArrayList;
import java.util.List;
public class IpucuService {

    public static List<Ipucu> ipucu(List<Unlu> unluList) {
        List<Ipucu> ipucuList = new IpucuRepository().findAll();
        List<Ipucu> ipucuSon = new ArrayList<>();

        for (Unlu unlu : unluList) {
            // Her unlu için ipucu listesi idlerle beraber listeleniyor
            List<Ipucu> filtrelenmisIpucular = new ArrayList<>();

            for (Ipucu ipucu : ipucuList) {
                if (ipucu.getUnlu().getId().equals(unlu.getId())) {
                    filtrelenmisIpucular.add(ipucu);
                }
            }

            // Filtrelenmiş ipucular üzerinden sorgu yapılıyor
            for (Ipucu ipucu : filtrelenmisIpucular) {
                if ("Erkek".equals(ipucu.getCinsiyet()) && "Futbolcu".equals(ipucu.getMeslek()) &&
                        ipucu.getBoy() > 170 && ipucu.getKilo() > 80 && ipucu.getYas() > 30) {

                    System.out.println("---------- Ipucu ----------");
                    System.out.println("Boy: " + ipucu.getBoy());
                    System.out.println("Kilo: " + ipucu.getKilo());
                    System.out.println("Cinsiyet: " + ipucu.getCinsiyet());
                    System.out.println("Meslek: " + ipucu.getMeslek());
                    System.out.println("------------------------------");

                    ipucuSon.add(ipucu);
                }
            }
        }

        return ipucuSon;
    }
}

