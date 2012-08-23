/**
 * @author konqueror7
 *
 * Problem:
 *  A palindromic number reads the same both ways. The largest palindrome made
 *  from the product of two 2-digit numbers is 9009 = 91 × 99. Find the largest
 *  palindrome made from the product of two 3-digit numbers.
 *
 * Answer:
 *  906609
 */

object Problem4 {
	def main(args : Array[String]) = {
		var maxPalindrome = 0

		for (factorOne <- 100 to 999) {
			for (factorTwo <- 100 to 999) {
				if (isPalindrome(factorOne * factorTwo) 
						&& (factorOne * factorTwo) > maxPalindrome)
					maxPalindrome = factorOne * factorTwo
			}
		}
		print(maxPalindrome)
	}

	def isPalindrome(v : Int) : Boolean = {
		val value = String.valueOf(v)
		if ((value.length % 2) == 0)
			return new StringBuffer(value.substring(0, value.length / 2))
		                .reverse().toString()
		                .equals(value.substring(value.length / 2))
		else
			return new StringBuffer(value.substring(0, value.length / 2))
		                .reverse().toString()
		                .equals(value.substring((value.length / 2) + 1))
	}
}