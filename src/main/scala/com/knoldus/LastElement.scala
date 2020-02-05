package com.knoldus

class LastElement {
def last(list: List[Int]):Int={
  list.foldLeft(0){(resultElement,listELement)=>listELement}
}
}
object LastElement{
  def main(args: Array[String]): Unit = {
    val lastElementObject=new LastElement
    print(lastElementObject.last(List(1,1,2,3,5,8)))
  }
}
