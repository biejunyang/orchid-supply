package com.orchid.supply.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.orchid.supply.dao.SupplyOrderDetailDao;
import com.orchid.supply.entity.SupplyOrderDetail;
import com.orchid.supply.service.SupplyOrderDetailService;
import org.springframework.stereotype.Service;

/**
 * (SupplyOrderDetail)表服务实现类
 *
 * @author makejava
 * @since 2020-04-10 17:06:07
 */
@Service("supplyOrderDetailService")
public class SupplyOrderDetailServiceImpl extends ServiceImpl<SupplyOrderDetailDao, SupplyOrderDetail> implements SupplyOrderDetailService {

}