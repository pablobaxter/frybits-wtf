[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
# Frybits WTF ಠ_ಠ 
Are you tired of JVMs crap? Done with handling some meaningless `NullPointerException`? Tired of throwing some other lame ass exception because somehow someone got your code in a state it never should have gotten into?

Take a deep breath, and let me introduce the Frybit WTF exception library (exclusively for Kotlin)!

## (っ˘▽˘)っ `Usage` ⊂(◕。◕⊂)

Let's start of with something simple... feel like flipping that desk of yours? Whoa! Wait, no... don't really do it. Let's do it in code instead:

```kotlin
fun someDamnFunction() {
    // Some damn code
    // Suddenly, an error appears out of nowhere!
    throw `┳━┳`
    // Throwable message: "(┛ಠ_ಠ)┛彡┻━┻"
}
```

Easy, no? Oh... you hate the ASCII stuff? Just calm down there and breath. We can do this instead:

```kotlin
fun someDamnFunction() {
    // Some damn code
    // Suddenly, an error appears out of nowhere!
    throw TheDamnTable
    // Throwable message: "(╯°□°)╯︵ ┻━┻"
}
```

There, don't you feel better? Let's see what else we can throw, shall we?

```kotlin
fun someDamnFunction() {
    // Some damn code
    // Suddenly, an error appears out of nowhere!
    throw `(╯°□°)╯︵ ┻━┻`() // Throwable message: "FFFFFUUUUUU~~~!"
    
    // You can also do the following if you don't like the default message
    // throw `(╯°□°)╯︵ ┻━┻`("someChoiceWords")
}
```

Can't find a table? Not a problem, let's just use our words instead!

```kotlin
fun someDamnFunction() {
    // Some damn code
    // Suddenly, an error appears out of nowhere!
    throw SomeChoiceWords() // Throwable message: "FFFFFUUUUUU~~~!"
    
    // You can also do the following if you don't like the default message
    // throw SomeChoiceWords("someChoiceWords") // Throwable message: "(　ﾟДﾟ)＜!! someChoiceWords"
}
```

Sometimes, users like doing things they shouldn't. Let's handle this appropriately:

```kotlin
fun someDamnFunction() {
    // Some damn code
    // Suddenly, a random user breaks stuff!
    throw `(´･_･')` // Throwable message: "(╯°Д°)╯︵/(.□ . \)"
    
    // Again, if ASCII is not your thing...
    throw TheDamnUser // Throwable message: "(╯°Д°)╯︵/(.□ . \)"
}
```

Maybe you've had it up to here with _everything_...

```kotlin
fun someDamnFunction() {
    // Some damn code
    // Damnit, it's all gone to hell!
    throw `EVERYTHING!!!` // Throwable message: "┻━┻︵ \(°□°)/ ︵ ┻━┻"
}
```

Oh no! Are you feeling some regret for your actions? Do you wish you could just catch some of these exceptions appropriately? Don't worry, I have you covered. ◕ ◡ ◕

```kotlin
fun someHappyCode() {
    // Happy little code here
    
    // Let's not regret this decision
    catchWtf {
        someDamnFunction()
    }
}
```
