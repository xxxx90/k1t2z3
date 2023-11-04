fun main() {

    val sum = 100
    var discont1 = 0
    var discont2 = 1
    val constantUser = false
    var toPay = sum

    if (sum > 1000 && sum < 10_001) {
        toPay = sum - 100
    }
    if (sum > 10_000) {
        toPay = (sum * 0.95).toInt()
    }
    if (constantUser) {
        toPay = (toPay * 0.99).toInt()
    }
    println("Сумма покупки: " + sum)
    println("Итого к оплате: " + toPay)


}