//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val cat = Cat()
    cat.name = "Сейла"
    cat.weight = 5
    cat.printInfo()
    cat.isSleeping()
    println("--------------------------")
    val dog = Dog()
    dog.name = "Жучка"
    dog.weight = 7
    dog.printInfo()
    dog.isDanger()

//2
    val phoneumber = "+7-900-555-55-55"
    val sony = Sony()
    sony.calling(phoneumber)

//3
    val array = arrayOf(3, 67, 1, 55, 65, 89, 23)
    for (i in array){
        if (i % 5 == 0) print("$i ")
    }

}