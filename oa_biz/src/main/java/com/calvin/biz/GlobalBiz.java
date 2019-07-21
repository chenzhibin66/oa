package com.calvin.biz;

import com.calvin.entity.Employee;

/**
 * @author Calvin
 * @Description:
 */
public interface GlobalBiz {
    /**
     * 员工登录
     * @param sn
     * @param password
     * @return
     */
    Employee login(String sn, String password);

    /**
     * 修改密码
     * @param employee
     */
    void changePassword(Employee employee);
}
