fun sumAndSub ( a: Char, b: Int, c: Int): Int? {
	when(a) {
		'+' -> return( b + c )
		'-' -> return( b - c )
		else -> return(null)
	}
} 

fun main() {
	println(sumAndSub('+', 20, 30))
	println(sumAndSub('-', 20, 30))
}