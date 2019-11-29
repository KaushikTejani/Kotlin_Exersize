interface Demo{
	fun display()
}

class Implementation1 : Demo {
	override fun display() {
		println("I Am Implementation1")
	}
}

class Implementation2 : Demo {
	override fun display() {}
}


fun main() {
	val implementation2 = Implementation2()
 	implementation2.display()
}
