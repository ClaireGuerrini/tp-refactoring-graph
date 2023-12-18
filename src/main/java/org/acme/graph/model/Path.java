package org.acme.graph.model;

import java.util.List;

public class Path {
	
	private List<Edge> edges;
	private double length;
	
	public Path(List<Edge> edges) {
		this.edges = edges;
		
		this.length = Double.NaN;
		this.length = this.getLength();
	}

	public List<Edge> getEdges() {
		return edges;
	}
	
	public double getLength() {
		if (Double.isNaN(length)) {
			length = 0;
			for (Edge edge : edges) {
				length += edge.getCost();
			}
		}
		
		return length;
	}
}
