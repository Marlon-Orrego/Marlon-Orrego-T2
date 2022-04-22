//1

object MyClass {
  def main(args: Array[String], word1: String, word2: String): Unit = {
    var palabra1 = word1.toLowerCase()
    var palabra2 = word2.toLowerCase()
    if (palabra1.sorted == palabra2.sorted){
      print("Son Anagramas")
    }else{
      print("No son Anagramas")
    }
  }
}


//2

package scala.math

object MyClass {

  def main(args: Array[String]) : Unit = {
    var a = 6
    var b = 8
    var c = 10

    a = a*a
    b = b*b
    c = c*c


    // La siguiente linea de codigo sirve cuando c es un numero decimal:
    // c = rint(c)

    var res = a+b

    if (c == res){
      print("Si cumple con el teorema de pitagoras")
    }else{
      print("No cumple con el teorema de pitagoras")
    }
  }
}


//3
object MyClass {

  def main(args: Array[String]): Unit = {
    var n = 3
    var result = 1
    n = n - 1
    while(n > 0){
      result = result * n
      n = n - 1
    }
    print(s"La permutacion circular es: $result ")
  }
}

//4

object Main extends App{
  def comb[A](ls: List[A], k: Int): List[List[A]] = {
    if (k == 0) List(Nil)
    else ls match {
      case Nil => List()
      case h :: t => comb(t, k) ++ comb(t, k - 1).map(h :: _)
    }
  }
  comb(List(1, 2, 3, 4, 5), 4) foreach println;
}


//5

object MyClass {
  def main(args: Array[String]): Unit = {
    var n = 12
    for (row <- 0 to n) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }

  }

  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else
      pascal(c - 1, r - 1) + pascal(c, r - 1)
  }
}