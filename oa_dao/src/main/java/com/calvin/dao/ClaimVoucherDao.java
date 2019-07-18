package com.calvin.dao;

import com.calvin.entity.ClaimVoucher;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface ClaimVoucherDao {
    /**
     * 插入报销单
     * @param claimVoucher
     */
    void insert(ClaimVoucher claimVoucher);

    /**
     *修改报销单
     * @param claimVoucher
     */
    void update(ClaimVoucher claimVoucher);

    /**
     *删除报销单
     * @param id
     */
    void delete(int id);

    /**
     *根据id查询报销单
     * @param id
     * @return
     */
    ClaimVoucher select(int id);

    /**
     * 根据创建者编号查询报销单
     * @param csn
     * @return
     */
    List<ClaimVoucher> selectByCreateSn(String csn);

    /**
     * 根据下一个处理者编号查询报销单
     * @param ndsn
     * @return
     */
    List<ClaimVoucher> selectByNextDealSn(String ndsn);


}
