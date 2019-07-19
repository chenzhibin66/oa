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
     *
     * @param claimVoucher
     * @param items
     */
    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);

    /**
     * 根据id获得报销单
     *
     * @param id
     * @return
     */
    ClaimVoucher get(int id);

    /**
     * 查询报销单详情
     *
     * @param cvid
     * @return
     */
    List<ClaimVoucherItem> getItems(int cvid);

    /**
     * 获得处理记录
     *
     * @param cvid
     * @return
     */
    List<DealRecord> getRecords(int cvid);

    /**
     * 获取个人报销单
     *
     * @param sn
     * @return
     */
    List<ClaimVoucher> getForSelf(String sn);

    /**
     * 获取待处理报销单
     *
     * @param sn
     * @return
     */
    List<ClaimVoucher> getForDeal(String sn);

    void update(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);

    void submit(int id);

    void deal(DealRecord dealRecord);
}
