fun main(){
    //**************************Задание 1**************************
    println("Задание 1")
    val amount: Double = 100.00
    val percentTransfer: Double = 0.0075
    val minTransferAmount: Double = 35.00
    var transferFee: Double = amount*percentTransfer

    var transferAmount = amount - transferFee

    if (transferFee < minTransferAmount) {
        transferAmount = amount - minTransferAmount
        println("Ваша комиссия за перевод: " +  minTransferAmount + " сумма перевода " + transferAmount)
    } else{
        println("Ваша комиссия за перевод: " +  transferFee + " сумма перевода " + transferAmount)
    }

    //**************************Задание 2**************************
    println("\nЗадание 2")
    val likes: Int = 1


    if (likes%10 == 1 && likes%100 != 11) {
        println("Понравилось " + likes + " человеку")

    }
    else {
        println("Понравилось " + likes + " человекам")
    }
//**************************Задание 3**************************
    println("\nЗадание 3")
    val purchaseAmount: Double =  11540.00
    val regularCustomer: Boolean = false
    val discount: Double = 100.00
    val discountVIP: Double = 0.05
    val discountRegularCustomer: Double = 0.01
    var totalPrice: Double

    if (purchaseAmount > 1000 && purchaseAmount <=10000){
        totalPrice =purchaseAmount - discount
    }
    else if (purchaseAmount > 10000){
        totalPrice = purchaseAmount - purchaseAmount * discountVIP
    }
    else{
        totalPrice = purchaseAmount
    }
    if (regularCustomer) {
        totalPrice = totalPrice - totalPrice * discountRegularCustomer
    }
    println("Итоговая цена: $totalPrice")


}