package user.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import AAA.common.AAATools;
import Entity.Operator;
import baseService.baseUCServiceImpl;
import common.exception.gException;
import user.ServiceInteerface.OperatorUCService;

@Service
public class OperatorServiceImpl extends baseUCServiceImpl<Operator> implements OperatorUCService
{
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public String Add(Operator entity) throws Exception, gException 
	{
		
		
		return super.Add(entity);
	}
	
	@Override
	@Transactional
	public Operator Edit(Operator entity) throws Exception, gException {
		
		
		return super.Edit(entity);
	}
	
	@Override
	@Transactional
	public void Remove(Operator entity) throws Exception, gException {
		
		super.Remove(entity);
	}

}
