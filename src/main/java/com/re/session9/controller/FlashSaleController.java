package com.re.session9.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api/v1/flash-sale")
@RequiredArgsConstructor
public class FlashSaleController {

    private final FlashSaleService flashSaleService;

    @RequestMapping("/apply-discount")
    public void applyDiscount(@RequestParam("userId") String userId, @RequestParam("code") String code) {
        flashSaleService.applyDiscount(userId, code);
    }
}
