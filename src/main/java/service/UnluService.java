package service;

import entity.Unlu;
import repository.UnluRepository;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class UnluService {
    public static List<Unlu> rastgeleUnluleriCagir(int adet) {
        List<Unlu> unluList = new UnluRepository().findAll();

        // Belirtilen adette rastgele ünlüleri getirir
        List<Unlu> secilenUnluler = new Random().ints(0, unluList.size())
                .distinct()
                .limit(adet)
                .mapToObj(unluList::get)
                .toList();


        for (Unlu unlu : secilenUnluler) {
            karistir(unlu);
        }

        return secilenUnluler;
    }

    private static void karistir(Unlu unlu) {
        List<String> ozellikler = List.of(
                unlu.getName(),
                unlu.getSurname()

        );

        Collections.shuffle(ozellikler);

        // Özellikleri shufflelayıp tekrar ünlülere atama
        unlu.setName(ozellikler.get(0));
        unlu.setSurname(ozellikler.get(1));
    }

}
