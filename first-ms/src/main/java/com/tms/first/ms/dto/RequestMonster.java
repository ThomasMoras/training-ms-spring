package com.tms.first.ms.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public record RequestMonster(String name, String type, Integer hp, Integer mp, String family) {

}
