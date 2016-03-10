
import com.github.ghik.silencer.silent

object Silence {
  case class Wrapper(i: Option[Int])
  val i: java.lang.Integer = 1
  // Suspicious application of an implicit view (scala.this.Predef.Integer2int) in the argument to Option.apply.
  Wrapper(Option(i)): @silent
}

