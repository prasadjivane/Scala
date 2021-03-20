import scala.io.StdIn.readInt
object Condition{
    def main(args: Array[String]) {
        println("Enter The Number To Check")
    var no = scala.io.StdIn.readInt()
        if(no%2==0){
            println("Even")
        }else{
            println("Odd")
        }
    }
}