# Primitive types

Scala doesn't distinct between `primitive` and `boxed` types. All boxing happens behind the scene.<br/>
Next reason why scala is purely object oriented language.

<!-- transparent boxing --> 
```tut
val myScalaList = 1::2::3::Nil
val myJavaList = new java.util.ArrayList[Int]()
myJavaList.add(1);myJavaList.get(0)
myScalaList(0) == myJavaList.get(0)
```

`Array` is primitive type in Java. What the situation is in Scala?

```tut
val arr = Array(1, 2, 3)
arr.reverse
arr.map(_ * 3)
Array(1, 2, 3) == Array(1, 2, 3) 
List(1, 2, 3) == List(1, 2, 3)
```
Is there Inconsistency in implementation of compare ?   
```tut
Array(1, 2, 3) == Array(1, 2, 3)
List(1, 2, 3) == Vector(1, 2, 3)

// structural compare of arrays
Array(1, 2, 3).sameElements(Array(1, 2, 3))
```
see [Scala array comparison (without a PhD)] (http://blog.bruchez.name/2013/05/scala-array-comparison-without-phd.html) for  further info