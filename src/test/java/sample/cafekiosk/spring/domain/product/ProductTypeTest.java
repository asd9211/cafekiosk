package sample.cafekiosk.spring.domain.product;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ProductTypeTest {

    @DisplayName("상품타입이 재고 관련 타입이 아닌지를 체크한다.")
    @Test
    void containStockTypeFalse() {
        // given
        ProductType type = ProductType.HANDMADE;

        // when
        boolean result = ProductType.containsStockType(type);

        // then
        assertThat(result).isFalse();
    }

    @DisplayName("상품타입이 재고 관련 타입인지를 체크한다.")
    @Test
    void containStockTypeTrue() {
        // given
        ProductType type = ProductType.BOTTLE;

        // when
        boolean result = ProductType.containsStockType(type);

        // then
        assertThat(result).isTrue();
    }
}