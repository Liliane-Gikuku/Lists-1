fun main(){
    list()
    list2()
    list3()
    list4()

    var a = Person("Mercy",24)//to resolve
    var b = Person("Wanjiru",17)
    var c = Person("Mercyy",30)
    var d = Person("Judyy",12)
    var e = Person("Merry",73)
    var people=listOf(a,b,c,d,e)
    var adults=people.filter {person -> person.age >=18}
    println(adults)
    var longNames=people.filter {person -> person.name.length>5}
    println(longNames)

    var x=Car("Jeep","Wrangler")
    var y=Car("Mazda","Demio")
    var z=Car("Nissan","March")
    var k=Car("Range Rover","Sport")
    var cars=listOf<Car>(x,y,z,k)
    println(cars)
    var sortedCars=cars.sortedBy {car -> car.model}
    println(sortedCars)
    var sortCars=cars.sortedBy {car -> car.make}
    println(sortCars)

    list5()
    list6()
   /* list7()
    var x= listOf("Kangabe", "Ane","Harrison")*/

}

//An immutable list
fun list(){
    var streams=listOf("Lisalab","Lovelace","AnitaB")
    println(streams)
}
//mutable
fun list2(){
    var colors=mutableListOf("Red","Blue","Black","Green")
    println(colors)
    colors.add("Yellow")
    println(colors)
    colors.remove("Red")
    println(colors)
    var names = listOf("Adam","Eve","Cain","Abel")
    println(names)
    var x=mutableListOf<String>()
    x.add("pink")
    println(x)
}

fun list3(){
    var nums=mutableListOf(21,20,19,19,18,22,20,23,25)
    println(nums.count())
    println(nums.maxOrNull())
    println(nums.minOrNull())
    println(nums.sum())
    println(nums.average())
    println(nums.last())
    println(nums.first())
    println(nums[4])
    println(nums.indexOf(20))
    println(nums.lastIndexOf(20))
    println(nums.size)
    println(nums.get(5))
    nums.add(1,24)
    println(nums)
}
fun list4() {
    var names = listOf("Jack", "Jill", "James", "Bill", "Janet")
    /*names.forEach{ name-> println(name)}*/
    /* for (name in names) {
        println(name)
    }


}*/
    var sortedNames = names.sorted()
    println(sortedNames)

    var sortedD= names.sortedDescending()
    println(sortedD)
    var inverted=names.reversed()
    println(inverted)
}

/*class Farmer(var name:String, var age:Int){
    fun eat(){

    }
}*/
data class Car(var make:String,var model:String)

// Filtering lists

fun list5(){
    var kidsAges=listOf(4,6,3,12,13,7,12,15,8,16)
    var teenagers= kidsAges.filter{age-> age>12}
    println(teenagers)
}

//A function that takes in a list of names and returns a list of names longer than five characters
fun list6(){
    var namesy= listOf("Kangabe", "Ane","Harrison")
    var wanted=namesy.filter{name-> name.length>5}
    println(wanted)
}

/*fun list7(names:List<String>):List<String>{
    var namesx= listOf("Kangabe", "Ane","Harrison")
    var wanted=namesx.filter{name-> name.length>5}
    println(wanted)
}*/


data class Person(var name:String, var age:Int)