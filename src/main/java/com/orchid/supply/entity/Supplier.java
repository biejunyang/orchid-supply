package com.orchid.supply.entity;

import com.orchid.mybatis.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * (Supplier)表实体类
 *
 * @author makejava
 * @since 2020-04-10 17:06:07
 */
@SuppressWarnings("serial")
//@TableName("supplier")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supplier extends BaseEntity<Supplier> {

    private String name;

    private String phone;

    private String address;


}
