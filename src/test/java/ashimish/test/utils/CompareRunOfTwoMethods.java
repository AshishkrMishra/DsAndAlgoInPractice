package ashimish.test.utils;

import java.lang.reflect.Method;
import java.util.Objects;

import ashimish.test.objects.CompareResult;

public class  CompareRunOfTwoMethods 
{
	
	public static CompareResult compareExecutionOfMethods(Object obj1,String m1,Object [] args1,Object obj2,String m2,Object[] args2) throws Exception
	{
		CompareResult  result= null;
		long firstMethodResult=CompareRunOfTwoMethods.executeMethod(obj1, m1, args1);
		long secondMethodResult=CompareRunOfTwoMethods.executeMethod(obj2, m2, args2);
		result= new CompareResult(m1, m2, firstMethodResult, secondMethodResult);
		return result;
	}
	
	@SuppressWarnings("rawtypes")
	public static CompareResult compareExecutionOfMethodsHavingParamType(Object obj1,String m1,Class[] paramType1,Object [] args1,Object obj2,String m2,Class[] paramType2,Object[] args2) throws Exception
	{
		CompareResult  result= null;
		long firstMethodResult=CompareRunOfTwoMethods.executeMethodWithPrimitiveType(obj1, m1, paramType1, args1);
		long secondMethodResult=CompareRunOfTwoMethods.executeMethodWithPrimitiveType(obj2, m2, paramType2,args2);
		result= new CompareResult(m1, m2, firstMethodResult, secondMethodResult);
		return result;
	}
	
	@SuppressWarnings("rawtypes")
	public static long executeMethod(Object obj,String m,Object[] args) throws Exception
	{
		Class [] paraMeters= {};
		if(Objects.nonNull(args) && args.length>0)
		{
			paraMeters= new Class [args.length];
			for(int i=0;i<args.length;i++)
			{
				paraMeters[i]=args[i].getClass();
			}
		}
		
		Method method=obj.getClass().getMethod(m, paraMeters);
		long startTime=System.currentTimeMillis();
		method.invoke(obj, args);
		long secondTime=System.currentTimeMillis();
		return secondTime-startTime;
	}
	
	
	@SuppressWarnings("rawtypes")
	public static long executeMethodWithPrimitiveType(Object obj,String m,Class[] paramType,Object[] args) throws Exception
	{	
		Method method=obj.getClass().getMethod(m, paramType);
		long startTime=System.currentTimeMillis();
		method.invoke(obj, args);
		long secondTime=System.currentTimeMillis();
		return secondTime-startTime;
	}
}
