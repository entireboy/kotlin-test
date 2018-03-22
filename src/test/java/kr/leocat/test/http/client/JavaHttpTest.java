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
//        KotlinIpDto ipDto = myHttp.get2(url, mapper, KotlinIpDto.class);
        JavaIpDto ipDto = myHttp.get2(url, mapper, JavaIpDto.class);
//        KotlinIpDto ipDto = myHttp.<KotlinIpDto>get1(url, mapper);
        System.out.println("Result by java: " + ipDto);
    }

}
