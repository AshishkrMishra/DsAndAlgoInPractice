package ashimish.dsandalgoInpractice.recusion;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllPossibleStringOfLengthN 
{
	

	private char array[]=null;
	private char inputCharatcers[]=null;

	public void printBinaryOfNLength(int n,char [] inputCharacters)
	{
		//Initialization case 
		array= new char [n];	
		this.inputCharatcers=inputCharacters;
		//Initialization case 
		printBinaryOfNLengthUtil(n);
	}
	
	private  void printBinaryOfNLengthUtil(int n)
	{
		//Base Case 
		if(n<1)
		{
			for(char e:array)
			{
				System.out.print(" "+e);
			}
			System.out.println();
			return;
		}
		for(int index=0;index<inputCharatcers.length;index++)
		{
			array[n-1]=inputCharatcers[index];
			printBinaryOfNLengthUtil(n-1);
		}
	}
	
	public List<String> getListOfAllPossibleBinaryStringOfLengthN(int n,char [] inputCharacters)
	{
		List<String> result= new ArrayList<String>();
		this.inputCharatcers=inputCharacters;
		generateBinaryOfNLengthUtil(n,result);
		return result;
	}
	
	private  void generateBinaryOfNLengthUtil(int n,List<String> result)
	{
		//Initialization case 
		if(array==null || n>=array.length)
		{
			array= new char [n];
		}
		//Base Case 
		if(n<1)
		{
			StringBuilder stringBuilder= new StringBuilder();
			for(char e:array)
			{
				stringBuilder.append(e);
			}
			result.add(stringBuilder.toString());
			return;
		}
		for(int index=0;index<inputCharatcers.length;index++)
		{
			array[n-1]=inputCharatcers[index];
			generateBinaryOfNLengthUtil(n-1,result);
		}
	}

}
