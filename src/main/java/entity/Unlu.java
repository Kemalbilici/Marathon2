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
@Table(name = "tbl_unlu")
public class Unlu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String surname;
    String imageUrl;

    @OneToOne(mappedBy = "unlu", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Ipucu ipucu;

}
