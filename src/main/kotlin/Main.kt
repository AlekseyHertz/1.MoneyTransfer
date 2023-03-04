fun main() {
    val transfer = 500 // указываем смумму перевода
    val minPayCommission = 35
    val commissionPay: Double = 0.0075
    var amount = transfer * commissionPay
    var totalCoast = if (amount < minPayCommission) {
        amount = minPayCommission.toDouble()
    } else {
        amount
    }

    println (amount)
    }
