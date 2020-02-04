package today.rocky.tcb.bean;

import lombok.Data;


import javax.persistence.*;

/**
 * @author Rocky
 * @date 2020/2/4 22:00
 * @apiNote 机构信息
 */
@Data
@Entity
@Table(name = "t_orgs")
public class Orgs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * 机构名字
     */
    @Column(name = "org_name")
    private String orgName;

    /**
     * 组织类型
     * 0 未知   1 公安   2 站务    3小区
     */
    @Column(name = "org_type")
    private byte orgType;

    /**
     * 组织主要地理信息
     */
    @Column(name = "org_location")
    private String orgLocation;

    /**
     * 组织经度
     */
    @Column(name = "main_longitude")
    private String mainLongitude;

    /**
     * 组织纬度
     */
    @Column(name = "main_latitude")
    private String mainLatitude;
}
