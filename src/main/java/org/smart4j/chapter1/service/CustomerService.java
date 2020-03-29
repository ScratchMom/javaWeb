package org.smart4j.chapter1.service;


import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.smart4j.chapter1.help.DatabaseHelper;
import org.smart4j.chapter1.model.Customer;

import java.util.List;
import java.util.Map;

/**
 * 提供客户数据服务
 */
@Slf4j
public class CustomerService {


    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        log.info(">>>>>>");
        List<Customer> customerList = DatabaseHelper.queryEntityList(Customer.class, sql, null);
        log.info("customerList = {}", JSONObject.toJSONString(customerList));
        return customerList;
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        return DatabaseHelper.queryEntity(Customer.class, sql, 1);
    }

    /**
     * 创建客户
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return DatabaseHelper.insertEntity(Customer.class, fieldMap);
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }
}
