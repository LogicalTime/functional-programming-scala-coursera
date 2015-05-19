def sum(f: Int => Int): (Int, Int) => Int = {
  def sumF(a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sumF(a + 1, b)
  sumF
}


def sumInts(a: Int, b: Int) = sum(x => x)
def sumCubes(a: Int, b: Int) = sum(x => x*x*x)
def sumFactorials(a: Int, b: Int) = sum(fact)

def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)


/*


def f(args1)...(argsn?1) = {def g(argsn) = E; g}

*/

//def f(arg1: Int => Int)(a: Int, b: Int): Int =
//  if (a > b) 0 else arg1(a) + f(arg1)(a + 1, b)
// TODO Why doesn't this work?
//def f(arg1: Int => Int)(a: Int, b: Int): Int =
//{def g(a: Int, b: Int)= if (a > b) 0 else arg1(a) + f(arg1)(a + 1, b); g}



def sum_TailRec(f: Int => Int)(a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = {
    if (a > b) acc
    else loop( a+1, f(a) + acc)
  }
  loop(a, 0)
}