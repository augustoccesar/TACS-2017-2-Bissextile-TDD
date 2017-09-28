fun isBissextile(number: Int): Boolean? {
    val numberString = number.toString()
    val size = numberString.length

    return if(size == 4) {
        val lastNumbersString: String = numberString.subSequence(size - 2, size).toString()
        if(lastNumbersString == "00") {
            number.rem(400) == 0
        }else{
            val lastNumbers = lastNumbersString.toInt()
            lastNumbers.rem(4) == 0
        }
    }else{
        throw IllegalArgumentException("Input number must be >= 1000")
    }
}