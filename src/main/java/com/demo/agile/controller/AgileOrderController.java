package com.demo.agile.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.agile.model.AgileOrder;
import com.demo.agile.service.AgileOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgileOrderController {

    @Autowired
    private AgileOrderService agileOrderService;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }

    @RequestMapping(value = "/add/{orderId}")
    public void add(@PathVariable("orderId") String orderId) {
        agileOrderService.add(orderId);
    }

    @RequestMapping(value = "/update/{orderId}")
    public void update(@PathVariable("orderId") String orderId) {
        agileOrderService.update(orderId);
    }

    @RequestMapping(value = "/delete/{orderId}")
    public void delete(@PathVariable("orderId") String orderId) {
        agileOrderService.delete(orderId);
    }

    @RequestMapping(value = "/getAgileOrder/{orderId}")
    public AgileOrder getAgileOrder(@PathVariable("orderId") String orderId) {
        AgileOrder agileOrder = agileOrderService.findAgileOrder(orderId);
        return agileOrder;
    }

    @RequestMapping(value = "/getAll/{pageNum}/{pageSize}")
    public IPage<AgileOrder> getAll(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {

        Page<AgileOrder> page = new Page<>(pageNum, pageSize);
        IPage<AgileOrder> all = agileOrderService.getAll(page);

        return all;
    }

}
