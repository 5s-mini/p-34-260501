package com.back.global.extenstions

fun <T : Any> T?.getOrThrow(): T {
    return this ?: throw NoSuchElementException()
}