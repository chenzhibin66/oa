package com.calvin.dao;

import com.calvin.entity.DealRecord;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface DealRecordDao {
    /**
     * 插入处理记录
     * @param dealRecord
     */
    void insert(DealRecord dealRecord);

    /**
     * 根据报销单id查询处理记录
     * @param cvid
     * @return
     */
    List<DealRecord> selectByClaimVoucher(int cvid);
}
