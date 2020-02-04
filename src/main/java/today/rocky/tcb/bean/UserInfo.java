package today.rocky.tcb.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Rocky
 * @date 2020/2/4 22:56
 */
@Data
@Entity
@Table(name = "t_user_info")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * 人员名字
     */
    @Column(name = "name")
    private String name;

    /**
     * 加密身份证信息
     */
    @Column(name = "id_info")
    private String idInfo;

    /**
     * 性别
     */
    @Column(name = "sex")
    private byte sex;
}
