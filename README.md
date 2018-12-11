# Kotlin

- _Ibrahim Mushtaq_
- _ibrahimmushtaq@uoit.net_

## About the language

> _Describe the language_
>
> - Kotlin was designned by JetBrians in July 2011. This has been in develpment for a year. The lead designer of this language wanted a language with certain feature and the only language known to them at that time is Scala. However Scala was slow to compile.
>
> - There are many interesting things about Kotlin including:
> 1. A language that can run on JVM and also be compiled to Javascript source code using the LLVM compiler infrastructure
> 2. It is Concise (Drastically reduce the amount of "Boilerplate" code)
> 3. It is safe (Avoids entire classes of error)
> 4. It is Interoperable (Can use exisiting libraries for JVM, Android and Browser)
> 5. It is Tool-friendly (Build it from any Java IDE or Command line)
> 6. It contains many Collections (Contains higher-order functions lambda expressions, operator overloading, lazy eval and muc more)


## About the syntax

- *Variable Declaration (Implcit)*

```kotlin
var language = "English"
val score = 95
```
- *Variable Declaration (Explcit)*

```kotlin
var language: String = "English"
val score: Int = 95
```

- *Conditional (Blocks)*
```kotlin
    val flag = true

    if (flag == true) {
      //Do something
    }
```
- *Conditional (Variable assignments)*
```kotlin
    val a = 12
    val b = 13
    val max: Int

    max = if (a > b) a else b
```
- *Comments*
```kotlin
/* ... */
// ....
```
- *Printing with Literals*
```kotlin
fun main(args : Array<String>) {
    val score = 12.3

    println("score")
    println("$score")
    println("score = $score")
    println("${score + score}")
}

Output:
score
12.3
score = 12.3
24.6
```
- *For Loop*
```kotlin
  for (i in 1..5) {
      println(i)
  }
```

## About the tools

> The tool that is required to build Kotlin is using the JDK installed and Kotlinc, which is its on compiler develped by JetBrains

## About the standard library

> Kotlin provides a ton of Standard Library. This includes but not limit to:

- The run function exposes the value of the object that it was called from as this inside the block
```kotlin
val result = "Local String".run {
    System.out.println(this) 
    "New String"
}
System.out.println(result) 

Output:
Local String
New String
```
- The let function exposes the value of the object that it was called from as it inside the block, while this is retained from the outer scope.
```kotlin
val result = "Local String".let {
    System.out.println(this.name) 
    System.out.println(it) 
    "New String"
}
System.out.println(result) 
```

- Apply, which accept the instance as a reciever and then return reciever

```kotlin
fun getDeveloper(): Developer {
    return Developer().apply {
        devName = "Ibrahim Mushtaq"
        devAge = 20
    }
} 
```
- With, which requires an instance to be passed as an argument and then returns the result of the last code within the block

```kotlin
fun getPersonFromDeveloper(developer: Developer): Person {
    return with(developer) {
        Person(devName, devAge)
    }
} 
```

## About open source library

> This language has been used exstensibily through out the open source community. There have been a large number of libraries created through Kotlin 

1. Anko, an opensource libraries used for making android development faster. https://github.com/Kotlin/anko
2. RxDownload which is a multithreaded download tool. https://github.com/ssseasonnn/RxDownload
3. Ktor, which is a framework for quickly connected applications in minimal effort
https://github.com/ktorio/ktor
4. Wassabi which is a HTTP framework. https://github.com/wasabifx/wasabi
5. Kwery which is a SQL Library.
https://github.com/andrewoma/kwery

There are many more, and it shows the community profound love to support this library

# Analysis of the language

> After going through the language, I have determine that:
1. Kotlin is functional programming language since it supports higher order, function types and lambda expression.
2. It does not support Meta Programming
3. It does support partial closure, such as importing a package at the begining, which could be served as a Namespace. It also does contain alot of scoping.
4. Kotlin does infact do Lexical Scoping
5. Kotlin uses fuctional construct extensively as part of its langauge and part of it stdlib, such as `apply`, `with` , `also` , `run`, `let`
6. Kotlin is a statically AND Strongly typed language
7. There are some pros and cons with this langauage
> Pros:
> - More work can be done within a fewer time since, some function can be done with little line of codes
> - It compiles along with existing Java Code
> - It can be easily maintainable

>Cons:
> - Compilation time do fluctuate
> - There are not much experts on Kotlin
> - It would take time to learn this language sinces its not java



