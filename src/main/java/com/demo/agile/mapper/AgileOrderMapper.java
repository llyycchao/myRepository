package com.demo.agile.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo.agile.model.AgileOrder;
import org.apache.ibatis.annotations.*;

@Mapper
public interface AgileOrderMapper {

    int add(AgileOrder agileOrder);

    @Update("update agile_order set quantity = #{quantity}, commont = #{commont} where order_id = #{orderId}")
    int update(@Param("quantity") Integer quantity, @Param("commont") String commont, @Param("orderId") String orderId);

    @Delete("delete from agile_order where order_id = #{orderId}")
    int delete(String orderId);

    @Select("select order_id as orderId, order_date as orderDate, quantity as quantity, commont as commont from agile_order where order_id = #{orderId}")
    AgileOrder findAgileOrder(@Param("orderId") String orderId);

    IPage<AgileOrder> getAllAgileOrder(Page<AgileOrder> page);

}
