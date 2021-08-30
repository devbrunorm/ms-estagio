package br.com.deal.estagio.agosoto.nid.controllers;

import br.com.deal.estagio.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@Slf4j
@RestController
@RequestMapping
public class UserController {
    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public String find() {
        log.info("find");
        return "ok deal";
    }

    // Método GET da API
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String findById(@PathParam("id") Long id) {
        log.info("findById{}", id);
        return "ok deal by id";
    }

    // Método POST da API
    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public String insert(@RequestBody UserDTO user) {
        log.info("insert {} ", user.getNome());
        return "ok deal by id";
    }

    // Método PUT da API
    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String update(@PathParam("id") Long id, @RequestBody UserDTO user){
        log.info("update {} {} ", id, user);
        return "ok deal by id";
    }

    // Método DELETE da API
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String delete(@PathParam("id") Long id) {
        log.info("delete {}", id);
        return "ok deal by id";
    }

    // Método PATCH da API
    @DeleteMapping("/{id}/bloquear")
    @ResponseStatus(HttpStatus.OK)
    public String bloqueia(@PathParam("id") Long id) {
        log.info("bloqueia {}", id);
        return "bloqueia";
    }

    // Método PATCH da API
    @DeleteMapping("/{id}/desbloquear")
    @ResponseStatus(HttpStatus.OK)
    public String desbloqueia(@PathParam("id") Long id) {
        log.info("desbloqueia {}", id);
        return "desbloqueia";
    }
}
