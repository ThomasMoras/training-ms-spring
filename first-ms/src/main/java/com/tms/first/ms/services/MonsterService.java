package com.tms.first.ms.services;

import com.tms.first.ms.dto.RequestMonster;
import com.tms.first.ms.entities.Monster;

public record MonsterService() {

    public void CreateMonster(RequestMonster requestMonster) {
        Monster monster = Monster.builder()
                .name(requestMonster.name())
                .type(requestMonster.type())
                .hp(requestMonster.hp())
                .mp(requestMonster.mp())
                .family(requestMonster.family())
                .build();
    }
}
