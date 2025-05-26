package com.islandercart.users;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private String id;
    private String name;
    private String email;
    @JsonIgnore
    private String password;
}
