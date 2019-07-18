package com.calvin.dao;

import com.calvin.entity.ClaimVoucherItem;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface ClaimVoucherItemDao {
    /**
     * 插入报销单详细
     * @param claimVoucherItem
     */
    void insert(ClaimVoucherItem claimVoucherItem);

    /**
     * 修改报销单详细
     * @param claimVoucherItem
     */
    void update(ClaimVoucherItem claimVoucherItem);

    /**
     * 删除
     * @param id
     */
    void delete(int id);

    /**
     * 根据报销单编号查询详细
     * @param cvid
     * @return
     */
    List<ClaimVoucherItem> selectByClaimVoucher(int cvid);
}
