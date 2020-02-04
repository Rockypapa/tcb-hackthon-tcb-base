package today.rocky.tcb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import today.rocky.tcb.bean.Record;

/**
 * @author Rocky
 * @date 2020/2/4 22:55
 * @apiNote 记录信息
 */
@Repository
public interface RecordDao extends JpaRepository<Record,Long>, JpaSpecificationExecutor<Record> {
}
