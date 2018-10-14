val res = (1 to 999).toArray.filter(r => r % 3 == 0 || r % 5 == 0).sum
println(res)