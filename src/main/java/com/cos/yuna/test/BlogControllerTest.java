package com.cos.yuna.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

 //스프링이 com.cos.yuna 패키지 이하를 스캔해서 모든파일을 메모리에 new 하는것은 아님
 //특정 어노테이션이 붙어있는 클래스 파일을 new해서(IOC) 스프링 컨테이너에 관리해줌
@RestController
public class BlogControllerTest {
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hell() {
		return "<h1>hello spring boot<h1>"; 
	}
}
