package kr.leocat.test.http.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

public class ChttpTest {

    @Test
    public void testGet() {
        String url = "http://httpbin.org/ip";
        ObjectMapper mapper = new ObjectMapper();

//        Chttp cttp = new Chttp();
//        IpDto ipDto = cttp.<IpDto>get(url, mapper);

//        Dto dto = Chttp.Companion
//                .simple()
////            .withRetryStrategy()
//                .get("http://httpbin.org/ip", mapper);

//        Chttp.Companion.simple().get(url, mapper);

//        System.out.println(dto);
//        Chttp.Companion.get("", null);
//        Chttp.Companion.get("http://httpbin.org/ip", null);
//        Chttp.Companion.<IpDto>get("http://httpbin.org/ip");
    }

}
