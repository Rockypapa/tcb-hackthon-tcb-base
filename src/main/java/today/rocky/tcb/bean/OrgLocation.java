package today.rocky.tcb.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Rocky
 * @date 2020/2/4 22:37
 */
@Data
@Entity
@Table(name = "t_org_location")
public class OrgLocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * 所属组织
     */
    @ManyToOne
    @JoinColumn(name = "org_id")
    private Orgs orgs;

    /**
     * 组织办公地点
     */
    @Column(name = "org_location")
    private String orgLocation;

    /**
     * 办公地点经度
     */
    @Column(name = "org_longitude")
    private String orgLongitude;

    /**
     * 办公地点纬度
     */
    @Column(name = "org_latitude")
    private String orgLatitude;
}
