@file:Suppress("unused", "NonAsciiCharacters", "ClassName")

package com.frybits.wtf

/**
 * Frybits
 * Created by Pablo Baxter (Github: pablobaxter)
 */

open class WtfException : Exception {
    constructor() : super()

    constructor(message: String?) : super(message)

    constructor(message: String?, cause: Throwable?) : super(message, cause)

    constructor(cause: Throwable?) : super(cause)
}

object `┳━┳` : WtfException("(┛ಠ_ಠ)┛彡┻━┻")

object TheDamnTable : WtfException("(╯°□°)╯︵ ┻━┻")

class `(╯°□°)╯︵ ┻━┻`(message: String = "FFFFFUUUUUU~~~!") : WtfException(message)

class SomeChoiceWords(message: String = "FFFFFUUUUUU~~~!") : WtfException("(　ﾟДﾟ)＜!! $message")

fun catchWtf(catchBlock: () -> Unit) {
    try {
        catchBlock.invoke()
    } catch (e: UserException) {
        println("(´･_･`)︵ /(^.^'/)")
    } catch (e: `EVERYTHING!!!`) {
        println("┏━┓┏━┓┏━┓ ︵ /(^.^/)")
    } catch (e: SomeChoiceWords) {
        println("( ಠ_ಠ )")
    } catch (e: `(╯°□°)╯︵ ┻━┻`) {
        println("┬─┬ノ( ಠ_ಠ ノ)")
    } catch (e: `WhatTheHellIsThisCrap?`) {
        e.cause?.let {
            println("${it::class.java.simpleName} ノ( ಠ_ಠ ノ)")
            it.printStackTrace()
        } ?: run {
            println("Quit toying with my emotions... ( ಠ_ಠ )")
        }
    } catch (e: WtfException) {
        println("┬─┬ノ( º _ ºノ)")
    }
}

sealed class UserException : WtfException("(╯°Д°)╯︵/(.□ . \\)")

object TheDamnUser : UserException()

object `(´･_･')` : UserException()

object `EVERYTHING!!!` : WtfException("┻━┻︵ \\(°□°)/ ︵ ┻━┻")

private class `WhatTheHellIsThisCrap?`(cause: Throwable) :
    WtfException("${cause::class.java.simpleName} щ(ºДºщ)", cause)

fun becauseOfThisCrap(cause: Throwable): WtfException = `WhatTheHellIsThisCrap?`(cause)
