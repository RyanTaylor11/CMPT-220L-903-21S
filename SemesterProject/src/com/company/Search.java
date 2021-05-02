package com.company;

public class Search {
    private Node root;

    public int Search(Node root) {
        if (root == null) return 0;
        return (1 + Math.max(Search(root.left), Search(root.right)));


    }

    static int findMax(Node node) {
        if (node == null)
            return Integer.MIN_VALUE;

        int side = node.data;
        int lside = findMax(node.left);
        int rside = findMax(node.right);

        if (lside > side) // determines if the left side is larger then the right
            side = lside;
        if (rside > side)
            side = rside;
        return side;
    }

    int minvalue(Node node) { // displays smallest value
        Node current = node;

        while (current.left != null) {
            current = current.left;
        }
        return (current.data);
    }

    int maxvalue(Node node) { // displays max value
        Node current = node;

        while (current.right != null) {
            current = current.right;
        }
        return (current.data);
    }
}