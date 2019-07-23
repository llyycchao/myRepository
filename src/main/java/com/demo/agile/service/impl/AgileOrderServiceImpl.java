package com.demo.agile.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.agile.mapper.AgileOrderMapper;
import com.demo.agile.model.AgileOrder;
import com.demo.agile.service.AgileOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class AgileOrderServiceImpl implements AgileOrderService {

    @Autowired
    private AgileOrderMapper agileOrderMapper;

    @Override
    public int add(String orderId) {

        String str = "20180718";
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        java.util.Date orderDate = null;
        try {
            orderDate = format.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }

        AgileOrder agileOrder = new AgileOrder();
        agileOrder.setOrderId(orderId);
        agileOrder.setClientId("200001");
        agileOrder.setOrderDate(orderDate);
        agileOrder.setQuantity(1);
        agileOrder.setCommont("あいあいあい");

        return this.agileOrderMapper.add(agileOrder);
    }

    @Override
    public int update(String orderId) {

        return this.agileOrderMapper.update(3, "いｄｊづ", orderId);
    }

    @Override
    public int delete(String orderId) {

        return this.agileOrderMapper.delete(orderId);
    }

    @Override
    public AgileOrder findAgileOrder(String orderId) {

        return this.agileOrderMapper.findAgileOrder(orderId);
    }

    @Override
    public IPage<AgileOrder> getAll(Page<AgileOrder> page) {

        return this.agileOrderMapper.getAllAgileOrder(page);
    }

}
