package com.re.session9.controller;

import com.re.session9.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/v1/flash-sale")
@RequiredArgsConstructor
public class FlashSaleController {

    private final InventoryService inventoryService;

    @RequestMapping("/apply-discount")
    public void applyDiscount(@RequestParam("productId") String productId, @RequestParam("qty") int qty) {
        inventoryService.updateStock( productId, qty);
        
    }
}
