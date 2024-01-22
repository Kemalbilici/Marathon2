package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_yarisma")
public class Yarisma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer sure;

    @ManyToOne
    Ipucu ipucu;

    @OneToOne(mappedBy = "yarisma", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Kazanan kazanan;
}
