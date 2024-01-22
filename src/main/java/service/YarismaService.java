package service;

import controller.YarismaController;
import entity.*;
import repository.YarismaRepository;
import repository.YarismaciRepository;

import java.util.List;

public class YarismaService {

    public static void yarismayiBaslat() {
        List<Yarismaci> yarismaciList = new YarismaciRepository().findAll();
        List<Unlu> unluList = UnluService.rastgeleUnluleriCagir(yarismaciList.size());

        for (Yarismaci yarismaci : yarismaciList) {
            System.out.println("--------------------------------");
            System.out.println("Yarışmacı...: " + yarismaci.getName());

            // Burayı süreyi ve yarışmayı başlatan servis olarak düşünmüştüm ancak başaramadım runnerda da sıkıntı çıkaracaktır.
            //return Kazanan;
        }

    }
}
