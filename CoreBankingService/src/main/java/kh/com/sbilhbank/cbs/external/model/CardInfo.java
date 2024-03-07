package kh.com.sbilhbank.cbs.external.model;

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
}
