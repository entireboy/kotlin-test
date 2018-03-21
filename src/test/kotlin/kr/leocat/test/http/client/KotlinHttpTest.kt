package kr.leocat.test.http.client

import com.fasterxml.jackson.module.kotlin.*
import kr.leocat.test.http.client.dto.IpDto
import khttp.get
import org.junit.Test

class KotlinHttpTest {

    @Test
    fun testKhttp() {
        val url = "http://httpbin.org/ip"
        val mapper = jacksonObjectMapper()

//        val json = get(url).text
//        val ipDto = mapper.readValue<IpDto>(json)
//        println(ipDto)

        val chttp = Chttp()
        val dto = chttp.get<IpDto>(url, mapper)
        println("Result by kotlin: ${dto}")
    }

}
