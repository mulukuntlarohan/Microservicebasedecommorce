package com.islandercart.products;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {
        return productService.createProduct(productDTO);
    }

    @GetMapping
    public List<ProductDTO> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductDTO getProductById(@PathVariable("id") String id) {
        return productService.getProductById(id);
    }
    
    @PutMapping("/{id}")
    public ProductDTO updateProductById(@PathVariable("id") String id, @RequestBody ProductDTO productDTO) {
        return productService.updateProduct(id, productDTO);
    }
    
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") String id) {
        productService.deleteProduct(id);
    }
    
    @GetMapping("/category/{category}")
    public List<ProductDTO> getProductsByCategory(@PathVariable("category") String category) {
        return productService.getProductsByCategory(category);
    }
    
    @GetMapping("/categories")
    public ResponseEntity<List<String>> getCategories() {
        List<String> categories = productService.getDistinctCategories();
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
}
