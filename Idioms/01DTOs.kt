data class Student(var enroll_num: Long, var name: String)

fun main(){
	val s1 = Student(10101L, "Kaushik")
	s1.name = ("Jeel")
	println(s1.name)
}