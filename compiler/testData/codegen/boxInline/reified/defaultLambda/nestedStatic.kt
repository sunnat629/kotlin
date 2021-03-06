// IGNORE_BACKEND: JVM_IR
// IGNORE_BACKEND: NATIVE
// FILE: 1.kt
// SKIP_INLINE_CHECK_IN: inlineFun$default
// WITH_RUNTIME
package test

inline fun <reified T> inlineFun(lambda: () -> String = { { T::class.java.simpleName } () }): String {
    return lambda()
}

// FILE: 2.kt
//NO_CHECK_LAMBDA_INLINING
import test.*

class OK

fun box(): String {
    return inlineFun<OK>()
}
