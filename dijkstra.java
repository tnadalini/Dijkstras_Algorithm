//using LinkedList and PrioQueue
import java.util.*;

public class dijkstra
{
  	
	public static Graph dijkstrasAlgo(Vertex source,Graph g)
	{
		//Setting MAX VALUE
		for(Vertex v: g.getVertices())
		{
			v.setDistance(Integer.MAX_VALUE);
		}
		
		source.dist = 0;
		PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
		queue.add(source);
		
		while(!queue.isEmpty()) {
			
			Vertex node = queue.poll();
		
			for(Edge neighbour:node.neighbours) {
				
				if(neighbour.src.dist > node.dist + neighbour.weight) { //src = source (check Edge class)
					queue.remove(neighbour.src);
					neighbour.src.dist = node.dist + neighbour.weight;
					neighbour.src.path = new LinkedList<Vertex>(node.path);
					neighbour.src.path.add(node);
					queue.add(neighbour.src);					
				} //end if
			} //end for
		} //end while
		
		return g;
	}
	
} //end dijkstra