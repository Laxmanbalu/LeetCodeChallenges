/**
 * Given an array of integers nums and an integer k, return the number of unique k-diff pairs in the array.

A k-diff pair is an integer pair (nums[i], nums[j]), where the following are true:

0 <= i < j < nums.length
|nums[i] - nums[j]| == k
Notice that |val| denotes the absolute value of val.
 */
fun main() {
    println("findPairs: " + findPairs(intArrayOf(1, 1, 1), 0))
    println("findPairs: " + findPairs(intArrayOf(3,1,4,1,5), 2))
    println("findPairs: " + findPairs(intArrayOf(1,2,3,4,5), 1))
}

fun findPairs(nums: IntArray, diff: Int): Int {
    val hashSet = HashSet<Int>()
    nums.sort()
    nums.forEachIndexed { index, value ->
        for (j in index + 1 until nums.size) {
            if (value - nums[j] == diff || nums[j] - value == diff) {
                hashSet.add(value)
            }
        }
    }
    return hashSet.size
}
