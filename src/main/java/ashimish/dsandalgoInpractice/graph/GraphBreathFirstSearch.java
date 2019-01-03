package ashimish.dsandalgoInpractice.graph;

import ashimish.dsandalgoInpractice.graph.pojo.AdjusentGraph;

public class GraphBreathFirstSearch 
{
	public static void main(String[] args) 
	{
		AdjusentGraph graph= new AdjusentGraph(4);
		graph.addEdge(0, 1); 
		graph.addEdge(0, 2); 
		graph.addEdge(1, 2); 
		graph.addEdge(2, 0); 
		graph.addEdge(2, 3); 
		graph.addEdge(3, 3);
		graph.doBFS(0);
		graph.doBFS(1);
		graph.doBFS(2);
		graph.doBFS(3);
	}

}
