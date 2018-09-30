package top.huqj.scala.base

/**
  * Created by huqj on 2018/9/30.
  * 测试抽象方法和抽象类
  */
abstract class MyAbstract {

  def eat(food: String): Unit

}

class MyAbstractExtend extends MyAbstract {

  override def eat(food: String): Unit = {
    println(s"""I am eating $food""")
  }

}

object TestMyAbstract {

  def main(args: Array[String]): Unit = {
    val my = new MyAbstractExtend()
    my.eat("apple")
  }

}
