package today.rocky.tcb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import today.rocky.tcb.bean.Orgs;

/**
 * @author Rocky
 * @date 2020/2/4 22:22
 * @apiNote 组织信息查询
 */
@Repository
public interface OrgsDao extends JpaRepository<Orgs,Long>, JpaSpecificationExecutor<Orgs> {

}
