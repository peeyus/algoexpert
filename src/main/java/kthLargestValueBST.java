import java.util.*;

public class kthLargestValueBST {
    static class BST {
        public int value;
        public BST left = null;
        public BST right = null;

        public BST(int value) {
            this.value = value;
        }
    }

    public int findKthLargestValueInBst(BST tree, int k) {
        ArrayList<Integer> inorder = new ArrayList<Integer>();
        inOrder(tree, inorder);
        int len = inorder.size();

        return inorder.get(len - k);
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
