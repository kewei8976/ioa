package com.letv.fund.service.impl;

import com.letv.fund.mapper.OrderAuditMapper;
import com.letv.fund.model.OrderAudit;
import com.letv.fund.service.OrderAuditService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by kewei on 2014/9/26.
 */
@Service(value="orderAuditService")
public class OrderAuditServiceImpl implements OrderAuditService {


    Logger logger = LoggerFactory.getLogger(OrderAuditServiceImpl.class);

    @Resource
    OrderAuditMapper orderAuditMapper ;

    @Override
    public OrderAudit getByLoginName(String lName) {
        try {
            return orderAuditMapper.selectByLoginName(lName);
        } catch (Exception e) {
            logger.info("获取信息时报错 : "+e.getMessage());
        }
        return null ;
    }

    @Override
    public boolean isOrderAudit() {
        return false;
    }
}
