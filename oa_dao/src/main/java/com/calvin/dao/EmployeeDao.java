package com.calvin.dao;

import com.calvin.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
public interface EmployeeDao {
    /**
     * 插入
     *
     * @param employee
     */
    void insert(Employee employee);

    /**
     * 更新
     *
     * @param employee
     */
    void update(Employee employee);

    /**
     * 根据编号删除
     *
     * @param sn
     */
    void delete(String sn);

    /**
     * 根据编号查询
     *
     * @param sn
     * @return
     */
    Employee select(String sn);

    /**
     * 查询所有员工
     *
     * @return
     */
    List<Employee> selectAll();

    /**
     * 根据部门跟职务获得员工
     * @param dsn
     * @param post
     * @return
     */
    List<Employee> selectByDepartmentAndPost(@Param("dsn") String dsn, @Param("post") String post);
}
