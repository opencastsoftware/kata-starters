module fsharp

open NUnit.Framework
open Library
open Arithmetic

[<SetUp>]
let Setup () =
    ()

[<Test>]
let Test1 () =
    let x = add 1 2
    Assert.That(x, Is.EqualTo(3))

[<Test>]
let Test2 () =
    let x = sub 2 1
    Assert.That(x, Is.EqualTo(1))
