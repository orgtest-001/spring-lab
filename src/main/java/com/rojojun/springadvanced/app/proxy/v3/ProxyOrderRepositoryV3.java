package com.rojojun.springadvanced.app.proxy.v3;

import org.springframework.stereotype.Repository;

@Repository
public class ProxyOrderRepositoryV3 {
    public void save(String itemId) {
        // 저장 로직
        if (itemId.equals("ex")) {
            throw new IllegalStateException("예외 발생!");
        }
        sleep(1000);
    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
