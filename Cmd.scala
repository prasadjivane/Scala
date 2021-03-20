import scala.io.StdIn.readLine
object Cmd {
    def main(args: Array[String]){
        println("Enter First Name")
        val a = readLine()
        println("Enter Last Name")
        val b = readLine()
        println(s"Full Name Is $a $b")
    }
}