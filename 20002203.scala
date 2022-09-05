import scala.io.StdIn.readInt;
import scala.io.StdIn.readLine;

object CeasarCipher{

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    val a_size = alphabet.size;

    def encryption(i: Int): Unit = { 
        
        print("How many shifts? ");

        val shift = (readInt()*i + a_size) % a_size;
         
        val secretMessage =readLine("Enter secret message: ").toUpperCase(); 

        val outputText = secretMessage.map( (ch: Char) => { 
 
            val x = alphabet.indexOf(ch)
            
            if (x == -1){
               return ch;
            }
            else{
                return alphabet((x + shift) % a_size);
           } 
        });
 
        println("Message :"+outputText);

    } 
   
   def main(args: Array[String]) :Unit={

        println("\n\t1)  Encryption \n\t2)  Decryption ");
        
        println("Enter your option:");
        var opt: Int = readInt();
        opt match{
            case 1 => Encryption(1);
            case 2 => Encryption(-1); 
            case _ => println("Invalid entry");
        }
    }
}
