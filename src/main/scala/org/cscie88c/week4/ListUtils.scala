package org.cscie88c.week4
import scala.collection.immutable.ListMap


object ListUtils {
  // 2.1 complete the function below
  def initDoubleList(initValue: Double)(size: Int): List[Double] = (for {
    _ <- 1 to size 
    } yield (initValue)).toList
  
  // complete the functions below using currying
  //2.2 - ones sets default value of 1, and place holder _ leaves room for length. Called upon in ten1
  def ones: Int => List[Double] = initDoubleList(1) _
  val ten1 = ones(10)
  //2.3 - zeros sets default value of 0, and place holder _ leaves room for length. Called upon in ten0
  def zeros: Int => List[Double] = initDoubleList(0) _
  val ten0 = zeros(10)

  // complete the functions below
  //3.1 - group by letters in sentence
  def charCounts(sentence: String): Map[Char, Int] = {
    sentence.filter(_!=' ').map(c => (c, 1)).groupBy(_._1).map(l =>
      (l._1, l._2.map(_._2).reduce(_+_)))
  }

  //3.4 - order letters and give top n 
  //Source: https://www.geeksforgeeks.org/how-to-sort-a-scala-map-by-value/
  def topN(n: Int)(frequencies: Map[Char, Int]): Map[Char, Int] = {
    val sortedMapByValue = ListMap(frequencies.toSeq.sortWith(_._2>_._2):_*)
    val topNValues = (sortedMapByValue.take(n))
    //Had to convert to List first and then Map, to make final result a normal Map
    val topNValuesList = topNValues.toList
    val topNValuesNormalMap = topNValuesList.toMap
    topNValuesNormalMap
  }
}
