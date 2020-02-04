package today.rocky.tcb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import today.rocky.tcb.bean.UserInfo;

/**
 * @author Rocky
 * @date 2020/2/4 23:00
 * @apiNote 流动人员信息接口
 */
@Repository
public interface UserInfoDao extends JpaRepository<UserInfo,Long>, JpaSpecificationExecutor<UserInfo> {
}
