package com.tms.first.ms.controllers;

import com.tms.first.ms.dto.RequestMonster;
import com.tms.first.ms.services.MonsterService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/monsters")
public record MonsterController(MonsterService monsterService) {

    @PostMapping
    public void CreateMonster(@RequestBody RequestMonster requestMonster) {
        log.info("new monster : {}", requestMonster);
        monsterService.CreateMonster(requestMonster);
    }
}
