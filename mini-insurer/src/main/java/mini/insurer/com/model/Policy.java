package mini.insurer.com.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author : Odinga David
 * @since : 7/5/21, Mon
 */


@Entity
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal polCode;

    @ManyToOne
    private Agents agents;

    @ManyToOne(optional = false)
    @Column(nullable = false)
    private Client client;

    private BigDecimal premium;
    private BigDecimal sumAssured;
    private LocalDate effectiveFrom;
}
