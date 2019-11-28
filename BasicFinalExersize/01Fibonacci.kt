//  0 1 1 2 3 5 8

fun main() {
	var n1: Int  = 0 
	var n2: Int  = 1
	var n3: Int  = n1 + n2

	var numberOfFibonacci = 12
	var index = 0

	while(index < numberOfFibonacci) {
		if (index == 0) 
			print("$n1")
		else if(index == 1)
			print(" $n2")
		else if(index  == 2)
			print(" $n3")
		else {
			n1 = n2
			n2 = n3
			n3 = n1 + n2
			print(" $n3")
		}
		index++
	}
}