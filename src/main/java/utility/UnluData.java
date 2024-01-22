package utility;

import entity.*;
import repository.*;
import utility.Meslek;
import utility.Cinsiyet;
public class UnluData {

    public static void unluYarat(){
        Ipucu ipucu1= Ipucu.builder()
                .cinsiyet(Cinsiyet.Erkek)
                .meslek(Meslek.Futbolcu)
                .boy(1.87)
                .kilo(83)
                .yas(38)
                .build();

        Ipucu ipucu2= Ipucu.builder()
                .cinsiyet(Cinsiyet.Erkek)
                .meslek(Meslek.Dansci)
                .boy(1.74)
                .kilo(76)
                .yas(26)
                .build();

        Ipucu ipucu3= Ipucu.builder()
                .cinsiyet(Cinsiyet.Kadin)
                .meslek(Meslek.Yonetici)
                .boy(1.60)
                .kilo(60)
                .yas(69)
                .build();

        Unlu unlu1= Unlu.builder()
                .name("Cristiano")
                .surname("Ronaldo")
                .build();

        Unlu unlu2= Unlu.builder()
                .name("Enes")
                .surname("Yabanci")
                .build();

        Unlu unlu3= Unlu.builder()
                .name("Guler")
                .surname("Sabancı")
                .build();
        ipucu1.setUnlu(unlu1);
        ipucu2.setUnlu(unlu2);
        ipucu3.setUnlu(unlu3);
    }
}
