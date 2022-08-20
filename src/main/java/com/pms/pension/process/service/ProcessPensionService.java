package com.pms.pension.process.service;

import com.pms.pension.process.exception.AadharNumberNotFound;
import com.pms.pension.process.exception.AuthorizationException;
import com.pms.pension.process.exception.PensionerDetailException;
import com.pms.pension.process.model.PensionDetail;
import com.pms.pension.process.model.PensionerInput;
import com.pms.pension.process.model.ProcessPensionInput;
import com.pms.pension.process.model.ProcessPensionResponse;

public interface ProcessPensionService {
	
	public PensionDetail CalculatePension(String token,PensionerInput pensionerInput) throws PensionerDetailException, AuthorizationException, AadharNumberNotFound;
	public ProcessPensionResponse getCode(String token,ProcessPensionInput processPensionInput) throws AuthorizationException, AadharNumberNotFound;
}
