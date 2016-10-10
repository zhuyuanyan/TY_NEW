package com.cardpay.pccredit.Sx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardpay.pccredit.Sx.dao.SxDao;
import com.cardpay.pccredit.Sx.model.SxInputData;
import com.cardpay.pccredit.Sx.model.SxOutputData;
import com.cardpay.pccredit.customer.model.TyRepaySxForm;
import com.cardpay.pccredit.postLoan.filter.SxFilter;
import com.wicresoft.jrad.base.database.model.QueryResult;
@Service
public class SxService {
@Autowired
private SxDao dao;
	
	public QueryResult<SxOutputData> findSxListByFilter(SxInputData filter) {
		
		List<SxOutputData> lists = dao.findSxListByFilter(filter);
		int size = dao.findSxListCountByFilter(filter);
		QueryResult<SxOutputData> qr = new QueryResult<SxOutputData>(size,lists);
		return qr;
	}

	public List<SxOutputData> findSxListByFilterNoPage(SxInputData filter) {
		if(filter.getDeptId()!=null){
			if(filter.getDeptId().equals("0")){
				filter.setDeptId(null);
			}
		}
		if(filter.getYear()!=null&&filter.getMonth()!=null){
			if(filter.getMonth().length()<2){
				filter.setDate(filter.getYear()+"0"+filter.getMonth());
			}else{
				filter.setDate(filter.getYear()+filter.getMonth());
			}
		}
		List<SxOutputData> lists = dao.findSxListByFilterNoPage(filter);
		return lists;
	}

	public QueryResult<SxOutputData> findje(SxInputData filter) {
		// TODO Auto-generated method stub
		List<SxOutputData>lists= dao.findje(filter);
		int size = dao.findSxListCountByFilterje(filter);
		QueryResult<SxOutputData> qr = new QueryResult<SxOutputData>(size, lists);
		return qr;
	}
	
	public List<SxOutputData> findteam() {
		// TODO Auto-generated method stub
		return dao.findteam();
	}

	public List<SxOutputData> finduser() {
		// TODO Auto-generated method stub
		return dao.finduser();
	}





	

	

}
