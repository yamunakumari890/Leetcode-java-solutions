package LinkedList;

class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
    this.next = null;
  }
}

class AddtwoNo {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode current = dummy;

    int carry = 0;
    while(l1 != null ||  l2 != null || carry != 0) {
      int x = (l1 != null) ? l1.val : 0;
      int y = (l2 != null) ? l2.val : 0;

      int sum = x + y + carry;
      carry = sum / 10;

      current.next = new ListNode( sum % 10);
      current = current.next;

      if(l1 != null) l1=l1.next;
      if(l2 != null) l2=l2.next;
    }
   return dummy.next;
  }
} 
public class Main {
public static void main (String args[]) {
  ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

         AddtwoNo solver = new AddtwoNo();
        ListNode result = solver.addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next; 
        }
      }

}