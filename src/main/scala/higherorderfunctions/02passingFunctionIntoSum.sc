def sum(f: Int => Int, a: Int, b: Int): Int =
  if (a > b) 0
  else f(a) + sum(f, a + 1, b)


def sumInts(a: Int, b: Int) = sum(id, a, b)
def sumCubes(a: Int, b: Int) = sum(cube, a, b)
def sumFactorials(a: Int, b: Int) = sum(fact, a, b)


def id(x: Int): Int = x
def cube(x: Int): Int = x * x * x
def fact(x: Int): Int = if (x == 0) 1 else fact(x - 1)



def sumInts2(a: Int, b: Int) = sum(x => x, a, b)
def sumCubes2(a: Int, b: Int) = sum(x => x * x * x, a, b)


/*
An anonymous function (x1 : T1, ..., xn : Tn) ? E can always be
expressed using def as follows:
def f(x1 : T1, ..., xn : Tn) = E; f
*/
(x: Int) => x * x * x


{
  def f(x: Int): Int =  x * x * x; f _
}



{
  def f(x: Int): Int = {
    x * x * x
  }
  f _
}

