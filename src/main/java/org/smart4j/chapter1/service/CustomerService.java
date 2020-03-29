package org.smart4j.chapter1.service;


import lombok.extern.slf4j.Slf4j;
import org.smart4j.chapter1.model.Customer;
import org.smart4j.chapter1.util.PropsUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 提供客户数据服务
 */
@Slf4j
public class CustomerService {
    private static final String DRIVER;
    private static final String URL;
    private static final String USERNAME;
    private static final String PASSWORD;

    static {
        Properties properties = PropsUtil.loadProps("config.properties");
        DRIVER = properties.getProperty("jdbc.driver");
        URL = properties.getProperty("jdbc.url");
        USERNAME = properties.getProperty("jdbc.username");
        PASSWORD = properties.getProperty("jdbc.password");

        System.out.println(properties.toString());
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            log.error("can not load jdbc driver", e);
        }
    }

    /**
     * 获取客户列表
     */
    public List<Customer> getCustomerList() {


        Connection conn = null;

        List<Customer> customerList = new ArrayList<>();
        String sql = "SELECT * FROM customer";
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Customer customer = Customer.builder()
                        .id(resultSet.getLong("id"))
                        .name(resultSet.getString("name"))
                        .contact(resultSet.getString("contact"))
                        .telephone(resultSet.getString("telephone"))
                        .email(resultSet.getString("email"))
                        .remark(resultSet.getString("remark"))
                        .build();
                customerList.add(customer);
            }
        } catch (SQLException e) {
            log.error("execute sql failure", e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    log.error("close connection failure", e);
                }
            }
        }


        return customerList;
    }

    /**
     * 获取客户
     */
    public Customer getCustomer(long id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        return null;
    }

    /**
     * 创建客户
     */
    public boolean createCustomer(Map<String, Object> fieldMap) {
        return false;
    }

    /**
     * 更新客户
     */
    public boolean updateCustomer(long id, Map<String, Object> fieldMap) {
        return false;
    }

    /**
     * 删除客户
     */
    public boolean deleteCustomer(long id) {
        return false;
    }
}
