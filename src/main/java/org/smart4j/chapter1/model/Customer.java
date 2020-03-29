package org.smart4j.chapter1.model;

import lombok.*;

/**
 * @author laowang
 * @date 2020/3/24 22:24
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Customer {
    /**
     * ID
     */
    private long id;

    /**
     * 客户名称
     */
    private String name;

    /**
     * 联系人
     */
    private String contact;

    /**
     * 电话号码
     */
    private String telephone;

    /**
     * 邮箱地址
     */
    private String email;

    /**
     * 备注
     */
    private String remark;

}
