package ashimish.dsandalgoInpractice.graph;

import java.util.LinkedList;
import java.util.Objects;

/**
 * CFG := This class Represent Simple Implementation of Adjacent Graph
 * @author Ashish Kr Mishra
 * @email (er.ashish.kr.mishra@gmail.com)
 */
public class CFG {

	/**
	 * Graph - Represent Graph Data Structure
	 * 
	 * @author Ashish Kr Mishra
	 * @email (er.ashish.kr.mishra@gmail.com)
	 */
	public static class Graph {
		/**
		 * noOfVertex - No of Node in Graph
		 */
		int noOfVertex;
		/**
		 * adjusentNodeList maintain list adjacent node in Graph
		 */
		private LinkedList<Integer> adjusentNodeList[];

		@SuppressWarnings("unchecked")
		public Graph(final int noOfVertex) {
			if (noOfVertex < 0) {
				throw new IllegalArgumentException("No Vertex Cann't be Negative");
			}
			this.noOfVertex = noOfVertex;
			adjusentNodeList = new LinkedList[noOfVertex];
			for (int index = 0; index < noOfVertex; index++) {
				adjusentNodeList[index] = new LinkedList<Integer>();
			}
		}
	}

	/**
	 * addEdge - Add New Edge in Graph
	 * 
	 * @param graph
	 * @param fromIndex
	 * @param toIndex
	 */
	public static void addEdge(Graph graph, int fromIndex, int toIndex) {
		Objects.requireNonNull(graph);
		if (fromIndex < 0 || toIndex < 0 || fromIndex >= graph.noOfVertex || toIndex >= graph.noOfVertex) {
			throw new IllegalArgumentException("Index given is Wrong");
		}
		graph.adjusentNodeList[fromIndex].add(toIndex);
		graph.adjusentNodeList[toIndex].add(fromIndex);
	}

	/**
	 * printGraph - print Graph
	 * 
	 * @param graph
	 */
	public static void printGraph(Graph graph) {
		if (Objects.isNull(graph)) {
			System.out.println("Graph is Null");
			return;
		}
		System.out.println("Printing Graph...");
		for (int index = 0; index < graph.noOfVertex; index++) {
			System.out.println("Node:=" + index + " AdjusentNode are :: " + graph.adjusentNodeList[index]);
		}
	}

	/**
	 * printEdges - Print Edges of Graph
	 * 
	 * @param graph
	 */
	public static void printEdges(Graph graph) {
		if (Objects.isNull(graph)) {
			System.out.println("Graph is Null");
			return;
		}
		System.out.println("Printing Edges ...");
		for (int index = 0; index < graph.noOfVertex; index++) {
			int fromNode = index;
			for (int toNode : graph.adjusentNodeList[index]) {
				System.out.println("Edge:= [" + fromNode + "," + toNode + "]");
			}
		}
	}

	public static void main(String[] args) {

		Graph graph = new Graph(5);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);
		printGraph(graph);
		printEdges(graph);
	}

}
