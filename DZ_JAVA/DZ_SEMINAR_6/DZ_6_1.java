// Учитывая двоичного дерева, верните порядок обхода значений его узлов.

// пример

// Input: root = [1,null,2,3]
// Output: [1,2,3]

package DZ_JAVA.DZ_SEMINAR_6;

import java.util.ArrayList;
import java.util.List;

public class DZ_6_1 {
    public static void main(String[] args) {
        TreeNode tNode = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));
        System.out.println(preorderTraversal(tNode));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root != null) {
            list.add(root.val);
            list.addAll(preorderTraversal(root.left));
            list.addAll(preorderTraversal(root.right));
        }
        return list;
    }

    public void fillTree(TreeNode root, Integer in) {
        if (root == null) {
            root.val = in;
        } else if (root.left == null) {
            fillTree(root.left, in);
        } else {
            fillTree(root.right, in);
        }
    }
}