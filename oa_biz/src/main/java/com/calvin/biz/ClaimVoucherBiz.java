package com.calvin.biz;

import com.calvin.entity.ClaimVoucher;
import com.calvin.entity.ClaimVoucherItem;
import com.calvin.entity.DealRecord;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface ClaimVoucherBiz {
    /**
     * 保存报销单
     * @param claimVoucher
     * @param items
     */
    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);

    /**
     * 根据id获得报销单
     * @param id
     * @return
     */
    ClaimVoucher get(int id);

    /**
     * 查询报销单详情
     * @param cvid
     * @return
     */
    List<ClaimVoucherItem> getItems(int cvid);

    /**
     * 获得处理记录
     * @param cvid
     * @return
     */
    List<DealRecord> getRecords(int cvid);
}
