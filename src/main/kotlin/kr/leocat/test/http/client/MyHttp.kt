package kr.leocat.test.http.client

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

class MyHttp {

    inline fun <reified T : Any> get1(url: String, mapper: ObjectMapper? = null): T {
        val jsonString = khttp.get(url).text
//        return (mapper ?: defaultMapper()).readValue(jsonString, T::class.java)
        return (mapper ?: defaultMapper()).readValue(jsonString)
    }

    fun <T> get2(url: String, mapper: ObjectMapper? = null, clazz: Class<T>): T {
        val jsonString = khttp.get(url).text
        return (mapper ?: defaultMapper()).readValue(jsonString, clazz)
    }

//    fun <T> get3(url: String, mapper: ObjectMapper? = null): T {
//        val jsonString = khttp.get(url).text
//        return (mapper ?: defaultMapper()).readValue(jsonString, T::class.java)
//    }

//    fun <T> get4(url: String, mapper: ObjectMapper? = null): T {
//        val jsonString = khttp.get(url).text
//        return (mapper ?: defaultMapper()).readValue<T>(jsonString)
//    }

    fun defaultMapper(): ObjectMapper {
        return jacksonObjectMapper()
    }

}
