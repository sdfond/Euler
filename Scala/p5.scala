import scala.math._
def boost(num: Int, up: Int) = pow(num, (log(up)/log(num)).toInt).toInt
Array(2,3,5,7,11,13,17,19).map(r => boost(r, 20)).reduce(_ * _)