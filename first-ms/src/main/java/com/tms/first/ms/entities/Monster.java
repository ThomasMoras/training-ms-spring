package com.tms.first.ms.entities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Monster {
    private Integer id;
    private String name;
    private String type;
    private Integer hp;
    private Integer mp;
    private String family;
}
