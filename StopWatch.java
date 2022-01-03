package ��7����ҵ;

import java.util.Date;

public class StopWatch {
	private Date startTime;
	private Date endTime;
	
	public StopWatch() {
		startTime=new Date();
		
	}
	
	public void start() {
		startTime=new Date();
		
	}
	
	public void stop() {
		endTime=new Date();
	}
	
	public long getElapsedTime() {
		return endTime.getTime()-startTime.getTime();
	}
	
	public Date getStartTime() {
		return startTime;
	}
	
	public Date getEndTime() {
		return endTime;
	}
}