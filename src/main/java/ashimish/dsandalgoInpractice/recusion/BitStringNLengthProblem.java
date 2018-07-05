package ashimish.dsandalgoInpractice.recusion;

import java.util.ArrayList;
import java.util.List;

public class BitStringNLengthProblem 
{
	private int array[]=null;

	public void printBinaryOfNLength(int n)
	{
		//Initialization case 
		array= new int [n];	
		//Initialization case 
		printBinaryOfNLengthUtil(n);
	}
	
	private  void printBinaryOfNLengthUtil(int n)
	{
		//Base Case 
		if(n<1)
		{
			for(int e:array)
			{
				System.out.print(" "+e);
			}
			System.out.println();
			return;
		}
		array[n-1]=0;
		printBinaryOfNLengthUtil(n-1);
		array[n-1]=1;
		printBinaryOfNLengthUtil(n-1);
	}
	
	public List<String> getListOfAllPossibleBinaryStringOfLengthN(int n)
	{
		List<String> result= new ArrayList<String>();
		printBinaryOfNLengthUtil(n,result);
		return result;
	}
	
	private  void printBinaryOfNLengthUtil(int n,List<String> result)
	{
		//Initialization case 
		if(array==null || n>=array.length)
		{
			array= new int [n];
		}
		//Base Case 
		if(n<1)
		{
			StringBuilder stringBuilder= new StringBuilder();
			for(int e:array)
			{
				stringBuilder.append(e);
			}
			result.add(stringBuilder.toString());
			return;
		}
		array[n-1]=0;
		printBinaryOfNLengthUtil(n-1,result);
		array[n-1]=1;
		printBinaryOfNLengthUtil(n-1,result);	
	}
}
