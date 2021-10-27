package Tree;

public class BinaryTree {
	NodeTree root;
	public BinaryTree() {
		root = null;
	}
	// thêm giá trị
	public void add(int value) {
		root = add(root, value);
	}
	private NodeTree add(NodeTree root, int value) {
		if(root == null) {
			root = new NodeTree(value);
			root.left = root.right = null;
		}else if(root.info > value) 
			root.left  = add(root.left, value);
		else
			root.right = add(root.right, value);
		return root;
	}
	// hiển thị right node left
	public void printRNL() {
		printRNL(root);
	}
	private void printRNL(NodeTree root) {
		if(root == null) return;
		printRNL(root.right);
		System.out.print(root.info + " ");
		printRNL(root.left);
	}
	// hiển thị left node right
	public void printLNR() {
		printLNR(root);
	}
	private void printLNR(NodeTree root) {
		if(root == null) return;
		printLNR(root.left);
		System.out.print(root.info + " ");
		printLNR(root.right);
	}
	public void printNRL() {
		printNRL(root);
	}
	// hiển tị node right left
	private void printNRL(NodeTree root) {
		if(root == null) return;
		System.out.print(root.info + " ");
		printNRL(root.right);
		printNRL(root.left);
	}
	// tính tổng các nút trên cây
	private int sumBST (NodeTree root){
        if(root == null ) return 0;
        else return root.info + sumBST(root.left) + sumBST(root.right);
    } 
    public void sumBST(){
        System.out.println(sumBST(root));
    }
    // tính tổng giá trị lẽ
    private int odd(NodeTree root) {
    	if(root == null) return 0;
    	else if(root.info % 2 != 0)
    		return odd(root.left) + odd(root.right) + 1;
        else
            return odd(root.left) + odd(root.right) ; 
    }
    public void odd() {
    	System.out.println(odd(root));
    }
    // hiển thị các nút có giá trị chẵn và không chia hết cho 5
    private void oddeven(NodeTree root) {
    	if(root == null) return;
    	if(root.info % 2 == 0 && root.info % 3 == 0) {
    		System.out.print(root.info + " ");
    	}
    	oddeven(root.right);
    	oddeven(root.left);
    }
    public void oddeven() {
    	oddeven(root);
    }
	// đếm xem có bao nhiêu lá
	private int countNodes(NodeTree root){
	    if( root == null )return 0;
	    if( root.left == null && root.right == null ){
	        return countNodes(root.left) + countNodes(root.right) + 1;
	    }
	    return countNodes(root.left) + countNodes(root.right);
	}
	public void countNodes() {
		System.out.println(countNodes(root));
	}
}
