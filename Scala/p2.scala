Stream.iterate((0, 1))(p => (p._2, p._1 + p._2)).takeWhile(p => p._2 < 4000000).map(_._2).filter(_%2 == 0).sum
