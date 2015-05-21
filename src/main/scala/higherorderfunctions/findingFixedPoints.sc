import scala.math.abs
val tolerance = 0.0001
def isCloseEnough(x: Double, y: Double) =
  abs((x - y) / x) / x < tolerance
def fixedPoint(f: Double => Double)(firstGuess: Double) = {
  def iterate(guess: Double): Double = {
    val next = f(guess)
    if (isCloseEnough(guess, next)) next
    else iterate(next)
  }
  iterate(firstGuess)
}
def sqrt1(x: Double) = fixedPoint(y => x / y)(1.0)
def sqrt2(x: Double) = fixedPoint(y => (y + x / y) / 2)(1.0)
sqrt2(2)
def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2
//my problem here is that I don't see the information/pointer x going
// into the average damp function yet the average damp function uses
// x in the definition.
// I guess since you are taking in a function, you have implicit access
// to all the variables that were passed into that function.
// Thus we should see the x as the parameter list of the function passed in.
// Infact if you are returning the same type of function you'll need to list
// all the parameters of the original function and in the right order.
// Otherwise that info is lost or messed up in some way.
def sqrt3(x:Double) = fixedPoint(averageDamp(y=> x/y))(1.0)
sqrt3(2)
def x = 4
((y:Double) => x/y)
((y:Double) => x/y)(3)


