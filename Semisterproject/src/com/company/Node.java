package com.company;

public class Node{ // this class is responsible for the logic behind Nodes and will be used in main for most methods
    int data;
    Node left;
    Node right;

    public Node(int data){
        //Assign data to the new node, set left and right children to null
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

