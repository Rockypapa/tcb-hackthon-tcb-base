package today.rocky.tcb.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Rocky
 * @date 2020/2/4 22:29
 */
@Data
@Entity
@Table(name = "t_org_admin")
public class OrgAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * 所属组织信息
     */
    @ManyToOne
    @JoinColumn(name = "org_id")
    private Orgs orgs;

    /**
     * 管理员名字
     */
    @Column(name = "admin_name")
    private String adminName;

    /**
     * 管理员创建时间
     */
    @Column(name = "create_time")
    private String createTime;
}
