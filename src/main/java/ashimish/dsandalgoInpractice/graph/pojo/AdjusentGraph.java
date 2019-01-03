package ashimish.dsandalgoInpractice.graph.pojo;

import java.util.LinkedList;
import java.util.Objects;

public class AdjusentGraph 
{
	private int noOfVertex=0;
	private LinkedList<Integer> adjusentVertexList [] =null;
	@SuppressWarnings("unchecked")
	public AdjusentGraph(final int noOfVertex)
	{
		if(noOfVertex<0)
		{
			 throw new IllegalArgumentException("No Of Vertex in Graph cann't be Negative ");
		}
		this.noOfVertex=noOfVertex;
		adjusentVertexList= new LinkedList[noOfVertex];
		for(int vertex=0;vertex<noOfVertex;vertex++)
		{
			adjusentVertexList[vertex]= new LinkedList<Integer>();
		}
	}
	
	public void addEdge(final int fromNode , final int toNode)
	{
		if(!(isValidNode(fromNode) && isValidNode(fromNode)) )
		{
			throw new IllegalArgumentException("Node for given Edge is Invalid");
		}
		adjusentVertexList[fromNode].add(toNode);
		adjusentVertexList[toNode].add(fromNode);
		
	}
	
	public boolean isGraphEmpty()
	{
		return Objects.isNull(adjusentVertexList);
	}
	
	public void doBFS(int startNode)
	{
		if(isGraphEmpty())
		{
			System.out.println("Graph is Empty");
		}
		if(!isValidNode(startNode))
		{
			throw new IllegalArgumentException("StartNode index is Wrong");
		}
		boolean [] visitedNode= new boolean[noOfVertex];
		doBFSUtil(visitedNode,startNode);
		System.out.println();
		
	}
	public void doBFSUtil(boolean [] visitedNode ,int currenNode)
	{
		if(isNodeVisited(visitedNode, currenNode))
		{
			return ;
		}
		//Mark Node Visited
		visitedNode[currenNode]=true;
		System.out.print(currenNode+" ");
		for(int nextNode:adjusentVertexList[currenNode])
		{
			doBFSUtil(visitedNode, nextNode);
		}
	}
	
	private boolean isNodeVisited(boolean [] visitedNode ,int currenNode)
	{
		return visitedNode[currenNode];
	}
	
	private boolean isValidNode(int inputNode)
	{
		if(inputNode<0 || inputNode>=noOfVertex)
		{
			return false;
		}
		return true;
	}
}
