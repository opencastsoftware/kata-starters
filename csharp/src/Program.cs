using System;

namespace src
{
    class Program
    {
        static void Main(string[] args)
        {
            var calc = new Calc();
            var result = calc.Increment(1);

            Console.WriteLine($"Increment: {result}");
        }
    }
}
