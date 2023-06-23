package com.example.myapplication

/**
 * Given an integer n, return the number of prime numbers that are strictly less than n.
 */
fun countPrimes(n: Int): Int {
    val notPrime = BooleanArray(n)
    var count = 0
    for (i in 2 until n) {
        if (!notPrime[i]) {
            count++
            var j = 2
            while (i * j < n) {
                notPrime[i * j] = true
                j++
            }
        }
    }
    return count
}