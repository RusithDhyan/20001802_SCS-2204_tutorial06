//import scala.io.StdIn.readInt
object a extends App{
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
    val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)

    val ct=cipher(E,s,5,alphabet)
    val pt=cipher(D,ct,5,alphabet)
    println(ct);






}   