package com.calvin.biz;

import com.calvin.entity.Department;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface DepartmentBiz {
    /**
     * 增加
     * @param department
     */
    void add(Department department);

    /**
     * 修改
     * @param department
     */
    void edit(Department department);

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
    Department get(String sn);

    /**
     * 查询所有
     * @return
     */
    List<Department> getAll();
}
