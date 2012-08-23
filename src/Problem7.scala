/**
 * @author konqueror7
 *
 * Problem:
 *  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see 
 *  that the 6th prime is 13.
 *
 *  What is the 10 001st prime number?
 *
 * Answer:
 *  104743
 */
import java.lang.Math._

object Problem7 {

	def main(args : Array[String]) = {
		print(sieveOfEratosthenes(10001))
	}

	def sieveOfEratosthenes(nth : Int) : Int = {
		val target = ceil(nth * log(nth) + nth * (log(log(nth)))).toInt
		
		val sieve = new Array[Boolean](target + 1)
		for (index <- 2 to target)
			sieve(index) = true
			
			def loop(prime : Int, target : Int) {
				if (sqrt(target) >= prime) {
					for (factor <- prime to target) {
						if (factor % prime == 0 && prime != factor)
							sieve(factor) = false
					}
					loop(prime + 1, target)
				}
			}
		loop(2, target)

		val revisedSieve = new Array[Int](target + 1)
		var count = 0
		for (index <- 2 to target) {
			if (sieve(index)) {
				revisedSieve(count) = index
				count += 1
			}
		}

		return revisedSieve(nth - 1)
	}
}