package springtransaction.transactiontest;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface comprehensivetest {
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void empdata(){
		
	}
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void deptdata(){
		
	}
	
	public void randomdata(){
		
	}
}
