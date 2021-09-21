fun main(){
    /**
     * Defines an infix extension function on Int.
     */
    infix fun Int.times(str: String) = str.repeat(this)
    println(4 times "Repeat ")

    /**
     * Creates a Pair by calling
     * the infix function to from the standard library.
     */
    val pair = "Ferrari" to "Katarina"
    println(pair)

    /**
     * Here's your own implementation of to creatively called onto.
     */
    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "무한" onto "도전"
    println(myPair)

    /**
     * Infix notation also works on members functions (methods).
     */
    val p1 = Person("Person1")
    val p2 = Person("Person2")
    p1 likes p2
}

/**
 * The containing class becomes the first parameter.
 */
class Person(val name: String){
    val peopleList = mutableListOf<Person>()
    infix fun likes(other: Person) { peopleList.add(other)}
}