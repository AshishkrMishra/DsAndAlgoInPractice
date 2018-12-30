package ashimish.dsandalgoInpractice.linkedlist;

/**
 * LinkedList - It will Represent LinkedList Data Structure and ADT(abstract data Type) for it 
 * @author Ashish Kr Mishra  
 * @email (er.ashish.kr.mishra@gmail.com)
 * @param <T>
 */
public class LinkedList <T>
{
	private LinkedListNode<T> headNode=null;
	
	public LinkedList(LinkedListNode<T> headNode)
	{
		this.headNode=headNode;
	}
	
	public int size()
	{
		int noOfNode=0;
		if(headNode==null)
		{
			return noOfNode;
		}
		LinkedListNode<T> current= this.headNode;
		while(current!=null)
		{
			noOfNode++;
			current=current.getNextNode();
		}
		return noOfNode;
	}
	
	public void  print()
	{
		if(headNode==null)
		{
			return ;
		}
		LinkedListNode<T> current= this.headNode;
		while(current!=null)
		{
			System.out.println(" "+current.getData()+"");
			current=current.getNextNode();
		}
	}
}
