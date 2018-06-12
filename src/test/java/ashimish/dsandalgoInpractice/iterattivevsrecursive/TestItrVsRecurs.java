package ashimish.dsandalgoInpractice.iterattivevsrecursive;

import org.junit.Before;
import org.junit.Test;

import ashimish.dsandalgoInpractice.constants.ProblemSolvingApproach;
import ashimish.dsandalgoInpractice.iterattivevsrecusive.FactorialIterativeVsRecusive;
import ashimish.test.objects.CompareResult;
import ashimish.test.utils.CompareRunOfTwoMethods;

public class TestItrVsRecurs 
{
	
	FactorialIterativeVsRecusive factorialIterativeVsRecusive;
	
	@Before
	public void before()
	{
		factorialIterativeVsRecusive= new FactorialIterativeVsRecusive();
	}
	
	public void testSameMethod() throws Exception
	{
		@SuppressWarnings("rawtypes")
		Class[] paramType= {int.class,ProblemSolvingApproach.class};
		int value=1000;
		Object[] args1= {value,ProblemSolvingApproach.ITERATTIVE};
		Object[] args2= {value,ProblemSolvingApproach.RECURSIVE};
		try
		{
			CompareResult result = CompareRunOfTwoMethods.compareExecutionOfMethodsHavingParamType(factorialIterativeVsRecusive,
					"factorialOf",paramType, args1, factorialIterativeVsRecusive, "factorialOf",paramType ,args2);
			System.out.println(result.toString());
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.flush();
			System.out.println(e.getMessage());
			throw e;
		}
	}
	
	public void test() throws Exception
	{
		@SuppressWarnings("rawtypes")
		Class[] paramType= {int.class};
		int value=900;
		Object[] args= {value};
		try
		{
			CompareResult result = CompareRunOfTwoMethods.compareExecutionOfMethodsHavingParamType(factorialIterativeVsRecusive,
					"factorialByItrWay",paramType, args, factorialIterativeVsRecusive, "factorialByRecurvWay",paramType ,args);
			System.out.println(result.toString());
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.flush();
			System.out.println(e.getMessage());
			throw e;
		}
	}
	/**
	 * We will increase the size of n and see how itr vs recursv works 
	 * @throws Exception
	 * Conclusion :- We can predict in this case which one is taking more time 
	 * But one thing is clear that recursive way is not working for higher n .
	 * After some point it start failing for each every given n 
	 * 
	 * 
	 * Integer Value	Itr Way(in ms)	Recursv Way(in ms)
			{39283} 		{0}		{0}
			{39284} 		{0}		{0}
			{39285} 		{0}		{0}
			{39286} 		{0}		{0}
			{39287} 		{0}		{0}
			{39288} 		{0}		{0}
			{39289} 		{0}		{0}
			{39290} 		{0}		{0}
			{39291} 		{1}		{0}
			{39292} 		{0}		{0}
			{39293} 		{0}		{1}
			{39294} 		{0}		{0}
			{39295} 		{0}		{0}
			{39296} 		{0}		{0}
			{39297} 		{0}		{0}
			{39313} 		{0}		{0}
			{39314} 		{0}		{0}
			{39315} 		{0}		{0}
			{39316} 		{0}		{0}
			{39317} 		{0}		{0}
			{39318} 		{0}		{0}
			{39319} 		{0}		{0}
			{39320} 		{0}		{0}
			{39321} 		{1}		{0}
			{39322} 		{0}		{0}
			{39323} 		{0}		{0}
			{39324} 		{0}		{0}
			{39325} 		{0}		{0}
			{39326} 		{0}		{0}
			{39327} 		{0}		{0}
			{39328} 		{0}		{1}
			{39329} 		{0}		{0}
			{39347} 		{0}		{0}
			{39348} 		{0}		{0}
			{39349} 		{1}		{0}
			{39350} 		{0}		{0}
			{39351} 		{0}		{1}
			{39352} 		{0}		{0}
			{39353} 		{0}		{0}
			{39354} 		{0}		{0}
			{39355} 		{0}		{FAILED}
			{39356} 		{0}		{FAILED}
			{39357} 		{0}		{FAILED}
			{39358} 		{0}		{FAILED}
			{39359} 		{0}		{FAILED}
			{39360} 		{0}		{FAILED}
			{39361} 		{0}		{FAILED}
			{39362} 		{0}		{FAILED}
			{39363} 		{0}		{FAILED}
			{39364} 		{0}		{FAILED}

	 */
	@Test
	public void testEachMethod() throws Exception
	{
		@SuppressWarnings("rawtypes")
		Class[] paramType= {int.class};
		int noOfSample=40350;
		try
		{
			System.out.printf("Integer Value\tItr Way(in ms)\tRecursv Way(in ms)\n");
			for(int i=39000;i<=noOfSample;i++ )
			{
				Object[] args= {i};
				long itrWayTiming = -1;
				try {
					
					itrWayTiming=CompareRunOfTwoMethods.executeMethodWithPrimitiveType(factorialIterativeVsRecusive,
							"factorialByItrWay", paramType, args);
				}catch(Exception e)
				{
					
				}
						
				long recusiveWayTiming = -1;
				try {
					recusiveWayTiming=CompareRunOfTwoMethods.executeMethodWithPrimitiveType(
							factorialIterativeVsRecusive, "factorialByRecurvWay", paramType, args);
					
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
