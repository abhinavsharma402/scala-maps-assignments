package com.knoldus

class SumConditional {
  def sumConditional(map: Map[String,Int],str:String): Int ={
    map.foldLeft(0){(sum,map)=>if (map._1.contains(str)){
      map._2+sum
    }
      else{
      sum
    }
    }

  }

}
object SumConditional{
  def main(args: Array[String]): Unit = {
    val sumConditionalObject=new SumConditional
    val map=Map("anurag" -> 24, "danil" -> 28, "anushka" -> 30)
    print(sumConditionalObject.sumConditional(map,"anu"))
  }
}
