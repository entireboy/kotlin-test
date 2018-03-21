package kr.leocat.test.http.client

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

class Chttp {

    inline fun <reified T : Any> get(url: String, mapper: ObjectMapper? = null): T {
        val jsonString = khttp.get(url).text
//        return (mapper ?: defaultMapper()).readValue(jsonString, T::class.java)
        return (mapper ?: defaultMapper()).readValue(jsonString)
    }

    fun defaultMapper(): ObjectMapper {
        return jacksonObjectMapper()
    }

}
