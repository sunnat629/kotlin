package kotlin


//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//
// Generated from input file: src/kotlin/JLangIterablesJVM.kt
//


import java.util.*

/** Copies all elements into a [[SortedSet]] */
public inline fun <in T> Array<T>.toSortedSet() : SortedSet<T> = toCollection(TreeSet<T>())

