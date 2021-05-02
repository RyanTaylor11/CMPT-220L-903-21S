package com.company;



import java.util.Scanner;

class Node
{
    int data;
    Node left;
    Node right;

    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class Main {

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node insert(Node root, int key) {

        if (root == null) {
            return new Node(key);
        }


        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {

            root.right = insert(root.right, key);
        }

        return root;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");

        n = sc.nextInt();

        int[] keys = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {

            keys[i] = sc.nextInt();
        }

        Node root = null;
        for (int key : keys) {
            root = insert(root, key);
        }

        int num;
        inorder(root); // THis section wil take in an number that the user wants to find. It will then tell the user how many times it appeared.
        int find = 0;
        System.out.println("Enter the variable you want to find the number of times it appeared:");

        num = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (keys[i] == num) {
                find++;
            }
        }
        System.out.println("Number of Occurrence of the Element:" + find);
        Search i = new Search();
        System.out.println("Tree Height: " + i.Search(root));
        System.out.println("Minimum value of BST is " + i.minvalue(root));
        System.out.println("Max value of BST is " + i.maxvalue(root));


    }


}
