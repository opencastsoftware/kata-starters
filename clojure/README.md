# Opencast kata template for Clojure

## What does this provide?

- A simple Clojure project that's setup with the Clojure CLI as the build tool.
- The test runner is Kaocha, and the test framework used is clojure.test.

## Using this template

### Prerequisite requirements

A Java 8+ JDK and the Clojure CLI (clj).

### Coding and running

- When running commands - ensure that this folder (`clojure/`) is your working directory
- When coding in IDE - open this folder (`clojure/`) in the IDE not the parent folder, otherwise tools like `IntelliJ` may not be able to give code hints or run formatters

### Key commands

- `./bin/kaocha` - run the unit tests
- `./bin/kaocha --watch` - run the unit tests in watch mode