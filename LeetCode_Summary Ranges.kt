/**
 * You are given a sorted unique integer array nums.
 * Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
 * That is, each element of nums is covered by exactly one of the ranges,
 * and there is no integer x such that x is in one of the ranges but not in nums.
 * Each range [a,b] in the list should be output as:
 * "a->b" if a != b
 * "a" if a == b
 *
 *
 * Example1:
 * Input: nums = [0,1,2,4,5,7]
 * Output: ["0->2","4->5","7"]
 * Explanation: The ranges are:
 * [0,2] --> "0->2"
 * [4,5] --> "4->5"
 * [7,7] --> "7"
 *
 * Input: nums = [0,2,3,4,6,8,9]
 * Output: ["0","2->4","6","8->9"]
 * Explanation: The ranges are:
 * [0,0] --> "0"
 * [2,4] --> "2->4"
 * [6,6] --> "6"
 * [8,9] --> "8->9"
 */
fun main(args: Array<String>) {
    print("result: " + summaryRanges(intArrayOf(0, 1, 2, 4, 5, 7)))
    print("result: " + summaryRanges(intArrayOf(0, 2, 3, 4, 6, 8, 9)))
}

fun summaryRanges(nums: IntArray): List<String> {
    val size = nums.size
    if (size == 0) {
        return emptyList()
    }
    var start = ""
    var following = nums.first()
    val list = mutableListOf<String>()
    nums.forEachIndexed { index, i ->
        if (start.isEmpty()) {
            start = i.toString()
            following = i
        }
        if ((index + 1) < size && (following + 1) == nums[index + 1]) {
            following = nums[index + 1]
        } else {
            if (start.toInt() == following) {
                list.add(start)
            } else {
                list.add("$start->$following")
            }
            start = ""
        }
    }
    return list
}
