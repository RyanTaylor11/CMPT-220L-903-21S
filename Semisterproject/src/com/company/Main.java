package com.company;


import java.util.Stack;

public class Main{
    public static Node root;

    public void add(int data) { // this function will add a value to the binary search tree via the .add command
        Node newNode = new Node(data);
        if(root == null){ // checks if this node will be the root.
            root = newNode;
            return;
        }
        else {
            Node current = root, parent = null; // if it is not the root it will then sort itself
            while(true) { // checks if the node is smaller
                parent = current;
                if(data < current.data) {
                    current = current.left;
                    if(current == null) {
                        parent.left = newNode;
                        return;
                    }
                }
                else { // check if the node is bigger
                    current = current.right;
                    if(current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }
    public boolean find(int id){ // this program will look for a value and return a true or false statement depending on whether that value is present in the Binary Search tree
        Node current = root;
        while(current!=null){
            if(current.data==id){
                return true; // returns true if found
            }else if(current.data>id){
                current = current.left;
            }else{
                current = current.right;
            }
        }
        return false; // returns false if node is not present
    }

    public int height(Node root) { // this function will determine the height of the tree by comparing both the left and right sides and responding with the larger value
        if (root == null) return 0;
        return (1 + Math.max(height(root.left), height(root.right))); // add + 1 to the hight in order to accound for the root
    }

    int minvalue(Node node) { // this node will find the min value by traversing down the left side of the tree till it find a node with no children left to its left
        Node current = node;

        while (current.left != null) { // keeps traversing left until it can't find a value
            current = current.left;
        }
        return (current.data); // returns that value
    }
    static int Maxvalue(Node node) { // Max is the opposite of min it will transferase the right until it find the last node with no children
        Node current = node;

        while (current.right != null) { // keep traversing right until it can't find a value
            current = current.right;
        }
        return (current.data); // returns that value
    }
    static Node nthlargest(Node root, int w) // this code will look for the nth largest element in the binary search tree
    {
        Node num = root;
        Node nth = null;
        int count = 0;

        while (num != null) // this is a counter to keep searching until the number = 0
        {
            if (num.right == null)
            {
                if (++count == w)
                    nth = num;
                num = num.left;
            }
            else // this will count to the left or right depending on where that nth largest node is located
            {
                Node child = num.right;
                while (child.left != null && child.left != num)
                    child = child.left;

                if (child.left == null)
                {
                    child.left = num;
                    num = num.right;
                }
                else
                {
                    child.left = null;
                    if (++count == w)
                        nth = num;
                    num = num.left;
                }
            }
        }
        return nth;
    }

    public Node minNode(Node root) { // this function will be used in a later method call delete node in order to determine if a node can be deleted without replacement.

        if (root.left != null) // this will be used later for delete node
            return minNode(root.left);

        else
            return root;
    }
    public Node deleteNode(Node node, int value) { // this function will delete a node and determine if it needs to be replaced in the tree and do it if required
        if(node == null){ // checks if the function has values
            return null;
        }
        else {
            if(value < node.data) // if the value is smaller then node traverse left
                node.left = deleteNode(node.left, value);
            else if(value > node.data) // if larger traverse right
                node.right = deleteNode(node.right, value);
            else {
                if(node.left == null && node.right == null) // finds node
                    node = null;
                else if(node.left == null) {
                    node = node.right;
                }
                else if(node.right == null) {
                    node = node.left;
                }

                else {
                    Node temp = minNode(node.right); // use the min Node command from earlier
                    node.data = temp.data;
                    node.right = deleteNode(node.right, temp.data);
                }
            }
            return node; // returns node
        }
    }

    public void inorderTraversal(Node node) { // this will allow you to see and use the binary search tree via an inorder format

        if(root == null){
            System.out.println("Tree is empty"); // this will check if the tree in empty and return a message
            return;
        }
        else {

            if(node.left!= null) // if not it will sort these value based on numerical order going down the left then right then up then right
                inorderTraversal(node.left);
            System.out.print(node.data + " ");
            if(node.right!= null)
                inorderTraversal(node.right);

        }
    }

    public void Postorder(Node node) // This will list the value in Postorder
    {
        if (node == null) // if empty return nothing
            return;
        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.data + " ");
    }

    void Preorder(Node node) // this will display the list in preorder
    {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        Preorder(node.left);
        Preorder(node.right);
    }
    void Postorder()  {     Postorder(root);  }
    void Preorder()   {     Preorder(root);  }

    public void Breathsetup(){ // this function is used to set up the breath
        int height = height(root); // takes the height of the tree
        for(int i = 0; i < height; i++){
            Breath(root, i);
        }
    }

    public void Breath(Node node, int line){ // this will do a breath first search of the binary search tree
        if(node == null){ // first checks if it is empty
            return;
        }
        if(line == 0){ // second finds the root
            System.out.print(node.data + " ");
        }else{
            Breath(node.left, line-1); // now it goes left to right on each line writing it in the traversal
            Breath(node.right, line-1);
        }
    }
    public void Deapth(Node root) {
        Stack<Node> a = new Stack<Node>(); // this will conduct a depth first search
        a.add(root);
        while (a.isEmpty() == false) { // checks if the list is empty
            Node g = a.pop(); // goes downt he complete left side then circles back right
            if(g.right!=null) a.add(g.right);
            if(g.left!=null) a.add(g.left);
            System.out.print(" " + g.data); // displays the data
        }
    }
    public static void main(String[] args) {
        Main end = new Main();
        //Add nodes to the binary tree
        // this is done through the end.add command and the number of value and the value them self can be changed
        end.add(50);
        end.add(5);
        end.add(30);
        end.add(10);
        end.add(100);
        end.add(67);
        end.add(74);
        end.add(32);
        end.add(80);
        System.out.println("\nthis is the binary search tree:"); // displays the binary search tree once all the elements are added
        end.inorderTraversal(end.root);
        System.out.println("\nCheck whether Node with value exists : " + end.find(4)); // this is where you can check if a node exists or not
        System.out.println("\nTree height: "+end.height(root)); // this will display the trees height
        System.out.println("\nMin value of BST is" + end.minvalue(root)); // this command finds the smallest value and displays it
        System.out.println("\nMax value of BST is " + end.Maxvalue(root)); // this command will display the findmax method which will find the largest value in the tree and display it
        System.out.println("\nFinding N-th largest Node in BST : " + nthlargest(root, 3).data); // this will display the nth largest interger depending on what number is next to root
        Node deletedNode = null;
        deletedNode = end.deleteNode(end.root, 10); // This command will delte a node from the binary search tree and reformat the binary search tree
        System.out.println("\nBinary search tree after removal of the node:"); // this displays the treee after the deltetion of the node
        end.inorderTraversal(end.root);
        System.out.println("\nInorder traversal of binary tree is ");end.inorderTraversal(end.root); // this will put the Binary search treee in order
        System.out.println("\nPreorder traversal of binary tree is "); end.Preorder(); // this will put the Binary Search Tree in preorder
        System.out.println("\nPostorder traversal of binary tree is ");end.Postorder(); //this will put the Binary Search tree in post order
        System.out.println("\nBreath first traversal: "); // this will display the search tree via a Breath first Search
        end.Breathsetup();
        System.out.println("");
        System.out.println("Depth-First-Search : "); // this will display the Depth first search
        end.Deapth(root);
    }
}

