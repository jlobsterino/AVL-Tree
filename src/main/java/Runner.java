public class Runner {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        System.out.println("Обход дерева (по возрастанию):");
        tree.inOrderTraversal(tree.root);

        System.out.println("\nПоиск элемента 30: " + tree.search(30));

        tree.delete(30);
        System.out.println("После удаления элемента 30:");
        tree.inOrderTraversal(tree.root);
    }
}
