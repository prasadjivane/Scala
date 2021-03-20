object Pm {
    def main(args: Array[String]){
        var result = search ("Prasad")
        var p = 11
        p match{
            case 3 => println("One")
            case 11 => println("Match")
            case _ => println("No")
        }
    }

    def search(a:Any):Any = a match{
        case 1 =>  println("One")
        case 2 => println("Two")
        case "Prasad" => println("Prasad")
        case _ => println("Noting")
    }
}