import kotlin.test.Test

class CompilerTest {
    private fun hello(){
        println("Hello!")
    }
    private fun main() {
        hello()
    }

    @Test
    fun test(){
        main()
    }
}