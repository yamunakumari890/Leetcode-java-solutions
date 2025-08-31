package LinkedList;

class ListNode {
   int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeList {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2){
    ListNode dummy = new ListNode(-1);
    ListNode current = dummy;

    
    while(list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        current.next = list1;
        list1 = list1.next;
      } else {
        current.next = list2;
        list2 = list2.next;
      }
      current = current.next;
    }
    if (list1 != null){
      current.next = list1;
    } else {
      current.next = list2;
    }
    return dummy.next;
  }
  public void printList(ListNode head) {
    ListNode temp = head;
     while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
    MergeList obj = new MergeList();

     ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);


        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        
        ListNode merged = obj.mergeTwoLists(list1, list2);

      
        System.out.print("Merged List: ");
       obj.printList(merged);
  }
  
}
