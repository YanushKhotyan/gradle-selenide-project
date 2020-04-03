
package model.api;

import lombok.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private String email;
    private String locale;
    private String password;

}
