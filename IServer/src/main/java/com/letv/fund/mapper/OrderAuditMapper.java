package com.letv.fund.mapper;

import com.letv.fund.model.OrderAudit;

public interface OrderAuditMapper {

    OrderAudit selectByLoginName(String lName) throws Exception;

}