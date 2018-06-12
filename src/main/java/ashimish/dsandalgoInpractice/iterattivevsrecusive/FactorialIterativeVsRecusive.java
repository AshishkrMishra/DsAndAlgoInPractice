package ashimish.dsandalgoInpractice.iterattivevsrecusive;

import ashimish.dsandalgoInpractice.constants.ProblemSolvingApproach;

public class FactorialIterativeVsRecusive 
{	
	public  int factorialOf(int n,ProblemSolvingApproach approach)
	{
		switch (approach) {
		case ITERATTIVE:
			return factorialByItrWay(n);
		case RECURSIVE:
			return factorialByRecurvWay(n);
		default:
			return factorialByItrWay(n);
		}

	}
	
	/**
	 * factorialByItrWay -Calculate Factorial Using Iterative Way
	 * @param n
	 * @return
	 */
	public int factorialByItrWay(int n)
	{
		int result = 1;
		if (n == 0 || n == 1) {
			return 1;
		}
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	/**
	 * factorialByRecurvWay -Calculate Factorial Using recusrive  Way
	 * @param n
	 * @return
	 */
	public  int factorialByRecurvWay(int n)
	{
		if(n==0||n==1)
		{
			return 1;
		}
		return n* factorialByRecurvWay(n-1);
	}
	
}
