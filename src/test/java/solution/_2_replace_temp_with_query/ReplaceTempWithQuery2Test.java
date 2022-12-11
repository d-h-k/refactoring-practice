package solution._2_replace_temp_with_query;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import problem._2_replace_temp_with_query.ReplaceTempWithQuery1;
import problem._2_replace_temp_with_query.ReplaceTempWithQuery2;

import static org.assertj.core.api.Assertions.assertThat;


public class ReplaceTempWithQuery2Test {


    @DisplayName("quantity * price 값이 1000 이하의 경우")
    @Test
    public void test1() {
        //given
        int quantity = 1;
        int itemPrice = 1000;
        problem._2_replace_temp_with_query.ReplaceTempWithQuery1 replaceTempWithQuery1 = new problem._2_replace_temp_with_query.ReplaceTempWithQuery1(quantity, itemPrice);
        // when - then
        assertThat(replaceTempWithQuery1.getPrice()).isEqualTo(980.0);
    }

    @DisplayName("quantity * price 값이 1000 초과일 때")
    @Test
    void test2() {
        //given
        int quantity = 1;
        int itemPrice = 2000;
        problem._2_replace_temp_with_query.ReplaceTempWithQuery1 replaceTempWithQuery1 = new ReplaceTempWithQuery1(quantity, itemPrice);
        // when - then
        assertThat(replaceTempWithQuery1.getPrice()).isEqualTo(1900.0);
    }
}