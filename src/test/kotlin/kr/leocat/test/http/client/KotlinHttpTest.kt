package kr.leocat.test.http.client

import com.fasterxml.jackson.module.kotlin.*
import kr.leocat.test.http.client.dto.KotlinIpDto
import org.junit.Test

class KotlinHttpTest {

    @Test
    fun testKhttp() {
        val url = "http://httpbin.org/ip"
        val mapper = jacksonObjectMapper()

//        val json = get(url).text
//        val ipDto = mapper.readValue<KotlinIpDto>(json)
//        println(ipDto)

        val chttp = MyHttp()
        val dto = chttp.get<KotlinIpDto>(url, mapper)
        println("Result by kotlin: ${dto}")
    }

}
