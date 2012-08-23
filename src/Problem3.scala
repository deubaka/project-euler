/**
 * @author konqueror7
 *
 * Problem:
 *  The prime factors of 13195 are 5, 7, 13 and 29.
 *  What is the largest prime factor of the number 600851475143?
 *
 * Answer:
 *  6857
 */

object Problem3 {
	def main(args : Array[String]) = {
		var target = 600851475143L
		var prime = 2

		while (prime != target) {
			if ((target % prime) == 0)
				target /= prime
			else
				prime += 1
		}
		print(prime)
	}
}