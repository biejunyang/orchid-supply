package com.orchid.supply.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.orchid.supply.dao.SupplierDao;
import com.orchid.supply.entity.Supplier;
import com.orchid.supply.service.SupplierService;
import org.springframework.stereotype.Service;

/**
 * (Supplier)表服务实现类
 *
 * @author makejava
 * @since 2020-04-10 17:06:07
 */
@Service("supplierService")
public class SupplierServiceImpl extends ServiceImpl<SupplierDao, Supplier> implements SupplierService {

}