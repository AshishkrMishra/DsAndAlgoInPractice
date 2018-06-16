package ashimish.dsandalgoInpractice.iterattivevsrecusive;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author Ashish Kr Mishra  
 * @email (er.ashish.kr.mishra@gmail.com)
 */
public class TowerOfHanoiItrVsRecusive 
{
	/**
	 * solveTowerOfHanoiUsingRecur - Algo For this Problem will be as Below 
	 * Lets Name TOWER As BEG AUX and END 
	 * when we want to move disk from BEG to END 
	 * we can't move directly as we have to maintain Canonical shape of it 
	 * So we divide problem in small step 
	 * Suppose if we move n-1 disk from BEG tower to AUX than only we can me bigest disk from BEG tower to END 
	 * So Our Alog will be 
	 * STEP 1.) Move n-1 disk from BEG to AUX tower 
	 * STEP 2.) Move nth disk (biggest disk ) from BEG to END.
	 * STEP 3.) Move n-1 disk from AUX tower to END tower using  BEG tower 
	 * So by using above recusive step we can solve problem
	 * @param nofDisk
	 * @param fromTower
	 * @param auxilary
	 * @param endTower
	 * @return
	 * @throws InvalidParameterException
	 */
	public List<String>  solveTowerOfHanoiUsingRecur(int nofDisk, String  fromTower,String auxilary,String endTower) throws InvalidParameterException
	{
		List<String> result= new ArrayList<String>();
		if(nofDisk<0)
		{
			throw new InvalidParameterException("No Of Disk Cann't be Negative");
		}
		solveTowerOfHanoiUsingRecurUtil(nofDisk, fromTower, auxilary, endTower, result);
		return result;
	}
	
	
	private  void   solveTowerOfHanoiUsingRecurUtil(int nofDisk, String  fromTower,String auxilary,String endTower,List<String> result) throws InvalidParameterException
	{
		StringBuffer step= new StringBuffer();
		if(nofDisk==1)
		{
			step.append(fromTower)
			.append("->")
			.append(endTower);
			result.add(step.toString());
			return ;
		}
		solveTowerOfHanoiUsingRecurUtil(nofDisk-1, fromTower, endTower,auxilary, result);
		solveTowerOfHanoiUsingRecurUtil(1, fromTower,auxilary, endTower, result);
		solveTowerOfHanoiUsingRecurUtil(nofDisk-1, auxilary, fromTower,endTower, result);
	}

}
