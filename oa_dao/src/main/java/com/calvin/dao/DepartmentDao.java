package com.calvin.dao;

import com.calvin.entity.Department;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */

public interface DepartmentDao {
    /**
     * 插入
     * @param department
     */
    void insert(Department department);

    /**
     * 更新
     * @param department
     */
    void update(Department department);

    /**
     * 根据编号删除
     * @param sn
     */
    void delete(String sn);

    /**
     * 根据编号查询部门
     * @param sn
     * @return
     */
    Department select(String sn);

    /**
     * 查询所有部门
     * @return
     */
    List<Department> selectAll();
}
