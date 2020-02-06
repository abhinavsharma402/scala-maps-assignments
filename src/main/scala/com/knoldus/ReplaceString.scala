package com.knoldus

class ReplaceString{
  def replaceString(map: Map[Int, List[String]], tempmap: Map[Int, List[String]]): Map[Int, List[String]] = {
    map.foldLeft(tempmap) { (resultMap: Map[Int, List[String]], map: (Int, List[String])) =>
      if (map._1 % 2 == 1) {
        resultMap + (map._1 -> replace(map._2, List(), "odd"))
      }
      else {
        resultMap + (map._1 -> replace(map._2, List(), "even"))
      }
    }
  }


  def replace(list: List[String], emptyList: List[String], str: String): List[String] = {
    list match {
      case Nil => List()
      case first :: Nil => emptyList :+ first.charAt(0) + str
      case first :: rest => replace(rest, emptyList :+ first.charAt(0) + str, str)
    }
  }
}

object A {
  def main(args: Array[String]): Unit = {
    val replaceStringObject = new ReplaceString
    val map = Map(
      1 -> List("Sunil", "Laxmi"),
      2 -> List("Bhavya", "Sangeeta"),
      3 -> List("Arun", "Sushmita"),
      4 -> List("Jamwant")
    )
    val emptyMap = Map.empty[Int, List[String]]
    print(replaceStringObject.replaceString(map, emptyMap))
  }
}