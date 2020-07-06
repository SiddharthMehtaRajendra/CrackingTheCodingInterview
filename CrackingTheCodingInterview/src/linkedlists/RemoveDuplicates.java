package linkedlists;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public class ListNode {
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

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null)
			return head;
		ListNode curr = head;
		ListNode prev = null;
		Set<Integer> set = new HashSet<Integer>();

		while (curr != null) {
			int curVal = curr.val;
			if (set.contains(curVal)) {
				prev.next = curr.next;
			} else {
				set.add(curVal);
				prev = curr;
			}
			curr = curr.next;
		}
		return head;
	}
}
