//ArrayList and LinkedList
import java.util.*;

public class Vertex implements Comparable<Vertex> {
	
	public final String name;
	public ArrayList<Edge> neighbours;
	public LinkedList<Vertex> path;
	public int dist;
	public Vertex previous;
	
	public Vertex (String name) {
		this.name = name;
		this.neighbours = new ArrayList<Edge>();
		this.path = new LinkedList<Vertex>();
	}
	
	public int compareTo(Vertex other) {
		return Double.compare(dist, other.dist);
	}
	
	public String toString() {
		return this.name;
	}
	
	public void setDistance(int dist) {
		this.dist = dist;
	}
	
}
