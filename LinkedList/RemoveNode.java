package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class RemoveNode {
  public ListNode removeNthFromend(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode fast = dummy;
    ListNode slow = dummy;

    for(int i=0; i<=n; i++) {
      fast = fast.next;
    }
    while (fast != null) {
      fast = fast.next;
      slow = slow.next;
    }
    slow.next = slow.next.next;
    return dummy.next;
  }
  public void printList(ListNode head) {
    ListNode temp= head;
    while (temp != null) {
      System.out.print(temp.val + " ");
      temp = temp.next;
    }
    System.out.println();

  }
  public static void main(String[] args) {
    RemoveNode obj = new RemoveNode();

    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        obj.printList(head);

        int n=2;
        head = obj.removeNthFromend(head, n);

        System.out.print("List after removing " + n + "th node from end: ");
        obj.printList(head);
  }
}
