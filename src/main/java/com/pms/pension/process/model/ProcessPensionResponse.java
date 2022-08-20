package com.pms.pension.process.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class ProcessPensionResponse {
	private int processPensionStatusCode;

	public ProcessPensionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProcessPensionResponse(int processPensionStatusCode) {
		this.processPensionStatusCode = processPensionStatusCode;
	}

	public int getProcessPensionStatusCode() {
		return processPensionStatusCode;
	}

	public void setProcessPensionStatusCode(int processPensionStatusCode) {
		this.processPensionStatusCode = processPensionStatusCode;
	}


	@Override
	public String toString() {
		return "ProcessPensionResponse [processPensionStatusCode=" + processPensionStatusCode + "]";
	}
	
	
}