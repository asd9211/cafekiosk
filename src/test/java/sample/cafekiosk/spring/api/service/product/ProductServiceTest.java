package sample.cafekiosk.spring.api.service.product;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import sample.cafekiosk.spring.api.service.product.response.ProductResponse;
import sample.cafekiosk.spring.domain.product.Product;
import sample.cafekiosk.spring.domain.product.ProductRepository;
import sample.cafekiosk.spring.domain.product.ProductSellingStatus;
import sample.cafekiosk.spring.domain.product.ProductType;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @Test
    void getSellingProducts(){
        //given
        Product product = new Product("1", ProductType.BAKERY, ProductSellingStatus.SELLING, "크림빵", 5000);
        doReturn(Arrays.asList(product)).when(productRepository).findAllBySellingStatusIn(ProductSellingStatus.forDisplay());

        //when
        List<ProductResponse> result = productService.getSellingProducts();

        //then
        assertTrue(result.size()>0);


    }
}