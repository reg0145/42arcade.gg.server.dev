package io.pp.arcade.v1.domain.currentmatch.dto;

import io.pp.arcade.v1.domain.game.dto.GameDto;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CurrentMatchRemoveDto {
    private Integer userId;
    private Integer slotId;
    private GameDto game;

    @Override
    public String toString() {
        return "CurrentMatchRemoveDto{" +
                "userId=" + userId +
                ", slotId=" + slotId +
                ", game=" + game +
                '}';
    }
}
