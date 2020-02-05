fun main(){
    var menu = arrayOf<String>("Traditional Wings", "Boneless Wings", "Cheesecurd Burger", "Crispy Buffalo Ranch Wrap", "Tenders")
    //var i = 0
    var qty = arrayOf("18", "24", "1", "1", "5")

    for (i in 0..menu.size -1){
        if (i == 0 || i == 1 || i == 4){
            println("The ${menu[i]} come with ${qty[i]}.")
        }
        else{
            println("The ${menu[i]} comes with ${qty[i]}.")
        }
    }
}