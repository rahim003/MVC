package peaksoft.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.SEQUENCE;

/**
 * @author krasa kurbanov
 * @created 15/02/2023 - 11:09
 **/
@Entity
@Table(name = "hospitals")
@Getter
@Setter
@NoArgsConstructor
public class Hospital {
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "hospital_generator")
    @SequenceGenerator(name = "hospital_sequence", sequenceName = "hospital_seq", allocationSize = 1)
    private Long id;
    private String name;
    private String address;

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
