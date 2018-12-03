package com.msi.data;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="test", type="default")
public class TestLog {
	@Id
	private String mId;
	private Date mTimestamp;
	private String mClassName;
	private String mMethodName;
	private String mTestCase;
	private String mResult;
	private String mParameters;
	

	
	public String getId() {
		return mId;
	}


	public Date getTimestamp() {
		return mTimestamp;
	}



	public String getClassName() {
		return mClassName;
	}



	public String getMethodName() {
		return mMethodName;
	}



	public String getTestCase() {
		return mTestCase;
	}



	public String getResult() {
		return mResult;
	}



	public String getParameters() {
		return mParameters;
	}



	public void setId(String mId) {
		this.mId = mId;
	}
	

	public void setTimestamp(Date mTimestamp) {
		this.mTimestamp = mTimestamp;
	}



	public void setClassName(String mClassName) {
		this.mClassName = mClassName;
	}



	public void setMethodName(String mMethodName) {
		this.mMethodName = mMethodName;
	}



	public void setTestCase(String mTestCase) {
		this.mTestCase = mTestCase;
	}



	public void setResult(String mResult) {
		this.mResult = mResult;
	}



	public void setParameters(String mParameters) {
		this.mParameters = mParameters;
	}



	public TestLog() {

	}



	public TestLog(String mId, Date mTimestamp, String mClassName, String mMethodName, String mTestCase,
			String mResult, String mParameters) {
		super();
		this.mId = mId;
		this.mTimestamp = mTimestamp;
		this.mClassName = mClassName;
		this.mMethodName = mMethodName;
		this.mTestCase = mTestCase;
		this.mResult = mResult;
		this.mParameters = mParameters;
	}



	public TestLog( Date mTimestamp, String mClassName, String mMethodName, String mTestCase,
			String mResult, String mParameters) {
		super();

		this.mTimestamp = mTimestamp;
		this.mClassName = mClassName;
		this.mMethodName = mMethodName;
		this.mTestCase = mTestCase;
		this.mResult = mResult;
		this.mParameters = mParameters;
	}
	
}
