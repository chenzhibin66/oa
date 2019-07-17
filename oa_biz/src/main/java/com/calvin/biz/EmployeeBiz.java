package com.calvin.biz;

import com.calvin.entity.Employee;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface EmployeeBiz {
    /**
     * 增加
     * @param employee
     */
    void add(Employee employee);

    /**
     * 修改
     * @param employee
     */
    void edit(Employee employee);

    /**
     * 删除
     * @param sn
     */
    void remove(String sn);

    /**
     * 查询
     * @param sn
     * @return
     */
    Employee get(String sn);

    /**
     * 查询所有
     * @return
     */
    List<Employee> getAll();
}
