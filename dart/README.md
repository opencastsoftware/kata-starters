# Opencast kata template for Dart

## What does this provide?

- A simple Dart project that's set up with gradle as the build tool
- Testing using JUnit 5

### Prerequisite requirements

One of the following:
- Dart SDK which can be found at https://dart.dev/get-dart
- Flutter SDK (comes with dart as well) which can be found at https://docs.flutter.dev/get-started/install

### Coding and running

#### Project Structure
- `bin` - This folder holds an entrypoint for the application.
- `lib` - The actual library code for the application. Most of your code will be wrote here.
- `test` - folder for the tests for the application.

#### Caveats
- When running commands - ensure that this folder (`dart/`) is your working directory
- When coding in IDE - open this folder (`dart/`) in the IDE not the parent folder, otherwise tools like `VS Code` may not be able to give code hints or run formatters

### Key commands

- `dart run` - run the app from the entrypoint at `/bin`
- `dart test` - runs dart test tests in the `/test` (new test files need to end with `_test.dart`).
