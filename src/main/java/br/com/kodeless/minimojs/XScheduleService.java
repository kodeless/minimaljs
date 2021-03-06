package br.com.kodeless.minimojs;

import java.util.Date;

import br.com.kodeless.minimojs.dao.XDAO;
import br.com.kodeless.minimojs.model.internal.XScheduledExecution;

public class XScheduleService {

	XDAO<XScheduledExecution> dao = new XDAO<XScheduledExecution>(XScheduledExecution.class);
	
	public void executeOnDate(String methodName, Date date){
		XScheduledExecution exec = new XScheduledExecution();
		exec.setExecuted(false);
		exec.setExecutionDate(date);
		exec.setScheduleName(methodName);
		dao.insert(exec);
	}
}
