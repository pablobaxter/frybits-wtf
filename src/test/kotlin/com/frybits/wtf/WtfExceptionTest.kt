package com.frybits.wtf

import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Frybits
 * Created by Pablo Baxter (Github: pablobaxter)
 */

class WtfExceptionTest {

    @Test(expected = WtfException::class)
    fun flipOneThing() {
        throw `┳━┳`.also {
            assertEquals("(┛ಠ_ಠ)┛彡┻━┻", it.message)
            it.printStackTrace()
        }
    }

    @Test(expected = WtfException::class)
    fun flipTheThingAgain() {
        throw TheDamnTable.also {
            assertEquals("(╯°□°)╯︵ ┻━┻", it.message)
            it.printStackTrace()
        }
    }

    @Test(expected = WtfException::class)
    fun flipOneThingWithMessage() {
        throw `(╯°□°)╯︵ ┻━┻`().also {
            it.printStackTrace()
        }
    }

    @Test
    fun catchThing() {
        catchWtf {
            throw `┳━┳`.also {
                it.printStackTrace()
            }
        }

        catchWtf {
            throw TheDamnTable.also {
                it.printStackTrace()
            }
        }

        catchWtf {
            throw `(╯°□°)╯︵ ┻━┻`().also {
                it.printStackTrace()
            }
        }

        catchWtf {
            throw TheDamnUser.also {
                it.printStackTrace()
            }
        }

        catchWtf {
            throw `EVERYTHING!!!`.also {
                it.printStackTrace()
            }
        }

        catchWtf {
            throw `(´･_･')`.also {
                it.printStackTrace()
            }
        }
    }

    @Test(expected = WtfException::class)
    fun flipUser() {
        throw TheDamnUser.also {
            assertEquals("(╯°Д°)╯︵/(.□ . \\)", it.message)
            it.printStackTrace()
        }
    }

    @Test(expected = WtfException::class)
    fun flipTheDamnUserAgain() {
        throw `(´･_･')` .also {
            assertEquals("(╯°Д°)╯︵/(.□ . \\)", it.message)
            it.printStackTrace()
        }
    }

    @Test(expected = WtfException::class)
    fun flipEverything() {
        throw `EVERYTHING!!!`.also {
            assertEquals("┻━┻︵ \\(°□°)/ ︵ ┻━┻", it.message)
            it.printStackTrace()
        }
    }
}
