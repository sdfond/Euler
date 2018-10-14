import scala.math.BigInt
lazy val f: Stream[BigInt] = BigInt(1) #:: BigInt(2) #:: f.zip(f.tail).map(r => r._1 + r._2)
f.takeWhile(_ <= 4000000).filter(_%2==0).sum