// https://open.kattis.com/problems/jibjob
import kotlin.math.*


fun main() {
   val pt = List(readln().toInt()) {
       readln().split(" ").map { it.toDouble() }
   }
   val ans = pt.map { (x1, y1, h) ->
       val collide = pt.filter { it[2] > h }
           .minOf { (x2, y2, h2) ->
               hypot((x2 - x1), (y2 - y1))
           }
       minOf(h, collide).toInt()
   }
   println(ans.joinToString("\n"))
}
