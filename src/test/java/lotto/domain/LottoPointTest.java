package lotto.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class LottoPointTest {

    @Test
    void testEquals() {
        assertThat(new LottoPoint(1)).isEqualTo(new LottoPoint(1));
        assertThat(new LottoPoint(1, true)).isEqualTo(new LottoPoint(1, true));

        assertThat(new LottoPoint(1)).isNotEqualTo(new LottoPoint(2));
        assertThat(new LottoPoint(1, true)).isNotEqualTo(new LottoPoint(1, false));
    }

    @Test
    void testHashCode() {
        assertThat(new LottoPoint(1).hashCode()).hasSameHashCodeAs(new LottoPoint(1));
        assertThat(new LottoPoint(1, true).hashCode()).hasSameHashCodeAs(new LottoPoint(1, true));
    }

}
