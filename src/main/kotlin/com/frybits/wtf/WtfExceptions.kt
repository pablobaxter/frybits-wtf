package com.frybits.wtf

/**
 * Frybits
 * Created by Pablo Baxter (Github: pablobaxter)
 */

abstract class WtfException : Exception {
    constructor() : super()

    constructor(message: String?) : super(message)

    constructor(message: String?, cause: Throwable?) : super(message, cause)

    constructor(cause: Throwable?) : super(cause)
}

object `┳━┳` : WtfException("(┛ಠ_ಠ)┛彡┻━┻")

object TheDamnTable : WtfException("(╯°□°)╯︵ ┻━┻")

class `(╯°□°)╯︵ ┻━┻`(message: String? = "FFFFFUUUUUU~~~!") : WtfException(message)

fun catchWtf(catchBlock: () -> Unit) {
    try {
        catchBlock.invoke()
    } catch (e: TheDamnUser) {
        println("(´･_･`)︵ /(^.^'/)")
    } catch (e: `(´･_･')`) {
        println("(´･_･`)︵ /(^.^'/)")
    } catch (e: `EVERYTHING!!!`) {
        println("┏━┓┏━┓┏━┓ ︵ /(^.^/)")
    } catch (e: WtfException) {
        println("┬─┬ノ( º _ ºノ)")
    }
}

object TheDamnUser : WtfException("(╯°Д°)╯︵/(.□ . \\)")

object `(´･_･')` : WtfException("(╯°Д°)╯︵/(.□ . \\)")

object `EVERYTHING!!!` : WtfException("┻━┻︵ \\(°□°)/ ︵ ┻━┻")
