package com.dailycodework.dreamshops.service.product;

import com.dailycodework.dreamshops.model.Product;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import java.util.List;

public interface IProductService {
    Product addProduct(Product product);
    Product  getProductById(Long id);
    void  deleteProductById(Long id);
    void updateProduct(Product product,Long productId);
    List<Product> getAllProducts();
    List<Product> getProductsByCategory(String category);
    List<Product> getProductsByBrand(String brand   );
    List<Product> getProductsByCategoryAndBrand(String category,String brand);

}
