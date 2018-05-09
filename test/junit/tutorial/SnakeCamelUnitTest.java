package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import snakecamel.SnakeCamelUtil;

public class SnakeCamelUnitTest {

	@Test
	public void スネークケースの単語の頭文字をキャメルケースで大文字にする() {
		SnakeCamelUtil  scu=new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = scu.snakeToCamelcase("abc_def");
		assertThat(actual,is(expected));
	}
	@Test
	public void キャメルケースの単語の頭文字をスネークケースで小文字にする(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def";
		String actual = scu.camelToSnakecase("AbcDef");
		assertThat(actual,is(expected));
	}
}
