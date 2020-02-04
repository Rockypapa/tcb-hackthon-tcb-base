package today.rocky.tcb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import today.rocky.tcb.bean.OrgLocation;

/**
 * @author Rocky
 * @date 2020/2/4 22:44
 * @apiNote 组织查询地点接口
 */
@Repository
public interface OrgLocationDao extends JpaRepository<OrgLocation,Long>, JpaSpecificationExecutor<OrgLocation> {
}
