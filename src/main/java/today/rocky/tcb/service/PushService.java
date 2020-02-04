package today.rocky.tcb.service;

import today.rocky.tcb.bean.Record;

/**
 * @author Rocky
 * @date 2020/2/4 23:14
 */
public interface PushService {
    /**
     * 存储记录信息并返回结果
     * @param record 记录信息
     * @return 结果
     */
    int saveRecord(Record record);
}
