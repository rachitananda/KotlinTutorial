fun main(args: Array<String>) {

    println("===Pets==")
    println("Enter number of Pets")
    val n = readLine()!!.toInt()
    var listOfPets : Array<String>  = Array(3){""}// string[]
    println("Enter pet names")
    for (i in 0 until n){//<n
        listOfPets[i]= readLine()!!.toString()
    }
    for (i in 0..n-1){
        println("pet $i : ${listOfPets[i]}")
    }
}