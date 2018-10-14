import scala.collection.mutable.ListBuffer
val n: Long = 600851475143L
val rt = math.round(math.sqrt(n)).toInt
val primeList = new ListBuffer[Int]
for (p <- (2 to rt))
  if (primeList.takeWhile(e => e * e <= p).forall(p % _ != 0))
    primeList += p
primeList.filter(n % _ == 0).last