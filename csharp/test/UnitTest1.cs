using Microsoft.VisualStudio.TestTools.UnitTesting;
using src;

namespace csharp
{
    [TestClass]
    public class UnitTest1
    {
        [TestMethod]
        public void TestMethod1()
        {
            // Arrange
            var calc = new Calc();

            // Act
            var result = calc.Increment(1);

            // Assert
            Assert.AreEqual(result, 2);
        }
    }
}
