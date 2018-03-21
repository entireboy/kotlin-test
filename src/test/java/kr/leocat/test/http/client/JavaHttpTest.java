package kr.leocat.test.http.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.leocat.test.http.client.dto.IpDto;
import org.junit.Test;

public class JavaHttpTest {


    @Test
    public void testGet() {
        String url = "http://httpbin.org/ip";
        ObjectMapper mapper = new ObjectMapper();

        Chttp cttp = new Chttp();
//        IpDto ipDto = cttp.<IpDto>get(url, mapper);
//        System.out.println("Result by java: " + ipDto);
    }
}
