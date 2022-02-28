# Opencast kata template for F#

## What does this provide?

- A simple F# project that uses dotnet as the build tool.
- The testing framework is [NUnit](https://nunit.org).

## Using this template

### Prerequisite requirements

- [.NET 6.0](https://dotnet.microsoft.com/en-us/download/dotnet/6.0)

### Coding and running

- When running commands - ensure that this folder (`fsharp/`) is your working directory

### Key commands

- `dotnet build` - build the `src`/`test` files.
- `dotnet run --project src/App` - run the app
- `dotnet watch --project src/App run` - compile/build/run the project and redo when any changes are made.
- `dotnet test` - run the tests.
- `dotnet watch test --project ./test` - run the tests and redo when any changes are made.
