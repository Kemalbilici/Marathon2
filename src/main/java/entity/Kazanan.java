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
@Table(name = "tbl_kazanan")
public class Kazanan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    Yarismaci yarismaci;

    @OneToOne(mappedBy = "kazanan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Yarisma yarisma;
}
