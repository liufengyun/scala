object Test {
  abstract class A {
    Console.print("A");
    val x: Int;
    val y: Int = {Console.print("y"); x + 1}
  }
  class B extends A {
    Console.print("B");
    val z = 0;
    val x = 4 + z
  }
  def main (args: Array[String]): Unit = {
    Console.print((new B).y);
  }
}