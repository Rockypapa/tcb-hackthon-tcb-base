package today.rocky.tcb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import today.rocky.tcb.bean.OrgAdmin;

/**
 * @author Rocky
 * @date 2020/2/4 22:35
 * @apiNote 所属组织管理员信息
 */
@Repository
public interface OrgAdminDao extends JpaRepository<OrgAdmin,Long>, JpaSpecificationExecutor<OrgAdmin> {
}
