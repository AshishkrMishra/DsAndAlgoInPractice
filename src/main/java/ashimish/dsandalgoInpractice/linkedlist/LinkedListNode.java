package ashimish.dsandalgoInpractice.linkedlist;
/**
 * LinkedListNode - It is Generic class with represent Node for LinkedList 
 * @author Ashish Kr Mishra  
 * @email (er.ashish.kr.mishra@gmail.com)
 * @param <T>
 */
public class LinkedListNode <T>
{
	private T data ;
	
	private LinkedListNode<T> nextNode;
	
	public LinkedListNode(T data )
	{
		this.data=data;
		nextNode=null;
	}
	
	public LinkedListNode(T data ,LinkedListNode<T> nextNode)
	{
		this.data=data;
		this.nextNode=nextNode;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public LinkedListNode<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(LinkedListNode<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	public void addNextElement(LinkedListNode<T> nextNode)
	{
		setNextNode(nextNode);
	}
	
	
}
