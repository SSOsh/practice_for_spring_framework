//package com.jojoldu.book.springboot.web;
//
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController //JSON을 반환하는 컨트롤러로 만들어준다.
//public class HelloController {
//
//    @GetMapping("/hello") // Get의 요청을 받을 수 있는 API 생성
//    public String hello(){
//        return "hello";
//    }
//
//    @GetMapping("/hello/dto")
//    public HelloResponseDto helloDto(@RequestParam("name") String name,
//                                     @RequestParam("amount") int amount) {
//        return new HelloResponseDto(name, amount);
//    }
//
//}