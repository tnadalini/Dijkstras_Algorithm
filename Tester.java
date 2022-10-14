public class Tester {

	public static void main(String[] args) {	
		
		Graph g = new Graph(9);
		
		//1's
		g.addEdge(1, 2, 9);
		g.addEdge(1, 6, 14);
		g.addEdge(1, 7, 15);
		
		//2's
		g.addEdge(2, 3, 24);
		
		//3's
		g.addEdge(3, 8, 19);
		g.addEdge(3, 5, 2);
		
		//4's
		g.addEdge(4, 3, 6);
		g.addEdge(4, 8, 6);


		//5's
		g.addEdge(5, 4, 11);
		g.addEdge(5, 8, 16);
		
		//6's
		g.addEdge(6, 3, 18);
		g.addEdge(6, 5, 30);
		g.addEdge(6, 7, 5);
		
		//7's
		g.addEdge(7, 8, 44);
		g.addEdge(7, 5, 20);
		
		int source = 1;
		
		// Calculate Dijkstra.
		g = dijkstra.dijkstrasAlgo(g.getVertex(source),g);	
		
		g.printAllPaths(g,source);

	}

}