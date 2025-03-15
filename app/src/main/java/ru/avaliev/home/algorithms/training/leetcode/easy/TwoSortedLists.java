package ru.avaliev.home.algorithms.training.leetcode.easy;

import java.util.List;

public class TwoSortedLists {

    public static void main(String[] args) {
        var list1 = getList(List.of(1, 2, 4));
        var list2 = getList(List.of(1, 3, 4));
        var result = mergeTwoLists(list1, list2);
        System.out.println(result);
    }


    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode list = null;
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val <= l2.val) {
            list = l1;
            l1 = l1.next;
        } else {
            list = l2;
            l2 = l2.next;
        }
        var lp = list;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                lp.next = l1;
                l1 = l1.next;
            } else {
                lp.next = l2;
                l2 = l2.next;
            }
            lp = lp.next;
        }
        while (l1 != null) {
            lp.next = l1;
            l1 = l1.next;
            lp = lp.next;
        }
        while (l2 != null) {
            lp.next = l2;
            l2 = l2.next;
            lp = lp.next;
        }
        return list;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static ListNode getList(List<Integer> list) {
        ListNode head = new ListNode();
        ListNode current = head;
        for (Integer val : list) {
            current = current.next = new ListNode(val);
        }
        return head.next;
    }
}
