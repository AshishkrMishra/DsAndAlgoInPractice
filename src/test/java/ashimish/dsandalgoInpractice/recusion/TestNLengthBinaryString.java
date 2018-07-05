package ashimish.dsandalgoInpractice.recusion;

import static org.junit.Assert.assertArrayEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestNLengthBinaryString 
{
	BitStringNLengthProblem bitStringNLengthProblem=null;
	
	@Before
	public void before()
	{
		bitStringNLengthProblem= new BitStringNLengthProblem();
	}
	
	@Test
	public void testPrintMethod()
	{
		System.out.println("For 3 length");
		bitStringNLengthProblem.printBinaryOfNLength(3);
		System.out.println("For 2 length");
		bitStringNLengthProblem.printBinaryOfNLength(2);
		System.out.println("For 3 length");
		bitStringNLengthProblem.printBinaryOfNLength(3);
	}
	
	@Test
	public void testListMethod()
	{
		String[] expected=new String [] {"00","10","01","11"};
		List<String> output= bitStringNLengthProblem.getListOfAllPossibleBinaryStringOfLengthN(2);
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
