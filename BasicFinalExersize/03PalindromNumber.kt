fun isPalindromNumber(a: Int): Boolean {
	var num = a
	var newNum = 0
	var temp: Int

	while(num != 0) {
		temp = num % 10
		newNum = (newNum * 10) + temp
		num /= 10 
	}

	if (newNum == a) return true else return false
}

fun main() {
	var num = 12321

	var ans = if (isPalindromNumber(num)) "$num is palindrom Number." else "$num is non-palindrom number."
	println(ans)
}