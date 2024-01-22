package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import utility.Cinsiyet;
import utility.Meslek;
import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_ipucu")
public class Ipucu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int yas;
    double boy;
    double kilo;
    @Enumerated
    Cinsiyet cinsiyet;
    @Enumerated
    Meslek meslek;

    @OneToOne(mappedBy = "ipucu", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Unlu unlu;

    @ManyToOne
    Yarisma yarisma;
}
