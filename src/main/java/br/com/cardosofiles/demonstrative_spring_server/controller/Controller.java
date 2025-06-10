package br.com.cardosofiles.demonstrative_spring_server.controller;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;


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

    @PostMapping("/bodyParams")
    public String postMethod(@Valid @RequestBody UserModel user) {
        return "Usuário - id: " + user.getId() + " | Nome: " + user.getUser() + " | Telefone: "
                + user.getTelephone();
    }

    @PostMapping("/headersParams")
    public String postHeadersParams(@RequestHeader("name") String name) {

        return "Metodo com headerParams: " + name;
    }

    @PostMapping("/headersParamsList")
    public String postMethodHeadersParamsList(@RequestBody Map<String, String> headers) {
        return "Metodo com headerParams: " + headers.entrySet();
    }

    public record UserRecord(String username) {
    }

    @GetMapping("methodRespondeEntity/{id}")
    public ResponseEntity<Object> methodResponseEntity(@PathVariable Long id) {
        var user = new UserRecord("cardosofiles");

        if (id > 5) {
            return ResponseEntity.status(HttpStatus.OK).body(user);
        }

        return ResponseEntity.badRequest().body("Número menor que 5");
    }

}
