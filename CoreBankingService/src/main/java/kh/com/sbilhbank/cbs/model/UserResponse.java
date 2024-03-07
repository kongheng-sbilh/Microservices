package kh.com.sbilhbank.cbs.model;

import kh.com.sbilhbank.cbs.constant.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private Long id;
    private String name;
    private Gender gender;
    private String address;
    private Long cardId;
    private String cardName;
    private int cvv;
    private LocalDate createDate;
    private LocalDate expireDate;
}
