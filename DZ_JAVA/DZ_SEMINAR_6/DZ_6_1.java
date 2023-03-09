// Учитывая двоичного дерева, верните порядок обхода значений его узлов.

// пример

// Input: root = [1,null,2,3]
// Output: [1,2,3]

package DZ_JAVA.DZ_SEMINAR_6;

public class DZ_6_1 {
    public static void main(String[] args) {
        
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


