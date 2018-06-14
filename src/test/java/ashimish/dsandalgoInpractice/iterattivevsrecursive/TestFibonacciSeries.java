package ashimish.dsandalgoInpractice.iterattivevsrecursive;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import ashimish.dsandalgoInpractice.iterattivevsrecusive.FibonacciIterativeVsRecusive;
import ashimish.test.utils.CompareRunOfTwoMethods;

public class TestFibonacciSeries 
{
	 FibonacciIterativeVsRecusive fibonacciIterativeVsRecusive;
	 
	 @Before
	 public void before()
	 {
		 fibonacciIterativeVsRecusive= new FibonacciIterativeVsRecusive();
	 }
	 
	@Test
	public void testItr() {
		int[] expecteds = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };
		int[] actuals = fibonacciIterativeVsRecusive.fibonacciByItrWay(10);
		assertArrayEquals(expecteds, actuals);

	}

	@Test
	public void testRcursive() {
		int[] expecteds = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };
		int[] actuals = fibonacciIterativeVsRecusive.fibonacciByRecurvWay(10);
		assertArrayEquals(expecteds, actuals);
	}
	
	@Test
	public void testEachMethod() throws Exception
	{
		@SuppressWarnings("rawtypes")
		Class[] paramType= {int.class};
		int noOfSample=13160;
		try
		{
			System.out.printf("Integer Value\tItr Way(in ms)\tRecursv Way(in ms)\n");
			for(int i=13000;i<=noOfSample;i++ )
			{
				Object[] args= {i};
				long itrWayTiming = -1;
				try {
					
					itrWayTiming=CompareRunOfTwoMethods.executeMethodWithPrimitiveType(fibonacciIterativeVsRecusive,
							"fibonacciByItrWay", paramType, args);
				}catch(Exception e)
				{
					
				}
						
				long recusiveWayTiming = -1;
				try {
					recusiveWayTiming=CompareRunOfTwoMethods.executeMethodWithPrimitiveType(
							fibonacciIterativeVsRecusive, "fibonacciByRecurvWay", paramType, args);
					
				}catch (Exception e)
				{
					
				}
				System.out.printf("{%d} \t\t{%s}\t\t{%s}\n",i,itrWayTiming==-1?"FAILED":String.valueOf(itrWayTiming),recusiveWayTiming==-1?"FAILED":String.valueOf(recusiveWayTiming));

			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.flush();
			System.out.println(e.getMessage());
			throw e;
		}
	}
}
