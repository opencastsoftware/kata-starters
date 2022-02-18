# Opencast kata template for Scala

## What does this provide?

- A simple Scala project that's setup with `sbt` as the build tool.
- The testing framework used is Scala Test

## Using this template

### Prerequisite requirements

- Scala and sbt

### Coding and running

- When running commands - ensure that this folder (`scala/`) is your working directory
- When coding in IDE - open this folder (`scala/`) in the IDE not the parent folder, otherwise tools like `Bloop` and `IntelliJ` may not be able to give code hints or run formatters

### Key commands

- `compile` - run the Scala compiler on source files
- `test` - runs the Scala compiler on source files, then compiles tests files, then FINALLY it runs the tests
- `~test` - same as above but will do the compilation and testing on file changes. This is great option when doing TDD (which is always right? `:)` )

Note: Try to use `sbt`'s interactive shell as opposed to running one-off commands
