package com.demo.agile.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.agile.model.AgileOrder;

public interface AgileOrderService {


    public int add(String orderId);

    public int update(String orderId);

    public int delete(String orderId);

    public AgileOrder findAgileOrder(String orderId);

    public IPage<AgileOrder> getAll(Page<AgileOrder> page);

}
