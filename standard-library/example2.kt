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