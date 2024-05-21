class Dog: Animal() {
    var danger: Boolean = false
    fun isDanger(){
        if (danger) println("гав-гав-гав")
        else println("Пёс $name играет")
    }
}