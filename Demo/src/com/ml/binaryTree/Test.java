package com.ml.binaryTree;

public class Test {

	public static void main(String[] args) {
		//����һ��������
		Node node5 = new Node(5, null, null);
		Node node4 = new Node(4, null, node5);
		
		Node node3 = new Node(3, null, null);
		Node node7 = new Node(7, null, null);
		Node node6 = new Node(6, null, node7);
		
		Node node2 = new Node(2, node3, node6);
		
		Node node1 = new Node(1,node4,node2);
		
		BinaryTree  btree = new LinkedBinaryTree(node1);
		//BinaryTree  btree = new LinkedBinaryTree();
		
/*		//�ж϶������Ƿ�Ϊ��
		System.out.println(btree.isEmpty());
		
		//��������ݹ�  1  4  5  2  3  6  7
		System.out.println("�������");
		btree.preOrderTraverse();
		System.out.println();
		
		//��������ݹ�  4  5  1  3  2  6  7
		btree.inOrderTraverse();
		
		//��������ݹ�  5  4  3  7  6  2  1 
		btree.postOrderTraverse();
		
		
		//��������ǵݹ飨����ջ�� 4  5  1  3  2  6  7
		btree.inOrderByStack();
		
		//���ղ�α������������У�  1  4  2  5  3  6  7
		btree.levelOrderByStack();
		
		
		//�ڶ������в���ĳ��ֵ
		System.out.println(btree.findKey(1));
		
		//�������ĸ߶�
		System.out.println(btree.getHeight());
		
		//�������Ľ������
		System.out.println(btree.size());
*/
		
		
//		int size = btree.size();
//		System.out.println(size);
		int height = btree.getHeight();
		System.out.println(height);
	}

}