package rahul.inrviewq

fun main(){
println(findNextGreater(123))
}

fun findNextGreater(input:Int):Int{
    var digit= input.toString().toCharArray()


    var i  =digit.size-2

    while (i >= 0 && digit[i] >= digit[i+1]){
        i--
    }

    var j=digit.size-1
    while (digit[i] >= digit[j]){
        j--
    }

    var temp=digit[i]
    digit[i] =digit[j]
    digit[j] = temp
    digit.reverse(i+1,digit.size)
    return  String(digit).toInt()
}