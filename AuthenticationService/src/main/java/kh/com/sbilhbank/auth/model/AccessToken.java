package kh.com.sbilhbank.auth.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.function.Supplier;

@Getter
@AllArgsConstructor
public class AccessToken {

    private Long userId;
    private String token;

    public static Supplier<List<AccessToken>> availableTokens = () -> List.of(
      new AccessToken(1L, "ZRFrzEpx9zpBUxsADIfbM6yoxhrErXUwQkgxIQIxGgjZW2o9pcgz1BQ9EG1pcvyix"),
      new AccessToken(2L, "RW2AjHdpCYCrFt0TcuyRpegXsvZoy4I9DUCq3hCoFhE1Lle0PDwfRlYHC3Yy2ts4"),
      new AccessToken(3L, "qlwmdJoYrYlLEfbs5pGVF64sj9Ru8JYcZzSalrXSz32iU61l4LLyqCKLFzdY6wZD"),
      new AccessToken(4L, "5svS3bUxxCh1Lv4sA7Gq6SBaLoKOXLf7OMm5I1VZg4Hz6HKEo2CEQxDXLFoQPO25"),
      new AccessToken(5L, "9fAwrqy6KaR4H5O1KWBU6b06cDZMT9vVo9u455bsxVLZzKMza4vaFqfqX2vsaqhG")
    );
}
