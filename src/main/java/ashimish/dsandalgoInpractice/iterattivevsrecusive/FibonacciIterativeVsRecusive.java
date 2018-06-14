package ashimish.dsandalgoInpractice.iterattivevsrecusive;

import java.util.ArrayList;
import java.util.List;

public class FibonacciIterativeVsRecusive 
{
	
	/**
	 * fibonacciByItrWay -Calculate Fibonacci Using Iterative Way
	 * @return
	 * @param n
	 */
	public int []  fibonacciByItrWay(int n)
	{
		int result []  = new int [n];
		if(n==1)
		{
			return result;
		}
		result[1]=1;
		if(n==1)
		{
			
			return result;
		}
		int prev=0;
		int curnt=1;
		for (int i = 2; i <n; i++) 
		{
			int next=prev+curnt;
			prev=curnt;
			curnt=next;
			result[i]=next;
		}
		return result;
	}
	
	/**
	 * fibonacciByRecurvWay -Calculate Fibonacci Using recursive  Way
	 * @param n
	 * @return
	 */
	public  int []  fibonacciByRecurvWay(int n)
	{
		List<Integer> list=new ArrayList<Integer>();
		int [] array= new int [n];
		if(n==0)
		{
			return new int [] {0};
		}
		if(n==1)
		{
			return new int [] {0,1};
		}
		list.add(0);
		list.add(1);
		fibonacciByRecurvWayUtil(0,1,n, list);
		for(int index=0;index<list.size();index++)
		{
			array[index]=list.get(index);
		}
		return array;
	}
	
	/**
	 * fibonacciByRecurvWayUtil - Create Fibonacci series using recursive util method 
	 * @param prev
	 * @param current
	 * @param n
	 * @param values
	 */
	private void fibonacciByRecurvWayUtil(int prev,int current,int n ,List<Integer> values)
	{
		if(values.size()==n)
		{
			return ;
		}
		int next=prev+current;
		values.add(next);
		fibonacciByRecurvWayUtil(current, next, n, values);
	}
}
