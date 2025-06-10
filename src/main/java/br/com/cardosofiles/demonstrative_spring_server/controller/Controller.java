package br.com.cardosofiles.demonstrative_spring_server.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/controller")
public class Controller {

    @GetMapping("/pathVariable/{id}")
    public String getMethodPathVariable(@PathVariable String id) {
        return "O usuário é : " + id;
    }

    @GetMapping("/queryParams")
    public String getMethodQueryParams(@RequestParam String id) {
        return "O paramétro da rota é :" + id;
    }

    @GetMapping("queryParamsMap")
    public String getMethodQueryParamsMap(@RequestParam Map<String, String> allParams) {
        return "O paramétro da rota queryMap é :" + allParams.entrySet();
    }

}
