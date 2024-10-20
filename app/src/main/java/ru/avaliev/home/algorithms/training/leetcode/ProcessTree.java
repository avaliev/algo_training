package ru.avaliev.home.algorithms.training.leetcode;

import java.util.List;
import java.util.Stack;

public class ProcessTree {


	public static void main(String[] args) {

		Process process = new Process();


	}

	List<TreeNode> nodesForShow;

	Stack<TreeNode> currentNotLeafNodes;
	/**
	 * показывает уровень который надо раскрыть.
	 *
	 * @return
	 */
	public List<TreeNode> getNodeForShow(TreeNode treeNode) {

		// проверить на наличие листьев
		TreeNode sible = treeNode;
		boolean hasLeafs = false;
		while (sible.nextSible != null) {
			nodesForShow.add(sible);
			if (sible.childs != null || sible.childs.isEmpty()) {
				hasLeafs = true;
			} else {
				currentNotLeafNodes.push(sible);
				sible = sible.nextSible;
			}
		}

		if (hasLeafs) {
			return nodesForShow;
		} else {
			TreeNode curNode = currentNotLeafNodes.pop();
			getNodeForShow(curNode);
		}


		return null;
	}

	public static class Process {
		TreeNode root;
	}

	public static class TreeNode {
		Object info;
		List<TreeNode> childs;
		// ссылка на брата справа. у рута null
		TreeNode nextSible;
	}
}
