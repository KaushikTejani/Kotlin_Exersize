class Data{
	fun one() = println("one")
	fun two() = println("two")
}


fun main(){
	val data = Data()
	with(data) //Using with call multiple function
	{
		one()
		two()
	}
} 