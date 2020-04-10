package com.orchid.supply.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.orchid.supply.dao.SupplyOrderDao;
import com.orchid.supply.entity.SupplyOrder;
import com.orchid.supply.service.SupplyOrderService;
import org.springframework.stereotype.Service;

/**
 * (SupplyOrder)表服务实现类
 *
 * @author makejava
 * @since 2020-04-10 17:06:07
 */
@Service("supplyOrderService")
public class SupplyOrderServiceImpl extends ServiceImpl<SupplyOrderDao, SupplyOrder> implements SupplyOrderService {

}