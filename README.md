# RabinKarpAlgorithm
  This is about the Rabin-Karp String matching algorithm.In rabin Karp Algorithm we use a Hash Function & Prime Number for calculate hash value of length m size text(m=length of pattern).
  
  q : A prime Number
  d : number of characterr in the Alphabet
  h : d^(m-1)
  
 # hash(txt[s+1..s+m]) = d(Hash(txt[s..m])-txt[s]*h) + txt[s+m]mod q
