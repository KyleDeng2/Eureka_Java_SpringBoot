package net.nvsoftware.iProductServivce.service;

import net.nvsoftware.iProductServivce.model.ProductRequest;
import net.nvsoftware.iProductServivce.model.ProductResponse;

public interface ProductService {
    long createProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
