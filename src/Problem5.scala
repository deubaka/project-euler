/**
 * @author konqueror7
 *
 * Problem:
 *  2520 is the smallest number that can be divided by each of the numbers from
 *  1 to 10 without any remainder. What is the smallest positive number that is
 *  evenly divisible by all of the numbers from 1 to 20?
 *
 * Answer:
 *  232792560
 */

object Problem5 {
	def main(args : Array[String]) = {
		var prime = 2
		var count = 20

		while (prime != 20) {
			if ((count % prime) == 0)
				prime += 1
			else {
				prime = 2
				count += 1
			}
		}
		print(count)
	}
}