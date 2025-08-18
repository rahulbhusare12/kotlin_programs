fun main(){
///val result=checkIsAnagram("listen","Silent")
  //  println(result)
   // println(moveZeroToEnd(mutableListOf(1,5,0,4,0,3,5,0,8)))
    //println(reversWords("I love programing"))
    //println(foddnum(listOf(1,8,5,3,2,6,88,9,44)))
   // println(reStr("rahul"))
    findDublic("abbcrrsdaa")
    var dd="rahul"
    println(dd.doCapital())
fun add(a:Int,b:Int):Int=a+b
    var tt= highTest(2,4,::add)
}
fun checkIsAnagram(str1:String,str2:String):Boolean{
    val s1=str1.lowercase().toCharArray().sorted()
    val s2=str2.lowercase().toCharArray().sorted()
    return s1==s2
}

fun moveZeroToEnd(num: MutableList<Int>): List<Int> {

    var nonZero = mutableListOf<Int>()
    var zero = mutableListOf<Int>()
    num.forEach { i ->
        if (i != 0) {
            nonZero.add(i)
        } else {
            zero.add(i)
        }

    }
    return nonZero + zero
    /*var index=0
    for(i in num.indices){
      if (num[i]!=0){
          num[index]=num[i]
          index++
      }
    }
    while (index<num.size){
        num[index] =0
        index++
    }

    return num*/
    // return nonZero+zero
}

fun reversWords(str:String):String{
    val charArray=str.split(" ")
    return  charArray.joinToString(" ") { it.reversed() }
}

fun foddnum(nums:List<Int>):List<Int>{
 return nums.filter { it % 2 ==0 }.sortedDescending()


}

fun reStr(str:String):String{
    var temp =""
    for( i in str.length-1 downTo 0){
        temp +=str[i]
    }
    return temp
}

fun findDublic(str:String){
    var charcount = mutableMapOf<Char,Int>()

    str.forEach {
        charcount[it]=charcount.getOrDefault(it,0)+1
    }
    for((char,count) in charcount){
        if (count>1){
            println(" char $char = $count")
        }
    }
}
fun highTest(a:Int,b:Int,ops:(Int,Int)->Int):Int{
    return ops(a,b)
}
fun String.doCapital():String{
    return this.uppercase()
}


