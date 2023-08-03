public class BinarySearchTree {
	private Node root;

	private class Node {
		private int key;
		private Node left;
		private Node right;

		public Node(int key) {
			this.key = key;
			this.left = null;
			this.right = null;
		}
	}

	public BinarySearchTree() {
		root = null;
	}

	public boolean search(int key) {
		return search(root, key);
	}

	private boolean search(Node node, int key) {
		if (node == null) {
			return false;
		}
		if (key == node.key) {
			return true;
		} else if (key < node.key) {
			return search(node.left, key);
		} else {
			return search(node.right, key);
		}
	}

	public void insert(int key) {
		root = insert(root, key);
	}

	private Node insert(Node node, int key) {
		if (node == null) {
			return new Node(key);
		}
		if (key < node.key) {
			node.left = insert(node.left, key);
		} else if (key > node.key) {
			node.right = insert(node.right, key);
		}
		return node;
	}
	public void inorder() {
        inorder(root);
    }
    
    private void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.key + " ");
        inorder(node.right);
    }
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.inorder();
		System.out.println("");
		System.out.println(bst.search(5)); // true
		System.out.println(bst.search(2)); // false
	}
}
