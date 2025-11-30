package rahul.stringOperation

data class Student(val name:String,val age:Int)
fun main(){
   // println(reverseWithLoop("rahul"))
   // println(checkPalindrome("aba"))
   // println(findDuplicate("aba"))
  //  swapTwoNumber()

    val s1=Student("rahul",20)
    val s2=Student("aaa",10)
    val s3=Student("bb",30)
    val s4=Student("cc",14)
    val studentList= listOf<Student>(Student("rahul",20),Student("aaa",10),Student("bb",30),Student("cc",14))
    val adultStudent=studentList.filter { it.age>18 }
    println(adultStudent)
    println(largest(intArrayOf(1,9,3,5)))
    val numbers = listOf(1, 2, 3, 4, 5)

    val square=numbers.map{it*it}
    println(square)
    val str="rahul"
    val capital=str.map { it.uppercase() }
    val even=numbers.filter { it%2==0 }
    println(even)
    println(capital)
}
//reverse string
fun reverseString(str:String)=str.reversed()
fun reverseWithLoop(str:String):String{
    var result=""
   for (i in str.length-1 downTo 0){
       result+=str[i]
   }
    return result
}
fun checkPalindrome(str: String)= str==str.reversed()

fun findDuplicate(str: String){
val freq=str.groupingBy { it }.eachCount()
    freq.filter { it.value>1 }.forEach{
        println("key=${it.key} = value =${it.value}")
    }
}
fun swapTwoNumber(){
    var a=10
    var b=20;
    a= a+b
    b=a-b
    a=a-b
    println("a=$a b=$b")
}
fun largest(arr: IntArray): Int = arr.max()