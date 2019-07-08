/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.LinkedList;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Intersection {
    public ListNode<Integer> getIntersectionNode(ListNode<Integer> headA, ListNode<Integer> headB) {
        int lenA = length(headA), lenB = length(headB);
        // move headA and headB to the same start point
        while (lenA > lenB) {
            headA = headA.getNext();
            lenA--;
        }
        while (lenA < lenB) {
            headB = headB.getNext();
            lenB--;
        }
        // find the intersection until end
        while (headA != headB) {
            headA = headA.getNext();
            headB = headB.getNext();
        }
        log.info("Returning: "+(headA == null ? null : headA.getVal()));
        return headA;
    }

    private int length(ListNode<Integer> node) {
        int length = 0;
        while (node != null) {
            node = node.getNext();
            length++;
        }
        return length;
    }
}
