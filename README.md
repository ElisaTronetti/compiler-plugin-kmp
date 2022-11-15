# Kotlin multiplatform IR compiler plugin

## The goal
The goal of this compiler plugin is to modify at compile time every function declaration,
inserting a _println_ with the function name + "declaration".  
  
To be easier to understand, if you try to run this simple snippet of code:
```
fun test(){
    println("Hello!")
}

fun main() {
    test()
}
```
The result shown in the console will be:
```
main declaration
test declaration
Hello!
```
  
## Project structure
- **gradle-ir-plugin**: in this subproject is where it is declared the gradle plugin, which expose the actual compiler plugin;
- **compiler-ir-plugin**: this is the subproject that creates and modify the IR. If you want to change for example the content of the println, you will do it here;
- **kmp-sample**: this is a gradle project that uses the compiler plugin. This is a _kotlin multiplatform_ project, and the targets are Kotlin\Native, Kotlin\JS and Kotlin\JVM.

## Requirements
This project works only when using Kotlin > v1.7.0.

## Special thanks
Since the documentation is so little about compiler plugins, I think it is necessary to link the [Repository](https://github.com/bnorm/debuglog) I used as a
reference for this project. Thank you so much for the work you have done!