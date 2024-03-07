package kh.com.sbilhbank.cms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Supplier;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardInfo {
    private Long id;
    private Long userId;
    private String name;
    private int cvv;
    private LocalDate createDate;
    private LocalDate expireDate;

    public static Supplier<List<CardInfo>> cards = () -> List.of(
        new CardInfo(9998765435788765L, 1L, "BRUCE_WAYNE", 123, LocalDate.of(2023, 1, 20), LocalDate.of(2030, 12, 1)),
        new CardInfo(8898746543218878L, 2L, "BRUCE_BANNER", 123, LocalDate.now(), LocalDate.of(2030, 2, 15)),
        new CardInfo(1112345432123456L, 3L, "JOHN_WICK", 123, LocalDate.of(2023, 3, 10), LocalDate.of(2030, 12, 1)),
        new CardInfo(9998876545678909L, 4L, "TONY_STARK", 123, LocalDate.of(2023, 5, 11), LocalDate.of(2030, 12, 1)),
        new CardInfo(6667548765432145L, 5L, "ODIN_THOR", 123, LocalDate.of(2023, 9, 23), LocalDate.of(2030, 12, 1))
    );
}
