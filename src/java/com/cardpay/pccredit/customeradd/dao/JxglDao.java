package com.cardpay.pccredit.customeradd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cardpay.pccredit.customer.filter.MaintenanceFilter;
import com.cardpay.pccredit.customeradd.model.JxglForm;
import com.cardpay.pccredit.customeradd.model.MaintenanceForm;
import com.cardpay.pccredit.manager.web.AccountManagerParameterForm;
import com.wicresoft.util.annotation.Mapper;
@Mapper
public interface JxglDao {

	List<AccountManagerParameterForm> findcustomermanager();

	List<JxglForm> findAlljxglList(MaintenanceFilter filter);

	int findAlljxglCountList(MaintenanceFilter filter);

}
