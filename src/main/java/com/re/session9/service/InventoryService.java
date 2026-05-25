package com.re.session9.service;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InventoryService {
    private static final Logger logger = LoggerFactory.getLogger(InventoryService.class);

    public void updateStock(String productId, int qty) {

        logger.info("Bắt đầu cập nhật kho cho SP: {}, SL: {}", productId, qty);

    }
}
