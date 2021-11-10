import java.util.*;

public class KthLargestBstF {
  // This is an input class. Do not edit.
  static class BST {
    public int value;
    public BST left = null;
    public BST right = null;

    public BST(int value) {
      this.value = value;
    }
  }

    public int findKthLargestValueInBst(BST tree, int k) {
        // Write your code here.
        // ArrayList<Integer> inorder = new ArrayList<Integer>();
        // inOrder(tree, inorder);
        // int len = inorder.size();
        // ArrayList<Integer> reverseOrder = new ArrayList<>();
        int[] result = {-1};
        int[] index = {k};
        reverseInOrder(tree, index, result);
        return result[0];
        // System.out.println("Printing reverse in order "+ reverseOrder.toString());
        // return inorder.get(len - k);
    }

    public void inOrder(BST tree, ArrayList<Integer> result){
        if(tree != null){
            if(tree.left != null)
                inOrder(tree.left, result);
            result.add(tree.value);
            if(tree.right != null)
                inOrder(tree.right, result);
        }
    }
    public void reverseInOrder(BST tree, int[] index, int[] result){
      // System.out.println("Current state \t k = "+index[0]+ " and node = "+tree.value);

      if(tree != null)
      {
        if(tree.right != null)
          reverseInOrder(tree.right, index, result);
        // result.add(tree.value);
        index[0]--;
        if(index[0] == 0){
          result[0] = tree.value;
          return;
        }  
        if(tree.left != null)
          reverseInOrder(tree.left, index, result);  

      }

    }

}
