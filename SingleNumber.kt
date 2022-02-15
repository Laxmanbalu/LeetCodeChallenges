/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 *
 * Example 1:
    Input: nums = [2,2,1]
    Output: 1

* Example 2:
    Input: nums = [4,1,2,1,2]
    Output: 4

* Example 3:
    Input: nums = [1]
    Output: 1
 */


fun main() {
    println("result:" + singleNumber(intArrayOf(2,2,1)))
    println("result:" + singleNumber(intArrayOf(4,1,2,1,2)))
    println("result:" + singleNumber(intArrayOf(1)))
}

private fun singleNumber(nums: IntArray): Int {
    var res = nums.first()
    for (j in 1 until nums.size) {
        res = res xor nums[j]
    }
    return res
}