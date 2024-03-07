package kh.com.sbilhbank.cbs.model;

import kh.com.sbilhbank.cbs.constant.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.function.Supplier;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private Gender gender;
    private String address;

    public static Supplier<List<User>> users = () -> List.of(
        new User(1L, "Bruce Wayne", Gender.MALE, "Gotham"),
        new User(2L, "Bruce Banner", Gender.FEMALE, "New York"),
        new User(3L, "Jonh Wick", Gender.MALE, "New York"),
        new User(4L, "Tony Stark", Gender.CUSTOM, "New York"),
        new User(5L, "Odin Thor", Gender.MALE, "Asguard")
    );
}
