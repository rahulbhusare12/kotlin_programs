package rahul.inrviewq

// do sum of char like a=1,b-2..z=26 then abcd=10

fun main(){
    println(stringSum("abcdg"))
}

fun stringSum(str:String):Int{
    return str.lowercase().sumOf { it - 'a'+1 }
}

/*
fun checkString(str1:String,str2:String):Boolean{
    */
/*val s1=str1.lowercase().toCharArray().sorted()
    val s2=str2.lowercase().toCharArray().sorted()
    return  s1==s2*//*

    for(i in 0 .. str1.length){
        if(str1[i]!=str2[i]){
            var temp=str1[i]
            str1[i]=str1[i+1]


        }
    }
}


*/

//Q1. Given two strings s1 and s2, check if one swap in s1 can make it equal to s2.
//-Only one swap of two characters is allowed.
//-Return true if it's possible, otherwise false
//Example inputs : s1 = “bank”, s2= "kanb"
//
//Naga Ambati
//
//4:46 PM
//S1 = abkn s2=kanb
/*


fun getAgeCategory(age: Int): String{
    if(age<1){ return “Infant” }
    else if(age>1 && age<=4){ return “Tolder” }
    else if(age> 4 && ageageInYears<=11){ return “Kid” }
    else if(ageageInYears> 11 && ageageInYears<=18){ return “Teenager” }
    else if(ageageInYears> 18 && ageageInYears<=60){ return “Adult” }
    else if(ageageInYears> 60){ return “Senior” }
}
*/

/*

input- a2b3c4
output- aabbbcccc

without using StringBuilder()

Test cases
a12
a2b
3a2
abc
123*/


fun testFF(str:String):String{
    var prevChar:Char?=null
    var temStr=""
    var count=0

    for (ch in str){
        if (ch.isDigit()){
            if (prevChar!=null){
                count=ch.toString().toInt()
                temStr += prevChar.toString().repeat(count)
            }else{

            }
        }else{
            prevChar = ch
        }
    }
    return  temStr
}

