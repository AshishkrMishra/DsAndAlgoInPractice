package ashimish.test.objects;

public class CompareResult 
{
	private String qualitifedMethodOne;
	private String qualifiedMethodTwo;
	private long timeTakenByMethodOne;
	private long timeTakenByMethodTwo;
	private String result="Both took Equal Time";
	
	public CompareResult(String qualitifedMethodOne,String qualifiedMethodTwo,long timeTakenByMethodOne,long timeTakenByMethodTwo)
	{
		this.qualitifedMethodOne=qualitifedMethodOne;
		this.qualifiedMethodTwo=qualifiedMethodTwo;
		this.timeTakenByMethodOne=timeTakenByMethodOne;
		this.timeTakenByMethodTwo=timeTakenByMethodTwo;
		if(timeTakenByMethodOne==timeTakenByMethodTwo)
		{
			result="MethodOne := "+this.qualitifedMethodOne +" and methodTwo:= "+this.qualifiedMethodTwo+" Took Same Time ";
		}
		if(timeTakenByMethodOne>timeTakenByMethodTwo)
		{
			result="Method :="+ this.qualitifedMethodOne+" took more time ";
		}
		else
		{
			result="Method :="+ this.qualifiedMethodTwo+" took more time ";
		}
			
	}
	
	public long  getTimeDifference()
	{
		return Math.abs(timeTakenByMethodOne-timeTakenByMethodTwo);
	}
	public String getNameOfMethodTookMoreTime()
	{
		return result;
	}

	@Override
	public String toString() {
		return "CompareResult [qualitifedMethodOne=" + qualitifedMethodOne + ", qualifiedMethodTwo="
				+ qualifiedMethodTwo + ", timeTakenByMethodOne=" + timeTakenByMethodOne + ", timeTakenByMethodTwo="
				+ timeTakenByMethodTwo + ", result=" + result + "]";
	}
	
	
}
