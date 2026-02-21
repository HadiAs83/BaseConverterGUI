# BaseConverterGUI

A **JavaFX** application for converting numbers between different bases
(2 to 16).\
This program supports negative numbers and both uppercase/lowercase
letters (`A-F / a-f`).\
It features a Persian (Farsi) right-to-left (RTL) user interface.

------------------------------------------------------------------------

## Features

-   Supports negative numbers\
-   Select input and output bases using a **ComboBox** (from 2 to 16)\
-   Accepts both uppercase and lowercase letters (`A-F / a-f`)\
-   Persian right-to-left user interface\
-   Displays usage rules and notes at the bottom of the window\
-   Attractive color scheme with clear result display

------------------------------------------------------------------------

## Requirements

-   **JDK 21**\
-   **JavaFX 21**

You can download JavaFX from the official website:\
https://openjfx.io/

------------------------------------------------------------------------

## Project Paths (Example)

-   Source file path:\
    `path/to/your/project/BaseConverterGUI.java`

-   JavaFX SDK path:\
    `path/to/javafx-sdk/lib`

-   JAR file path:\
    `path/to/your/project/BaseConverterGUI.jar`

> Replace the paths above with the correct paths on your system.

------------------------------------------------------------------------

## Compile and Run

### Windows, macOS, and Linux

#### 1️ Compile the code:

``` bash
cd path/to/your/project

# Windows
javac --module-path "path\to\javafx-sdk\lib" --add-modules javafx.controls BaseConverterGUI.java

# macOS / Linux (adjust the path to your system)
# javac --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls BaseConverterGUI.java
```

------------------------------------------------------------------------

#### 2️ Run the program using the compiled class:

``` bash
# Windows
java --module-path "path\to\javafx-sdk\lib" --add-modules javafx.controls BaseConverterGUI

# macOS / Linux
# java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls BaseConverterGUI
```

------------------------------------------------------------------------

#### 3️ Run the program using the JAR file:

``` bash
# Windows
java --module-path "path\to\javafx-sdk\lib" --add-modules javafx.controls -jar BaseConverterGUI.jar

# macOS / Linux
# java --module-path /path/to/javafx-sdk/lib --add-modules javafx.controls -jar BaseConverterGUI.jar
```
