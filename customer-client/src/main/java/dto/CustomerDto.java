package dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class CustomerDto {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private boolean status;
}
