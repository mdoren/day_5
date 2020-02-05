fun main(){
    var supply = arrayOf<String>("Item 1", "Item 2", "Item 3")
    var qty = arrayOf("10", "5", "22")

    for (i in 0..supply.size -1){
        println("The ${supply[i]} has ${qty[i]} items.")
    }

    var comboArray = arrayOf<Array<String>>()

    comboArray += supply
    comboArray += qty

    var rowcount = comboArray[0].size -1

    for (i in 0..rowcount){
        var a_item = comboArray[0][i]
        var a_qty = comboArray[1][i]
        println("In combine array: $a_item has $a_qty items.")
    }

    println("hi")
}