package mini.insurer.com.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author : Odinga David
 * @since : 7/3/21, Sat
 */

@Entity
@Table(name= "tqc_agencies")
@Data
public class Agents {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO )
    private long agentCode;

    @Column(name="agn_name")
    private String name;

    @Column(name="agn_email")
    private String email;

    @Column(name="agn_phone")
    private String phone;

    @Column(name="agn_commission")
    private long commission;
}
