/*
Given the head of a linked list, return the list after sorting it in ascending order.
Input: head = [4,2,1,3]
Output: [1,2,3,4]

Input: head = [-1,5,3,4,0]
Output: [-1,0,3,4,5]
*/

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun main(args: Array<String>) {
    val li0 = ListNode(4)

    val li1 = ListNode(2)
    li0.next = li1

    val li2 = ListNode(1)
    li1.next = li2


    val li3 = ListNode(3)
    li2.next = li3

    var result = sortList(li0)
    while (result != null) {
        println(result.`val`)
        result = result.next
    }
}

fun sortList(head: ListNode?): ListNode? {
    var currentNode = head
    var index: ListNode?
    var temp: Int
    if (head == null) return null
    while (currentNode != null) {
        index = currentNode.next
        while (index != null) {
            if (currentNode.`val` > index.`val`) {
                temp = currentNode.`val`
                currentNode.`val` = index.`val`
                index.`val` = temp
            }
            index = index.next
        }
        currentNode = currentNode.next
    }
    return head
}

