package com.logicalProgram;

public class StopWatch {
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	 static int u;
	//to start timer
	public void start()
	{
		startTimer=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTimer);
	}
	
	// to stop timer
	public void stop()
	{
		stopTimer=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTimer);
	}
	
	public void getElapsedTime()
	{
		elapsed=stopTimer-startTimer;
		//return elapsed;
		System.out.println("elaspsed Time is: "+elapsed/1000);
		
	}
	
	public static void main(String[] args) throws Exception
	{
		
		StopWatch sw=new StopWatch();
		System.out.println("Press '1' to Start Time: ");
		Utility.getuserint();
		sw.start();

		System.out.println();
		System.out.println("Press '2' to Stop Time: ");
		  Utility.getuserint();		
		sw.stop();

		sw.getElapsedTime();
	}
}
