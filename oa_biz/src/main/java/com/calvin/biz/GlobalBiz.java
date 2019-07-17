package com.calvin.biz;

import com.calvin.entity.Employee;

/**
 * @author Calvin
 * @Description:
 */
public interface GlobalBiz {

    Employee login(String sn, String password);

    void changePassword(Employee employee);
}
