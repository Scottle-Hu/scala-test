package top.huqj.scala.base

/**
  * Created by huqj on 2018/9/30.
  * 测试scala的类和对象，以及构造的方法重载
  */
class Base(var name: String = "NONE", var age: Int = -1) {

  def this(name: String) {
    this(name, -1)
  }

  def this(age: Int) {
    this("NONE", age)
  }

  def speak(word: String): Unit = {
    println(s"""base speak: $word""")
  }

  def run(): Unit = {
    println("run...")
  }

  def selfIntroduce() {
    println(s"""I am a base, and my name is $name, I'm $age years old.""")
  }

}

object TestBase {

  def main(args: Array[String]) {
    val base: Base = new Base
    base.speak("wow")
    base.run()
    println("base's name: " + base.name)
    println("base's age: " + base.age)

    val base2 = new Base("MyName", 20)
    base2.selfIntroduce()
    base2.name = "MyNewName"
    base2.age = 22
    base2.selfIntroduce()

    var base3 = new Base("JustName")
    base3.selfIntroduce()

    base3 = new Base(10)
    base3.selfIntroduce()
  }

}
