# Opencast kata template for Haskell

## Using this template

- When running commands - ensure that this folder (`haskell/`) is your working directory
- When coding in IDE - open this folder (`haskell/`) in the IDE not the parent folder, otherwise tools may not be able to give code hints or run formatters

## What you will need to build this project

[GHCup](https://www.haskell.org/ghcup/) is the simplest way to install all of the tools that are required in order to use this project.

## What does this provide?

- A simple Haskell project that's set up with cabal as the build tool.
- The testing framework used is [Hspec](https://hspec.github.io/).
- It has been tested with the [Haskell Language Server](https://marketplace.visualstudio.com/items?itemName=haskell.haskell) plugin in VS Code.

## Key commands

- `cabal build` - compile all of the project sources.
- `cabal test --test-show-details=direct` - run the test suite. By default `cabal test` does not print the test suite output unless a test fails. The flag enables printing of the test output without buffering and with colours preserved.
