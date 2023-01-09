package com.nimko.shppmentorpracktic7.dto;

import com.nimko.shppmentorpracktic7.utils.State;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Schema(name = "Схема ToDoDto", description = "DTO для фронтенду!")
public class ToDoDto {
    @NotNull
    @NotEmpty
    private String toDo;
    @Future
    private LocalDateTime plannedDateTime;
    @NotNull
    private State state;

}
