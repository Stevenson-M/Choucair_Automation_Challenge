# Choucair Automation Challenge

This project is an automation test suite for the recruitment process using Serenity BDD.

## Requirements

- Java 11
- Gradle
- Google Chrome browser
- ChromeDriver compatible with the installed version of Chrome

## Project Structure

- `src/main/java`: Contains the main source code.
    - `org/choucair/questions`: Contains classes that implement questions to verify the application's state.
    - `org/choucair/tasks`: Contains classes that implement tasks that actors can perform.
    - `org/choucair/userInterfaces`: Contains classes that define the user interface elements.

- `src/test/java`: Contains the automated tests.
    - `stepDefinitions`: Contains the Cucumber step definitions.

- `src/test/resources`: Contains resource files for the tests.
    - `features`: Contains the Cucumber feature files.

## Setup

1. Clone the repository:
    ```sh
    git clone <https://github.com/Stevenson-M/Choucair_Automation_Challenge.git>
    cd <Choucair_Automation_Challenge>
    ```

2. Set up `ChromeDriver` on your system. Ensure the `ChromeDriver` version is compatible with your version of Google Chrome.