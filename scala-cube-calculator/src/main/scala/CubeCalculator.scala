object CubeCalculator extends App {
  println("Hello, Scala World! It's nice to meet you!!")
  println("Now let's do some math...")
  printCubeValue(3)

  def cube(x: Int) = {
    x * x * x
  }

  def printCubeValue(x: Int) = {
  	println("The cube of " + x + " is: " + cube(x))
  }
}