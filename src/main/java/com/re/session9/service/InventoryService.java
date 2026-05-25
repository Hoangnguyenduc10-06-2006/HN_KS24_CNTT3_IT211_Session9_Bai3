package com.re.session9.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InventoryService {

    public void updateStock(String productId, int qty) {

        log.info("Bắt đầu cập nhật kho cho SP: {}, SL: {}", productId, qty);

    }
}
