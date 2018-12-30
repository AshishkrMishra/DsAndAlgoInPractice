package ashimish.dsandalgoInpractice.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestLinkedListSizeMethod 
{

	public LinkedList<Integer> linkedList=null;
	
	@Before
	public void before()
	{
		LinkedListNode<Integer> headNode= new LinkedListNode<Integer>(1);
		headNode.setNextNode(new LinkedListNode<Integer>(2));
		headNode.getNextNode().
		setNextNode(new LinkedListNode<Integer>(3));
		linkedList= new LinkedList<Integer>(headNode);
	}
	
	
	@Test
	public void print()
	{
		linkedList.print();
	}
	
	@Test
	public void testSizeMethod()
	{
		linkedList.print();
		assertEquals(3,linkedList.size());
	}
}
