import scala.io.StdIn.readLine

@main def helloInteractive() =
  println("name:")
  val name = readLine()

  println(name+", you's a ho")
