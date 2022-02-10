/**
 * Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
 *
 * Example 1:
    Input: nums = [1,1,1], k = 2
    Output: 2

 * Example 2:
    Input: nums = [1,2,3], k = 3
    Output: 2
 */

fun main() {
    println("subarraySum: " + subarraySum(intArrayOf(1, 1, 1), 2))
    println("subarraySum: " + subarraySum(intArrayOf(1, 2, 3), 3))
    println("subarraySum: " + subarraySum(intArrayOf(1, -1, 0), 0))
}

fun subarraySum(nums: IntArray, diff: Int): Int {
    var count = 0
    nums.forEachIndexed { index, i ->
        var sum = 0
        for (j in index until nums.size) {
            sum += nums[j]
            if (sum == diff) {
                count++
            }
        }
    }
    return count
}

