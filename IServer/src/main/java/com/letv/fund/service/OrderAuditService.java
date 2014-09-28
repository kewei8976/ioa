package com.letv.fund.service;

import com.letv.fund.model.OrderAudit;

/**
 * Created by kewei on 2014/9/26.
 */
public interface OrderAuditService {

    OrderAudit getByLoginName(String lName) ;

    boolean isOrderAudit() ;
}
