package ashimish.dsandalgoInpractice.iterattivevsrecursive;

import static org.junit.Assert.assertTrue;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import ashimish.dsandalgoInpractice.iterattivevsrecusive.TowerOfHanoiItrVsRecusive;
/**
 * 
 * @author Ashish Kr Mishra  
 * @email (er.ashish.kr.mishra@gmail.com)
 */
public class TestTowerHanio 
{

	TowerOfHanoiItrVsRecusive  towerOfHanoiItrVsRecusive;
	
	@Before
	public void before()
	{
		towerOfHanoiItrVsRecusive= new TowerOfHanoiItrVsRecusive();
	}
	/**
	 * Case :- When some give Negative input to method
	 */
	@Test(expected=InvalidParameterException.class)
	public void testInValidInputCase()
	{
			towerOfHanoiItrVsRecusive.solveTowerOfHanoiUsingRecur(-3,"BEG","AUX","END");
	}
	
	/**
	 * Case :- Valid case matching the Expected Step VS Methods Output given by Method
	 */
	@Test
	public void test()
	{
		String resultStr="BEG->END BEG->AUX END->AUX BEG->END AUX->BEG AUX->END BEG->END";
		List<String> result= new ArrayList<String>();
		for(String str:resultStr.split(" "))
		{
			result.add(str.trim());
		}
		assertTrue(result.containsAll(towerOfHanoiItrVsRecusive.solveTowerOfHanoiUsingRecur(3,"BEG","AUX","END")));
	}
	
}
