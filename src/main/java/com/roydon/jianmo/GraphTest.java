package com.roydon.jianmo;

/**
 * GraphTest
 *
 * @AUTHOR: roydon
 * @DATE: 2023/6/4
 **/
public class GraphTest {
    public static void main(String[] args) {
        //顶点集合
        String[] vertices = {"A", "B", "C", "D"};
        //创建一个顶点个数为4 的Graph
        AdjacencyMatrixGraph<String> graph = new AdjacencyMatrixGraph<>(vertices.length);
        //设置节点
        for (String vertex : vertices) {
            graph.putVertex(vertex);
        }
        //设置边
        graph.putEdge(0, 1, 4);
        graph.putEdge(0, 2, 3);
        graph.putEdge(0, 3, 7);
        graph.putEdge(1, 2, 5);
        graph.putEdge(3, 2, 6);
        //获得顶点
        System.out.println(graph.getVertex(1));
        //删除节点
        System.out.println(graph.removeVertex(1));
        System.out.println("graph.getVertices() = " + graph.getVertices());
        //获得边
        System.out.println(graph.getWeight(0, 2));
        //删除边
        System.out.println(graph.removeEdge(0, 2));
        System.out.println(graph.getWeight(0, 2));

    }
}
