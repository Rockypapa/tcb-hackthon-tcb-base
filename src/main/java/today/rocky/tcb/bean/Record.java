package today.rocky.tcb.bean;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author Rocky
 * @date 2020/2/4 22:46
 */
@Data
@Entity
@Table(name = "t_record")
public class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * 所属机构
     */
    @ManyToOne
    @JoinColumn(name = "r_org")
    private Orgs orgs;

    /**
     * 被检查人姓名
     */
    @Column(name = "r_name")
    private String rName;

    /**
     * 被检测人性别
     */
    @Column(name = "r_sex")
    private byte  rSex;

    /**
     * 被检测人温度
     */
    @Column(name = "temper")
    private String temper;

    /**
     * 上次查询时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 测量位置经度
     */
    @Column(name = "r_longitude")
    private String rLongitude;

    /**
     * 测量位置纬度
     */
    @Column(name = "r_latitude")
    private String rLatitude;

    /**
     * 测量地点名字
     */
    @Column(name = "location_name")
    private String locationName;

}
