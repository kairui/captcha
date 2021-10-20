package com.ikairui.captcha.common.annotations;

import org.springframework.http.ResponseEntity;

public interface Response {
    static <B> ResponseEntity<?> ok(B body) {
        return ResponseEntity.ok(body);
    }

    static <B> ResponseEntity<?> accepted(B body) {
        return ResponseEntity.accepted().body(body);
    }
}
