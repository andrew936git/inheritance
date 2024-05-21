open class Animal {
    var weight: Int = 0
    var name: String = ""

    fun eating() {
        println("$name кушает корм")
    }

    fun printInfo(){
        println("Питомец $name весит $weight")
    }
}