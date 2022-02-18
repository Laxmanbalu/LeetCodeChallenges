class BinaryNode<Element>(
    val value: Element,
    var leftChild: BinaryNode<Element>? = null,
    var rightChild: BinaryNode<Element>? = null
) {
    fun preOrderTraversal() {
        performAction()
        leftChild?.preOrderTraversal()
        rightChild?.preOrderTraversal()
    }

    fun postOrderTraversal() {
        leftChild?.postOrderTraversal()
        rightChild?.postOrderTraversal()
        performAction()
    }

    fun inOrderTraversal() {
        leftChild?.inOrderTraversal()
        performAction()
        rightChild?.inOrderTraversal()
    }

    private fun performAction() {
        println("Visited Node with Value $value")
    }
}

fun main(args: Array<String>) {
    val zero = BinaryNode(0)
    val one = BinaryNode(1)
    val two = BinaryNode(2)
    val three = BinaryNode(3)
    val four = BinaryNode(4)
    val five = BinaryNode(5)

    three.leftChild = four
    three.rightChild = five
    four.leftChild = zero
    four.rightChild = one
    five.leftChild = two

//    three.preOrderTraversal()
    three.inOrderTraversal()
}




