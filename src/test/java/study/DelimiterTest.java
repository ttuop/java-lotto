package study;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class DelimiterTest {

	@ParameterizedTest
	@NullSource
	@EmptySource
	void get_default(String input) {
		Delimiter delimiter = new Delimiter(input);

		assertThat(delimiter.get()).isEqualTo(Delimiter.DEFAULT_DELIMITER);
	}

	@ParameterizedTest
	@ValueSource(strings = {"!", ",", ":"})
	void get(String input) {
		Delimiter delimiter = new Delimiter(input);

		assertThat(delimiter.get()).isEqualTo(input);
	}
}
