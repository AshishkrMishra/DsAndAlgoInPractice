package ashimish.dsandalgoInpractice.recusion;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestNLengthStringGenerator 
{
	GenerateAllPossibleStringOfLengthN generateAllPossibleStringOfLengthN=null;
	
	@Before
	public  void before()
	{
		generateAllPossibleStringOfLengthN= new GenerateAllPossibleStringOfLengthN();
	}
	
	@Test
	public void testPrintMethod()
	{
		char [] inputCharSet= new char[] {'A','B','C'};
		generateAllPossibleStringOfLengthN.printBinaryOfNLength(2, inputCharSet);
	}
	
	@Test
	public void testListMethod()
	{
		char [] inputCharSet= new char[] {'A','B','C'};
		String[] expected=new String [] {"AA","BA","CA","AB","BB","CB","AC","BC","CC"};
		List<String> output= generateAllPossibleStringOfLengthN.getListOfAllPossibleBinaryStringOfLengthN(2,inputCharSet);
		String [] actuall=new String[output.size()];
		if(!(actuall==null||actuall.length==0))
		{
			for(int i=0;i<output.size();i++)
			{
				actuall[i]=output.get(i);
			}
		}
		assertArrayEquals(expected, actuall);
	}
}
