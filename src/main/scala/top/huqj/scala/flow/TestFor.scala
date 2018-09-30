package top.huqj.scala.flow

/**
  * Created by huqj on 2018/9/30.
  * 测试scala的各种for循环结构
  */
object TestFor {

  def main(args: Array[String]): Unit = {
    var i = 0
    //to包含头尾数
    for (i <- 1 to 10) {
      println(i)
    }
    println()
    //until不包含尾
    for (i <- 1 until 10) {
      println(i)
    }
    //两重循环写一条
    var j: Int = 0
    for (i <- 1 to 3; j <- 1 to 3) {
      println(s"""i=$i,j=$j""")
    }
    //循环集合
    var list = List(1, 2, 3, 4, 5)
    for (i <- list) {
      println(i)
    }
    //循环过滤
    for (i <- list
         if i != 3; if i != 5) {
      println(i)
    }
    //使用循环赋值给列表
    val returnVal = for (i <- list
                         if i > 2
    ) yield i + 1
    println(returnVal)
  }

}
