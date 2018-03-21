package kr.leocat.test.http.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import kr.leocat.test.http.client.dto.JavaIpDto;
import org.junit.Test;

public class JavaHttpTest {

    @Test
    public void testGet() {
        String url = "http://httpbin.org/ip";
        ObjectMapper mapper = new ObjectMapper();

        MyHttp myHttp = new MyHttp();
//        KotlinIpDto ipDto = myHttp.anotherGet(url, mapper, KotlinIpDto.class);
        JavaIpDto ipDto = myHttp.anotherGet(url, mapper, JavaIpDto.class);
//        KotlinIpDto ipDto = myHttp.<KotlinIpDto>get(url, mapper);
        System.out.println("Result by java: " + ipDto);
    }

}
