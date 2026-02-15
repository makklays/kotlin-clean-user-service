/** This is a sample Kotlin application. You can run this application from the command line or using an IDE.
 * To run this application, make sure you have the Kotlin compiler installed and set up properly.
 * You can compile and run this application using the following commands:
 *
 * 1. Compile the application:
 *    kotlinc UserServiceApplication.kt -include-runtime -d UserServiceApplication.jar
 *
 * 2. Run the application:
 *    java -jar UserServiceApplication.jar
 *
 * Alternatively, you can run this application directly from an IDE like IntelliJ IDEA by creating a new Kotlin project and adding this file to the project.
 */
fun main(args: Array<String>) {
    println("Hello, Kotlin!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

