package kr.leocat.test.http.client

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper

class MyAnotherHttp<T>(private val clazz: Class<T>) {

    companion object {
        inline fun <reified T> simple(): MyAnotherHttp<T> {
            return MyAnotherHttp(T::class.java)
        }
    }

    fun get1(url: String, mapper: ObjectMapper? = null): T {
        val jsonString = khttp.get(url).text
        return (mapper ?: defaultMapper()).readValue(jsonString, clazz)
//        return (mapper ?: defaultMapper()).readValue(jsonString)
    }

    fun <T> get2(url: String, mapper: ObjectMapper? = null, clazz: Class<T>): T {
        val jsonString = khttp.get(url).text
        return (mapper ?: defaultMapper()).readValue(jsonString, clazz)
    }

    fun defaultMapper(): ObjectMapper {
        return jacksonObjectMapper()
    }

}
