package linkedlists;

public class RemoveKFromEnd {
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

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return head;
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode p1 = dummy;
		ListNode p2 = dummy;
		int counter = 0;

		while (counter <= n) {
			p1 = p1.next;
			counter++;
		}
		while (p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		p2.next = p2.next.next;
		return dummy.next;
	}
}
