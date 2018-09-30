package top.huqj.scala.base

/**
  * Created by huqj on 2018/9/30.
  * 测试scala继承
  */
class Son(val _name: String, val _age: Int, val _score: Double) extends Base {

  name = _name
  age = _age
  var score: Double = _score

  override def selfIntroduce(): Unit = {
    println(s"""I am a base, and my name is $name, I'm $age years old, and my score is $score.""")
  }

}

object TestSon {

  def main(args: Array[String]): Unit = {
    val son: Son = new Son("myName", 12, 90)
    son.selfIntroduce()
    son.speak("I'm son")
    son.run()
  }

}
