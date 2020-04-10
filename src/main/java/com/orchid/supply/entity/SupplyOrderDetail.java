package com.orchid.supply.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.IdType;
import java.io.Serializable;

/**
 * (SupplyOrderDetail)表实体类
 *
 * @author makejava
 * @since 2020-04-10 17:06:07
 */
@SuppressWarnings("serial")
@TableName("supply_order_detail")
public class SupplyOrderDetail extends Model<SupplyOrderDetail> {

    @TableId(value="id", type = IdType.ASSIGN_ID)
    private Long id;

    @TableField("supply_order_id")
    private Long supplyOrderId;

    @TableField("product_id")
    private Long productId;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSupplyOrderId() {
        return supplyOrderId;
    }

    public void setSupplyOrderId(Long supplyOrderId) {
        this.supplyOrderId = supplyOrderId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }
