//using ArrayList
import java.util.*;

public class Graph {
	
	private ArrayList<Vertex> vertices;
	
	public Graph(int num) { //num = number of vertices 
		vertices = new ArrayList<Vertex>(num);
		for (int i = 0; i < num; i++) {
			vertices.add(new Vertex(Integer.toString(i)));
		}
	}
	
	public void addEdge(int src, int dest, int weight) {
		Vertex s = vertices.get(src);
		Edge newEdge = new Edge(vertices.get(dest), weight);
		s.neighbours.add(newEdge);
	}
	
	public ArrayList<Vertex> getVertices() {
		return vertices;
	}
	
	public Vertex getVertex(int vert) {
		return vertices.get(vert);
	}
	
	public void printAllPaths(Graph g, int src) {
		
		for (Vertex v: g.getVertices()) {
			
			if (!v.toString().equals("0")) {
				int i = 0;
				System.out.print("Vertex " + g.getVertex(1).toString() + " to vertex " + v + ", ");
				
				for(Vertex path : v.path) {
					System.out.print(path + "->");
					i++;
				}
				
				if (i == 0) { //starting at origin, no paths available
					System.out.print(src + "->");
				}
				
				System.out.print("" + v + ", ");
				System.out.println("length " + v.dist);
				
			} //end if
		} //end for
		
	} //end printAllPaths

}
