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
	@Test
	
	public void 空文字をキャメルケースで大文字にする() {
		SnakeCamelUtil  scu=new SnakeCamelUtil();
		String expected = " ";
		String actual = scu.capitalize(" ");
		assertThat(actual,is(expected));
	}
	@Test
	public void aをAに(){
		SnakeCamelUtil  scu=new SnakeCamelUtil();
		String expected = "A";
		String actual = scu.capitalize("a");
		assertThat(actual,is(expected));
	}
	@Test
	public void xyzをXyzに(){
		SnakeCamelUtil  scu=new SnakeCamelUtil();
		String expected = "Xyz";
		String actual = scu.capitalize("xyz");
		assertThat(actual,is(expected));
	}
@Test
	
	public void 空文字をキャメルケースで小文字にする() {
		SnakeCamelUtil  scu=new SnakeCamelUtil();
		String expected = " ";
		String actual = scu.uncapitalize(" ");
		assertThat(actual,is(expected));
	}
@Test
public void Aをaに(){
	SnakeCamelUtil  scu=new SnakeCamelUtil();
	String expected = "a";
	String actual = scu.uncapitalize("A");
	assertThat(actual,is(expected));
}
@Test
public void abcをAbcにする() {
	SnakeCamelUtil  scu=new SnakeCamelUtil();
	String expected = "Abc";
	String actual = scu.snakeToCamelcase("abc");
	assertThat(actual,is(expected));
}
@Test
public void 単語の頭文字をキャメルケースで大文字にする() {
	SnakeCamelUtil  scu=new SnakeCamelUtil();
	String expected = "AbcDef";
	String actual = scu.snakeToCamelcase("abc_def");
	assertThat(actual,is(expected));
}
@Test
public void 頭文字をキャメルケースで大文字にする() {
	SnakeCamelUtil  scu=new SnakeCamelUtil();
	String expected = "AbcDefGh";
	String actual = scu.snakeToCamelcase("abc_def_gh");
	assertThat(actual,is(expected));
}
@Test
public void キャメルケースで大文字にする() {
	SnakeCamelUtil  scu=new SnakeCamelUtil();
	String expected = "AbcDefGh";
	String actual = scu.snakeToCamelcase("abc__def__gh");
	assertThat(actual,is(expected));
}
@Test
public void 大文字にする() {
	SnakeCamelUtil  scu=new SnakeCamelUtil();
	String expected = "AbcDef";
	String actual = scu.snakeToCamelcase("_abc_def__");
	assertThat(actual,is(expected));
}
@Test
public void Abcをabcにする() {
	SnakeCamelUtil  scu=new SnakeCamelUtil();
	String expected = "abc";
	String actual = scu.camelToSnakecase("Abc");
	assertThat(actual,is(expected));
}
@Test
public void 小文字にする() {
	SnakeCamelUtil  scu=new SnakeCamelUtil();
	String expected = "abc_def";
	String actual = scu.camelToSnakecase("AbcDef");
	assertThat(actual,is(expected));
}
@Test
public void 頭文字を小文字にする() {
	SnakeCamelUtil  scu=new SnakeCamelUtil();
	String expected = "abc_def_gh";
	String actual = scu.camelToSnakecase("AbcDefGh");
	assertThat(actual,is(expected));
}


}
