// first scala program... reading an article with this example
import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._
import scala.List
import scala.io.Source



object sayHello {

    def replaceTemplates(text: String, templates: Map[String, String]): String = {
        val builder = new StringBuilder
        val textLength = text.length

        //tailrec
        def loop(text: String): String = {
            if (text.length == 0) builder.toString
            else if (text.startsWith("{")) {
                val brace = text.indexOf("}")
                if (brace < 0) builder.append(text).toString
                else {
                    val replacement = templates.get(text.substring(1, brace)).orNull
                    if (replacement != null) {
                        builder.append(replacement)
                        loop(text.substring(brace + 1))
                    } else {
                        builder.append("{")
                        loop(text.substring(1))
                    }
                }
            } else {
                val brace = text.indexOf("{")
                if (brace < 0) builder.append(text).toString
                else {
                    builder.append(text.substring(0, brace))
                    loop(text.substring(brace))
                }
            }
        }

        loop(text)
    }




    def main(args: Array[String]) {
        val cr1 = Source.fromFile("cr.txt").getLines.mkString
        val alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val sol = "ETAOINSHRDLCUMWFGYPBVKJXQZ"
        println(cr1)
        //val res = replaceTemplates("{t}h{i}s {i}s a {t}es{t}", Map("t" -> "g", "i" -> "a"))
        //println(res)
        var tes = cr1//.toList
        var solve = cr1//.toList
        //println(tes)
        var letterFreq = new Array[Int](26)
        var count = 0
        while(count < cr1.length) {
            var letter:Char = (cr1(count))
            letter match {
                case 'A' => (letterFreq(0)+=1)
                case 'B' => (letterFreq(1)+=1)
                case 'C' => (letterFreq(2)+=1)
                case 'D' => (letterFreq(3)+=1)
                case 'E' => (letterFreq(4)+=1)
                case 'F' => (letterFreq(5)+=1)
                case 'G' => (letterFreq(6)+=1)
                case 'H' => (letterFreq(7)+=1)
                case 'I' => (letterFreq(8)+=1)
                case 'J' => (letterFreq(9)+=1)
                case 'K' => (letterFreq(10)+=1)
                case 'L' => (letterFreq(11)+=1)
                case 'M' => (letterFreq(12)+=1)
                case 'N' => (letterFreq(13)+=1)
                case 'O' => (letterFreq(14)+=1)
                case 'P' => (letterFreq(15)+=1)
                case 'Q' => (letterFreq(16)+=1)
                case 'R' => (letterFreq(17)+=1)
                case 'S' => (letterFreq(18)+=1)
                case 'T' => (letterFreq(19)+=1)
                case 'U' => (letterFreq(20)+=1)
                case 'V' => (letterFreq(21)+=1)
                case 'W' => (letterFreq(22)+=1)
                case 'X' => (letterFreq(23)+=1)
                case 'Y' => (letterFreq(24)+=1)
                case 'Z' => (letterFreq(25)+=1)
                case _ =>
            }
            count+=1;
        }

        //to count how many letters are actually present
        var num = 0;
        count = 0;
        while(count < 26){
            if(letterFreq(count) != 0)
                num+=1
            count+=1
        }

        //println(num)

        var greatest = letterFreq.max
        var let = letterFreq.indexOf(greatest, 0)
        //println(let) //19
        count = 0
        while(count < tes.length) {
            if (tes(count) == 'T')
                solve=solve.updated(count, 'E')
            count += 1
        }
        //println(solve)

        var c1 = 1
        while (c1 < num){
            letterFreq(let) = 0
            greatest = letterFreq.max
            let = letterFreq.indexOf(greatest, 0)
            //println(let) //3
            count = 0
            while(count < tes.length) {
                if (tes(count) == alpha(let))
                    solve=solve.updated(count, sol(c1))
                count += 1
            }
            //println(solve)
            c1+=1
        }
        println(solve)
        //delete letterFreq
        // letterFreq(19) = 0
        // greatest = letterFreq.max
        // let = letterFreq.indexOf(greatest, 0)
        // println(let) //3
        // count = 0
        // while(count < tes.length) {
        //     if (tes(count) == 'D')
        //         solve=solve.updated(count, 'A')
        //     count += 1
        // }
        // println(solve)

        // letterFreq(3) = 0
        // greatest = letterFreq.max
        // let = letterFreq.indexOf(greatest, 0)
        // println(let) //16
        // count = 0
        // while(count < tes.length) {
        //     if (tes(count) == 'Q')
        //         solve=solve.updated(count, 'T')
        //     count += 1
        // }
        // println(solve)

        // letterFreq(16) = 0
        // greatest = letterFreq.max
        // let = letterFreq.indexOf(greatest, 0)
        // println(let) //0
        // count = 0
        // while(count < tes.length) {
        //     if (tes(count) == 'A')
        //         solve=solve.updated(count, 'O') //could also be I
        //     count += 1
        // }
        // println(solve)

        // letterFreq(16) = 0
        // greatest = letterFreq.max
        // let = letterFreq.indexOf(greatest, 0)
        // println(let) //0
    }
}
