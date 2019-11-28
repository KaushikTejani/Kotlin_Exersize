fun isPrime(a: Int): Boolean {
	if( (a % 2) != 0 )
		return true
	else 
		return false
} 

fun main() {
	var a = 7

	if(isPrime(a)) 
		println("$a is prime number")
	else 
		println("$a is non-prime number")
}