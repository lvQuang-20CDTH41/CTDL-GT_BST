package Tree;

public class MainApp {

	public static void main(String[] args) {
		BinaryTree bst = new BinaryTree();
		bst.add(40);
		bst.add(25);
		bst.add(10);
		bst.add(78);
		bst.add(32);
		bst.add(35);
		bst.add(323);
		bst.printLNR();
		System.out.println("\nTổng giá trị các nút: ");
		bst.sumBST();
		System.out.println("Số lá trên cây: ");
		bst.countNodes();
		System.out.println("Tổng số có giá trị lẽ trên cây: ");
		bst.odd();
		System.out.println("Các số chia hết cho 2 và 3: ");
		bst.oddeven();
	}
}
