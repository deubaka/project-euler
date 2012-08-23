/**
 * @author konqueror7
 *
 * Problem:
 *  The sum of the squares of the first ten natural numbers is,
 *  
 *      1sq + 2sq + ... + 10sq = 385
 *  
 *  The square of the sum of the first ten natural numbers is,
 *  
 *      (1 + 2 + ... + 10)sq = 55sq = 3025
 *      
 *  Hence the difference between the sum of the squares of the first ten natural
 *  numbers and the square of the sum is 3025 − 385 = 2640.
 *  
 *  Find the difference between the sum of the squares of the first one hundred
 *  natural numbers and the square of the sum.
 *
 * Answer:
 *  25164150
 */

import java.lang.Math._

object Problem6 {
	
	def main(args : Array[String]) = {
		var sumSquare = 0
		var squareSum = 0
		
		for (num <- 1 to 100) {
		    sumSquare += pow(num, 2).toInt            
		    squareSum += num
		}
		print(pow(squareSum, 2).toInt - sumSquare)
	}
}