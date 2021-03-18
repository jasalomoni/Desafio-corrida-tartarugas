package com.one.digitalinnovation.desafiotartatuga

import java.io.EOFException
import java.io.IOException

fun main(args: Array<String>) {

    while (true) {

        try {

            val l = readLine()!!.toInt()
            val v = readLine()!!.split(" ").run{ this.map{it -> it.toInt()}.toIntArray()}
            v.sort()
            when (v.last()) {
                in 0..9 -> println("1")
                in 10..19 -> println("2")
                in 20..50 -> println("3")
                else -> println("Velocidade maior que 50km")
            }

        } catch (f : IOException ) {
            break
        } catch (n : Exception) {
            break
        } catch (e : EOFException) {
            break
        }
    }
}